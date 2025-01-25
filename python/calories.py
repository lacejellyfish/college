"""
This program will run a loop that displays the amount of calories burned after 5, 10, 15, 20, 25, and 30 minutes.
"""

#Loop for minutes
for i in range(5, 31, 5): #i starts as 5, increments by 5, and stops at 30
    calories = 3.6 * i #Calculates calories burned per minute
    print("Calories burned after ", i ,"minutes: ", calories) #Displays calories burned
