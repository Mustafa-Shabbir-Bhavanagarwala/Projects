
from agents.agentworldmodel import GOLD, DIRT

from agents.intents import intent_agent_info, intent_find_dirt, intent_find_gold
from agents.intents import intent_turn, intent_forward_backward, intent_goto, intent_go_home
from agents.intents import intent_suck_dirt_at, intent_suck_some_dirt, intent_get_gold_at, intent_get_some_gold
from agents.intents import intent_unknown,intent_query_square,intent_move_dirt,intent_move_gold,intent_get_all_gold,intent_suck_some_dirt,intent_praise,intent_move_object

from agents.coord import to_coord, is_coord
import string

####################
            
def preprocess(cmd): 
    cmd = ''.join(ch for ch in cmd if ch not in set(string.punctuation))
    return [w.lower() for w  in cmd.split()] 

####################
 
        
        
class CommandProcessor:
    def __init__(self, agent, worldmodel, log):
        self.agent = agent
        self.worldmodel = worldmodel
        self.log = log
        
        # Initialize term_categories as an empty dictionary
        self.term_categories = {}

        # Add categories to term_categories
        self.term_categories['in'] = 'in'
        self.term_categories['what'] = 'what'
        self.term_categories['is'] = 'is'
        
        # Define synonyms and other term categories
        self.term_categories.update({
            'forward': 'move_direction',
            'backward': 'move_direction',
            'around': 'turn_direction',
            'left': 'turn_direction',
            'right': 'turn_direction',
            'around': 'turn_direction',
            'bring': 'bring',
            'fetch': 'bring',
            'get': 'bring',
            'find': 'find',
            'gold': 'gold',
            'dirt': 'dirt',
            'home': 'home',
            'where': 'where',
            'how': 'how',
            'you': 'you',
            'turn': 'turn',
            'suck': 'suck',
            'mine': 'mine',
            'go': 'move',
            'move': 'move',
            'unload': 'unload'
        })

                           
    def interpret_command(self, cmd):
        term_presence = {}   
        for word in cmd.split():
            if is_coord(word):
                term_presence['coord'] = to_coord(word)
            if word.isdigit():
                term_presence['number'] = int(word) 
                
        # Preprocessing the command breaks it into words, and also 
        # removes non-letters.  It is severe preprocessing!
        # After this loop, all information about the command is in
        # the term_categories dictionary
        
        for term in preprocess(cmd):
            if term in self.term_categories:
                term_presence[self.term_categories[term]] = term
     
        # The intent_* functions translate parameters into "command sequences" that
        # can be executed by the agent
        
        command_sequence = None  
        if 'move' in term_presence and 'coord' in term_presence:
            # Check if there is a target location for moving
            if 'to' in term_presence:
                # Parse the target location
                destination = term_presence.get('to_coord', None)
                if destination:
                    command_sequence = intent_move_object(self, term_presence['coord'], destination)
            else:
                command_sequence = intent_goto(self, term_presence['coord'])

        elif 'good' in cmd or 'well' in cmd or 'good job' in cmd or 'well done' in cmd and 'job' in cmd:
            return intent_praise(self)
        elif 'suck' in cmd and 'some' in cmd and 'dirt' in cmd:
            return intent_suck_some_dirt(self)
        if 'get' in cmd and 'all' in cmd and 'gold' in cmd:
            return intent_get_all_gold(self)
        #elif 'move' in term_presence and 'dirt' in term_presence and 'from_coord' in term_presence and 'to_coord' in term_presence:
         #   return intent_move_dirt(self, term_presence['from_coord'], term_presence['to_coord'])
        #elif 'move' in term_presence and 'gold' in term_presence and 'from_coord' in term_presence and 'to_coord' in term_presence:
         #   return intent_move_gold(self, term_presence['from_coord'], term_presence['to_coord'])
        elif 'number' in term_presence and 'move_direction' in term_presence:
            command_sequence =  intent_forward_backward(self, term_presence['move_direction'], term_presence['number'])
        elif 'turn' in term_presence and 'turn_direction' in term_presence:
            command_sequence =  intent_turn(self, term_presence['turn_direction'])
        elif 'suck' in term_presence and 'coord' in term_presence:
            command_sequence =  intent_suck_dirt_at(self, term_presence['coord'])
        elif 'suck' in term_presence:
            command_sequence = intent_suck_some_dirt(self)
        elif 'home' in term_presence:
            command_sequence =  intent_go_home(self)
        elif 'bring' in term_presence and 'gold' in term_presence and 'coord' in term_presence:
            command_sequence =  intent_get_gold_at(self, term_presence['coord'])
        elif 'bring' in term_presence and 'gold' in term_presence:
            command_sequence =  intent_get_some_gold(self)
        elif 'move' in term_presence and 'coord' in term_presence:
            command_sequence = intent_goto(self, term_presence['coord'])
        elif ('where' in term_presence or 'how' in term_presence) and 'you' in term_presence:
            command_sequence = intent_agent_info(self)
        elif ('where' in term_presence or 'find' in term_presence) and ('gold' in term_presence):
            command_sequence = intent_find_gold(self)
        elif ('where' in term_presence or 'find' in term_presence) and ('dirt' in term_presence):
            command_sequence = intent_find_dirt(self)    
  
        elif 'what' in term_presence and 'in' in term_presence and 'coord' in term_presence:
            command_sequence = intent_query_square(self, term_presence['coord'])
        

        else: 
            command_sequence =  intent_unknown(self)
        return command_sequence
 

