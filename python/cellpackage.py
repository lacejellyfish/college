"""
Write a program that asks for the number of units sold and computes the total cost of the purchase.
This program will return errors if an invalid package has been entered.

Special Instructions: There is no validation input, so the program will display an error if the user enters any package other than A, B, or C.
"""

#Take input and prompt user
p = (input("Which package do you have? (A, B, or C): "))
m = int(input("How many minutes were used? "))

#If user has package A:
if (p == 'A'):
    if (m > 450):   #If the user goes over the minutes
        o = (m - 450)
        total = (39.99 + (0.45 * o))
    else: #If the use has 450 or less minutes
        total = 39.99
#If user has package B:
elif(p == 'B'):
    if (m > 900):#If user goes over the minutes
        o = (m - 900)
        total = (59.99 + (0.40 * o))
    else: #If the user does not go over the minutes
        total = 59.99
#If user has package C
elif(p == 'C'):
    total = 69.99

print("Your monthly phone bill is: ", "$"+(f'{total:,.2f}'))

