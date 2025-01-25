"""
Daysout.py:
Write a program that calculates the average number of days a company's employees are absent. 
- function that asks the user for number of employees in the company. return int value, function accepts no arguments.
-function 2: accepts 1 argument (the number of employees).
asks user to enter number of days each employee missed.
total days should be returned as int.
-function 3: 2 arguments: number of employees and total days absent.
return average number of days absent as a double. 
do not use output or ask for input.

Input validation: do not accept number less than 1 for employees.
Do not accept negative number for days absent.
"""

#Define employees function - returns int
def employees():
   #Prompt user for number of employees
   n = int(input("How many employees are in the company?"))
   #Input validation ensures user enters a number 1 or above
   while(n < 1):
      n = int(input("How many employees are in the company? Please enter 1 or a higher number: "))
   #Returns number of employees
   return n

#Define absent function - accepts number of employees as argument
def absent(n):
   #Run a loop that asks user to enter number of days each employee missed.
   for i in range(n):
      print("Employee #", i+1)
      daysmissed = int(input("How many days was this employee absent?"))
      #Input validation: Do not accept negative number for days absent.
      while (daysmissed < 0):
         daysmissed = int(input("How many days was this employee absent? Do not enter a negative number: "))
      daysmissed = daysmissed + daysmissed #Concatenate daysmissed to itself to run a total
   #Return total days missed as int.
   return daysmissed
   
#Define daysabsent function - accepts number of employees and total days absent as arguments
def daysabsent(n,daysmissed):
   average = double(daysmissed/n) #Calculate average number of days absent as a double
   return average #Return the calculated number
   #This function does not produce output or ask for input

#Define main - call functions with arugments
def main():
   n = employees()
   daysmissed = absent(n)
   average = daysabsent(n,daysmissed)
#Call main
main()
