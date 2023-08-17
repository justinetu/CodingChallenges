'''
Problem:
The scrum master wants to call on team members in random order each day.
Assignment:
1) Define scrum team members in a flat file called devteam.txt, containing the following members:

Bobby Yellowstone
David Green
Henry Grayson
Martha White
Red Skelton
Roger Black
Thomas Brown
Violet Douglas

2) Develop a python script to read in the devteam.txt file and display the above team members in random order by
using the random.shuffle function. Run the random list part 3 times and format the output as shown below:

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
# Opens the .txt file
f = open('devteam.txt', 'r') 
name_list = []
# f.readlines() is a list. I'm appending each name to a new list to save the contents.
for i in f.readlines():
    name_list.append(i)
print(f'''Original Order by First Name:
-----------------------------''')
new_list = []
for i in name_list:
    # I copy the modified contents of the old array containing '\n' to a new array
    new_list.append(i.replace('\n',''))
for _ in new_list:
    print(_)
# Shuffle the list 3 times to display the names randomly 
for i in range(0, 3):
    print(f'''\nRandom Order:
-----------------------------''')
    random.shuffle(new_list)
    for _ in new_list:
        print(_)











