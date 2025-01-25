"""
Fahrenheit to Celsius:
C = 5/9 (F - 32)
Write a function "Celsius" that accepts Fahrenheit as an argument.
It returns the temperature in Celsius.
Call it in a loop that displays a table of the Fahrenheit temperatures 0-20 and their Celsius equivalents.
"""

#Define celsius function
def celsius(a):
    #Calculate celsius
    celsius_temp = (5/9) * (a - 32)
    return celsius_temp

#Define main
def main():
    #Print table header
    print("Fahrenheit | Celsius")
    print("--------------------")

    #Call Celsius in a loop that displays a table of Fahrenheit temperatures 0-20 and their Celsius equivalents.
    for i in range(0, 21):
        celsius_temp = celsius(i)  #Call the celsius function
        print(f"{i} | {celsius_temp:.2f} degrees Celsius") #Print table
#call main
main()
