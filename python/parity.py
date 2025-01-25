"""
Write a Python program that takes an integer input from the user and determines whether the number is even or odd.
The program should use "if" statements to check the number's parity (even or odd) and display the appropriate message.
"""

#Take the input and prompt user
n = int(input("Enter a number: "))

#If n divided by 2 has a remainder of 1 or greater, it is odd
if(n % 2 >= 1): 
	print("The number is odd.")
#Else if n divided by 2 has no remainder, the number is even.
else:
	print("The number is even.")