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


Each cycle the agent gets these three *percepts*, each describing part of the world. Each percept has a True/False value
* **DIRT** -- the square occupied by the agent contains dirt
* **BUMP** -- the agent tried to move into a wall;  its position did not change
* **HOME** -- the agent's current position is its initial position


#### Evaluating an Agent

Basic framework with these costs and rewards for the agent
* An agent has a fixed battery capacity, and each action it takes consumes a certain number of battery units
* An agent gets a reward for every piece of dirt it sucks up
* The agent's *score* is the amount of dirt it sucks up before its battery is consumed

#### Running a Simulation

Running a simulation 
* Creating an environment and setting its parameters
* Creating an agent and setting its parameters
* Initializing the environment which randomly assigns walls and dirt according to the environment parameters, and inserts the agent in the environment
* Run simulation steps (given the agent percepts, receive its action choice, update the world) until the agent's battery depletes
* Reading the agent's score

---

#### The API Simulation

There is code in `vacuumsimulation.py` that makes it easy to run multiple simulations involving multiple agents
and environment parameters, and write information about the agent, parameters, and score to the console or to a file.


 

