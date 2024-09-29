from agents.vacuumenvironment import VacuumEnvironment

# recon type ['None', 'WallsOnly', 'Full', 'WallsAndGold']:
class VacuumSimulation:
    def __init__(self, agent, dirt_bias, wall_bias, world_seed, recon_type='None', battery_capacity=None):
        self.env = VacuumEnvironment(env_x=20, 
                                     env_y=20, 
                                     dirt_bias=dirt_bias,
                                     wall_bias=wall_bias, 
                                     world_seed=world_seed)
        self.agent = agent
        if battery_capacity != None:
            agent.reset_battery(battery_capacity)
        self.env.add_thing(self.agent, (1,1))
        self.env.prep_agent(self.agent, recon_type)
    
    def run(self):
        while not self.env.is_done():
            self.env.step()
            
    def score(self):
        return self.agent.score()

#########################

from random import randint
from load_agents import make_agent
    
def run_agents_in_environment(dirt_density, 
                              wall_density, 
                              agent_specs,
                              recon,
                              battery_capacity,
                              logger,
                              num_samples = 100, 
                              output_file_name = 'simulation_results.csv',
                              print_results_to_console = False):
    with open(output_file_name, 'a') as output_file:
        for i in range(0, num_samples):
            seed = randint(1,10000)
            agents = [make_agent(aspec[0], aspec[1], logger) for aspec in agent_specs]
            recons = [recon[aspec[1]] for aspec in agent_specs]
            for ar in zip(agents, recons):
                a, r = ar
                v = VacuumSimulation(a, dirt_density, wall_density, seed, r, battery_capacity)
                v.run()
                output_file.write(f"{a.version},{dirt_density},{wall_density},{a.score()}\n")
                if print_results_to_console:
                    print(f"{a.version},{dirt_density},{wall_density},{a.score()}")


# def run_agents_in_environment2(thresh,dirt_density, 
#                               wall_density, 
#                               agent_specs,
#                               recon,
#                               logger,
#                               num_samples = 100, 
#                               output_file_name = 'simulation_results2.csv',
#                               print_results_to_console = False):
#     with open(output_file_name, 'a') as output_file:
#         for i in range(0, num_samples):
#             seed = randint(1,10000)
#             agents = [make_agent(aspec[0], aspec[1], logger) for aspec in agent_specs]
#             recons = [recon[aspec[1]] for aspec in agent_specs] 
            
#             for ar in agents:
#                 a = ar
#                 a.low_battery_threshold = thresh
#                 v = VacuumSimulation(a, dirt_density, wall_density, seed,recon, thresh)
#                 v.run()
#                 output_file.write(f"{a.version},{a.low_battery_threshold},{dirt_density},{wall_density},{a.score()}\n")
#                 if print_results_to_console:
#                     print(f"{a.version},{a.low_battery_threshold},{dirt_density},{wall_density},{a.score()}")
            
            
        

def run_agents_in_environment2(thresh, dirt_density, 
                              wall_density, 
                              agent_specs,
                              recon,  # Add recon as a parameter here
                              logger,
                              num_samples = 100, 
                              output_file_name = 'simulation_results2.csv',
                              print_results_to_console = False):
    with open(output_file_name, 'a') as output_file:
        for i in range(0, num_samples):
            seed = randint(1, 10000)
            agents = [make_agent(aspec[0], aspec[1], logger) for aspec in agent_specs]
            recons = [recon[aspec[1]] for aspec in agent_specs]  # This should now work correctly
            
            for ar in zip(agents, recons):  # Loop through agents and recons together
                a, r = ar
                a.low_battery_threshold = thresh
                v = VacuumSimulation(a, dirt_density, wall_density, seed, r, thresh)
                v.run()
                output_file.write(f"{a.version},{a.low_battery_threshold},{dirt_density},{wall_density},{a.score()}\n")
                if print_results_to_console:
                    print(f"{a.version},{a.low_battery_threshold},{dirt_density},{wall_density},{a.score()}")




def run_agents_in_environment3(thresh, dirt_density, 
                              wall_density, 
                              agent_specs,
                              recon,  # Add recon as a parameter here
                              logger,
                              num_samples = 100, 
                              output_file_name = 'simulation_resultsBattery.csv',
                              print_results_to_console = False):
    with open(output_file_name, 'a') as output_file:
        for i in range(0, num_samples):
            seed = randint(1, 10000)
            agents = [make_agent(aspec[0], aspec[1], logger) for aspec in agent_specs]
            recons = [recon[aspec[1]] for aspec in agent_specs]  # This should now work correctly
            
            for ar in zip(agents, recons):  # Loop through agents and recons together
                a, r = ar
                a.low_battery_threshold = thresh
                v = VacuumSimulation(a, dirt_density, wall_density, seed, r, thresh)
                v.run()
                output_file.write(f"{a.version},{dirt_density},{wall_density},{a.score()}\n")
                if print_results_to_console:
                    print(f"{a.version},{dirt_density},{wall_density},{a.score()}")

# def run_agents_in_environment2(thresh,dirt_density, 
#                               wall_density, 
#                               agent_specs,
#                               logger,
#                               num_samples = 100, 
#                               output_file_name = 'simulation_results2.csv',
#                               print_results_to_console = False):
#     with open(output_file_name, 'a') as output_file:
#         for i in range(0, num_samples):
#             seed = randint(1,10000)
#             agent = agent_specs[0]
#             agents = make_agent(agent[0], agent[1], logger) 
            
#             agents.low_battery_threshold = thresh
#             print(agents.low_battery_threshold)
#             v = VacuumSimulation(agents, dirt_density, wall_density, seed)
#             v.run()
#             output_file.write(f"{thresh},{thresh},{dirt_density},{wall_density},{agents.score()}\n")
#             if print_results_to_console:
#                 print(f"{thresh},{dirt_density},{wall_density},{agents.score()}")
