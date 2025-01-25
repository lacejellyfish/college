"""
Assignment 10, Problem 2:
Program lets the user play Rock, Paper, Scissors against the computer.
1. Begin by generating a random number 1-3. If 1, computer chose rock. If 2, paper. If 3, scissors. Do not display this.
2. User enters "rock", paper, or scissors at keyboard or menu.
3. Computer's choice is displayed.
4. Winner is selected:
Rock vs scissors: rock wins.
Scissors vs paper: scissors wins.
Paper vs rock: paper wins.
If both choices are the same: play again to determine the winner (restart loop).
Divide program into functions that perform each task.
"""

import random #Import the random library

def computerChoice(): #Define pcThrow - what is the pc throwing?
   choice = random.randint(1,3) #Generate random number between 1 and 3
   #Assign choice to rock, paper, or scissors and return the value
   if (choice == 1):
      return "rock" #Return randomly generated number
   elif (choice == 2):
      return "paper" #Return randomly generated number
   elif (choice == 3):
      return "scissors"

def userChoice(): #define userThrow - what is the user throwing?
   #Prompt user for choice, force lowercase with str.lower(input)?
   usrChoice = str(input("Enter your choice of rock, paper, or scissors (case sensitive): "))
   return usrChoice

def results(compChoice, usrChoice): #Define results: this function takes the choices of the pc and user as arguments
   #Display computer choice
   print("Computer choice: ", compChoice)
   
   #If tie....
   if (usrChoice == compChoice):
      return "Tie!"
   #If user loses...
   elif (compChoice == "rock" and usrChoice == "scissors") or (compChoice == "paper" and usrChoice == "rock") or (compChoice == "scissors" and usrChoice == "paper") :
      return "Computer wins!"
   #All other situations (user wins)
   else:
      return "User wins!"
   #If userchoice = paper && pcChoice = rock => user wins!

def main(): #Define main function
   #Call other functions
   choice = computerChoice()
   usrChoice = userChoice()
   res = results(choice, usrChoice) #Store
   #Print results
   print(res)

main() #Call main