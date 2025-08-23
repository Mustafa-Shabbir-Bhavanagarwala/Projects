from batch_simulator import run_agents_in_environment2,run_agents_in_environment3

#######################################
# Two options about what to do with the agent's log messages in absence 
# of a GUI pane
def log_to_console(msg):
    print(msg)

def log_null(msg):
    pass

########################################

# Write all batch results to this file
default_output_file_name = 'simulation_results.csv'
default_output_file_name2 = 'simulation_results2.csv'
## All possible agents and their recon configurations

agents = [ ("agents/reactiveagent.py",    "NoSenseAgent"),
           ("agents/reactiveagent.py",    "SensingAgent"),
           ("agents/worldmodelagent.py",  "WorldModelAgent"),
           ("agents/planningagent.py",    "OmniscientAgent"),
         ]

recon = {"NoSenseAgent": 'None',
         "SensingAgent": 'None',
         "WorldModelAgent": 'None',
         "OmniscientAgent": 'Full'}

#############################################################################
# Show a single example (agent + dirt density + wall density + num samples)
#  of running an experiment.
#
# EXAMPLE ONLY!  This just shows you how to set parameters in order to run
# your experiments!

# def run_agents_example():

#     num_samples = 50
#     write_results_to_console = True
#     demo_agents = [agents[0],agents[1], agents[2],agents[3]]   # Sensing agent and world model agent
#          # This is twice the default battery 
#                                             # capacity -- most of your experiments
#                                             # should use the default, you get the 
#                                             # default by setting battery_capacity to None
    
#     for battery_capacity in range(50, 500, 50):
#         for dirt_density in (0.1,0.2,0.3):
#             for wall_density in (0.1,0.2,0.3):
#                 run_agents_in_environment2(battery_capacity,dirt_density, 
#                                           wall_density, 
#                                           demo_agents,
#                                           recon,
#                                           log_null, 
#                                           num_samples, 
#                                           default_output_file_name, 
#                                           write_results_to_console)

# #  Run the demo!
# run_agents_example()

def run_agents_example2():

    num_samples = 100
    write_results_to_console = True
    demo_agents = [agents[0],agents[1], agents[2],agents[3]]   # Sensing agent and world model agent
         # This is twice the default battery 
                                            # capacity -- most of your experiments
                                            # should use the default, you get the 
                                            # default by setting battery_capacity to None
    battery_capacity=500

    for dirt_density in (0.1,0.2,0.3):
        for wall_density in (0.1,0.2,0.3):
            run_agents_in_environment3(battery_capacity,dirt_density, 
                                          wall_density, 
                                          demo_agents,
                                          recon,
                                          log_null, 
                                          num_samples, 
                                          default_output_file_name2, 
                                          write_results_to_console)

#  Run the demo!
run_agents_example2()



