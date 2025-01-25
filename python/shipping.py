"""
Write a program that asks for the weight of the package in kilograms and distance shipped in miles.
The program will prompt the user again if an invalid weight or distance is entered.
"""

#Prompt user for package weight
w = int(input("Please enter package weight in kilograms: "))

#Reprompt user for validation testing
while(w <= 0 or w > 20):
    w = int(input("Please enter a valid weight between 1 - 20 kg: "))

#Prompt user for distances shipped
d = int(input("Please enter the distance that the package will be shipped, in miles: "))

#Reprompt user for validation testing
while(d < 10 or d > 3000):
    d = int(input("Please enter a valid distance between 10 - 3,000 miles: "))

#Calculate shipping rate per 500 miles
#If weight is 2kg or less
if (w <= 2):
    rate = 1.10
#If weight is more than 2kg but not more than 6kg
elif(w > 2 and w <= 6):
    rate = 2.2
#If weight is more than 6kg but not more than 10kg
elif(w > 6 and w <= 10):
    rate = 3.7
#If weight is more than 10kg but not more than 20kg
elif(w > 10 and w <= 20):
    rate = 4.8

#Calculate total shipping rate using integer division to discard remainder
total = rate * (d//500)

#Display shipping rate
print("Your shipping rate is: ", "$"+(f'{total:,.2f}'))
