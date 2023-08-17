'''
Problem:
The scrum master wants to call on team members in random order each day.
Assignment:
1) Define scrum team members in a flat file called devteam.txt, containing the following members (same file as you
used in the first challenge):

Bobby Yellowstone
David Green
Henry Grayson
Martha White
Red Skelton
Roger Black
Thomas Brown
Violet Douglas

2) Develop a python script to read in the devteam.txt file and display the above team members in random order
without the use of the random.shuffle function. In other words, use either random, randint, or randrange. One
convenient option for managing the list is using a dictionary construct. Run the random list part 3 times and
format the output as shown below:

Original Order by First Name:
-----------------------------
Bobby Yellowstone
David Green
…

Random Order:
--------------------
David Green
Violet Douglas
…

Random Order:
--------------------
Red Skelton
Henry Grayson
…
'''

import random

# Open file
file = open('devteam.txt', 'r')
dictionary = {}
names = file.readlines()
def do_work(names_list, my_dict):
    my_dict.clear()
    for name in names_list:
        rand = random.randint(0, 1204587)
        my_dict.setdefault(rand, name)
    sorted_dict = dict(sorted(my_dict.items())) #sorts the dictionary by key(random) and transforms the returned list into a dict
    name = names_list[len(names_list) - 1] # This is going to be equal to the last name (Violet Douglas) which does not have a newline character at the end so we add one
    for key in sorted_dict.keys(): # Loop through keys then check if the value associated with the key is Violet Douglas then add a newline char behind it
        if(sorted_dict[key] == name):
            sorted_dict[key] += '\n'
    return sorted_dict

string1 = 'Original Order by First Name:'
print(string1)
print('-'*len(string1))
print("".join(names))
print()
string2 = 'Random Order:'
for i in range(3):
    print(string2)
    print('-'*len(string2))
    print("".join(do_work(names, dictionary).values()))
    print()
