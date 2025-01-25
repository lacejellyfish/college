"""
Write a Python program that takes a temperature value from the user and categorizes it as cold, warm, or hot based on the predefined temperature ranges.
"""

#Take the input and prompt user
t = int(input("Enter a temperature: "))

#If temp is 80 or above, it is hot
if(t >= 80): 
	print("The temperature is hot.")
#If temp is not 80 or above but is 70 or above (70-79). it is warm
elif(t >= 70):
	print("The temperature is warm.")
#Else if the temperature is below 70, it is cold
else:
	print("The temperature is cold.")