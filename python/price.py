"""
Write a program that asks for the number of units sold and computes the total cost of the purchase.
Special Instructions: If an invalid number of packages is entered, the program will ask the user to enter a valid number but the program will not restart because there is no while loop.
"""

#Take input and prompt user
n = int(input("Enter the number of units sold: "))

#Set price to 99
price = 99

#Calculate price based on amount of units
if (n >= 100):  #if 100+ packages, 50% discount
    totalprice = ((n * 99) * .50)
    print("The total price is: ", "$"+(f'{totalprice:,.2f}'))
elif (n>= 50 and n<=99):     #elif 50-99 packages, 40% discount
    totalprice = ((n * 99) * .60)
    print("The total price is: ", "$"+(f'{totalprice:,.2f}'))
elif (n>=20 and n<=49):     #elif 20-49 packages, 30% discount
    totalprice = ((n * 99) * .70)
    print("The total price is: ", "$"+(f'{totalprice:,.2f}'))
elif (n>= 10 and n<= 19):   #elif 10-19 packages, 20% discount
    totalprice = ((n * 99) * .80)
    print("The total price is: ", "$"+(f'{totalprice:,.2f}'))
elif (n <= 0):  #if 0 or less packages, reprompt
    print("Please enter a valid number of units.")
else:    #no other discount
    totalprice = (n * price)
    print("The total price is: ", "$"+(f'{totalprice:,.2f}'))