### Vacuum World Simulator


The dirt world is a grid of squares inhabited by an agent who occupies a single square and can 
move from a square to an adjacent square.  Some squares are walls, and the agent 
cannot into those squares.  A non-wall square may or may not contain a single
piece of dirt, which can be sucked up by the agent.

Here is a graphical depiction of a dirt world


* This world is 20x20
* Walls render in black
* Dirt renders in grey
* The agent is a yellow circle
* The coordinate system starts at upper left, with the outer rows and columns being walls
* The agent begins at square [1,1] and is facing East


#### Enviroments

An environment defines characteristics of the world and its contents apart from the agent.

The following parameters can be adjusted
* Environment (grid) size --20x20 grid 
* Dirt density -- specified by a parameter between 0.0 and 1.0, dirt particles are placed randomly in grid squares 
at the beginning of a simulation.  A dirt density of 0.0 means no dirt, 1.0 means all non-wall squares will have dirt
* Dirt distribution -- a 0/1 parameter.  If 0, dirt is distributed uniformly around the grid according to 
the density parameter.  If 1, dirt tends to placed close to other dirt, so the agent is likely to find relatively dirty regions of the grid
along with relatively clean regions
* Wall density -- specified by a parameter between 0.0 and 1.0, walls are placed randomly at the beginning of a simulation.   A wall density of 0.0 means no walls, 1.0 means all squares except [1,1] will contain a wall.


#### Agents
An agent appears has a *position* and a *heading* (the direction it is facing).  By convention, the agent's initial
position is [1,1] -- the upper left cell -- and its initial heading is EAST.

Each cycle in the environment/simulation proceeds as follows:
* The simulation presents the agent with *percepts* describing the current state of the world
* The agent decides what *action* to take
* The agent returns its chosen action to the simulation/environment

Each cycle the agent gets these three *percepts*, each describing part of the world. Each percept has a True/False value
* **DIRT** -- the square occupied by the agent contains dirt
* **BUMP** -- the agent tried to move into a wall;  its position did not change
* **HOME** -- the agent's current position is its initial position

The agent then chooses an action from among these: 
* **SUCK** -- try to suck up dirt.  If there is dirt in the same square as the agent, it disappears.  If there 
is no dirt in the square, the action has no effect.  
* **FORWARD** -- try to move to the adjacent square in the *heading* direction.  
* **TURN_LEFT** -- change orientation by facing one compass heading to the left (**NORTH** -> **EAST**, **EAST** -> **SOUTH**, etc.)
* **TURN_RIGHT** -- change orientation by facing one compass heading to the right (**NORTH** -> **WEST**, **WEST** -> **SOUTH**, etc.)
* **NOP** -- Do nothing.

#### Evaluating an Agent

Basic framework with these costs and rewards for the agent
* An agent has a fixed battery capacity, and each action it takes consumes a certain number of battery units
* An agent gets a reward for every piece of dirt it sucks up
* The agent's *score* is the amount of dirt it sucks up before its battery is consumed

#### Running a Simulation
Start the simulation testbed by running the code in `run_gui.py`.  

 To configure a simulation, the first seven buttons configure these parameters
* The grid size (fixed at 20x20)
* The wall density
* The dirt density
* The dirt uniformity
* The random number generator seed
* The agent class
* Time delay between simulation steps

The next five buttons set up and run a simulation
* Prepare the simulation by randomly generating walls and dirt and initializing and placing the agent in its initial position and heading
* Run the simulation or resume a stopped simulation
* Stop the simulation
* Run one simulation
* Clear the agent's log (appears in the pane to the right of the grid)
* Creating an environment and setting its parameters
* Creating an agent and setting its parameters
* Initializing the environment which randomly assigns walls and dirt according to the environment parameters, and inserts the agent in the environment
* Run simulation steps (given the agent percepts, receive its action choice, update the world) until the agent's battery depletes
* Reading the agent's score

---

#### The API Simulation

There is code in `vacuumsimulation.py` that makes it easy to run multiple simulations involving multiple agents
and environment parameters, and write information about the agent, parameters, and score to the console or to a file.


 

