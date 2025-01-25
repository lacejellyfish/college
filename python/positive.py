"""
Write a program that asks the user for a positive integer value.
It should run a loop to get the sum of all integers from 1 up to
the number entered.
For example, if the user enters 50, the loop will find the sum of
1, 2, 3...50.
Do not accept a negative starting number.
"""

#Prompt user for positive number
x = int(input("Please enter a positive integer: "))

#Reprompt user for validation testing
while(x < 0):
    x = int(input("Please enter a POSITIVE integer: "))

#Create new variable to use for summary
s = 0

#Run loop
for i in range(x+1): #Loop starts at 0, runs until entered input "x"
    s = s + i #Variable will add the sum of each number between 1 and x, repeating the loop after each addition

#Display
print(s)
