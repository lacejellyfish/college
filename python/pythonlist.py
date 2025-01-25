"""
Grocery List Menu:
Write a Python program that manages a simple grocery list using a list.
The program should display a menu with options:
1) Add an item
2) View the list, (print entire list) 
3) Remove an item by entering its index number (with validation to ensure input is within range)
4) Exit. 
Users should be able to add items to the list, view all items with their corresponding numbers, and remove an item by entering its number (with validation to ensure the input is within range). 
Menu loops until user chooses to exit
"""


#Grocery list
groceries = ["turkey bacon", "drinkable yogurt", "ham", "protein shakes"]


#Print menu and take in input
p = int(input("Grocery List Menu:\n1: Add an item to the list.\n2: View the list.\n3:Remove an item from the list.\n4: Exit the menu.\n"))

#Test input validation:
while (p != 1 and p != 2 and p != 3 and p !=4):
	#Reprompt
	p = int(input("Please enter a valid number.\n1: Add item to list.\n2: View the list.\n3: Remove an item from the list.\n4: Exit the menu.\n"))

#Menu choices:
while (p == 1 or p == 2 or p == 3):

	#Keep printing menu while user is choosing not to exit:
	#p = (input("Grocery List Menu: \n[1]: Add an item to the list.\n[2]: View the list.\n[3]:Remove an item from the list.\n[4]: Exit the menu."))

	if (p == 1): #User choice 1: add item (IF statement executes once and returns to menu)
		y = (input("Add an item to the list: "))
		groceries.append(y)

		#May need to reset input variables p and y at end of each if statement?
		
	elif (p == 2): #User choice 2: view entire list (IF statement executes once and returns to menu)
		#Prints grocery list
		print(groceries)

		#Reset p and y as 0?
		
	elif (p == 3): #User choice 3:  Remove an item by entering its index number (with validation to ensure input is within range)
		#Take input as int	
		y = int(input("Enter the index number of the item you would like to remove (Index 0 is the first item):"))	

		#Input testing validation:
		while(y < 0 or y > len(groceries)):
			#Reprompt
			y = int(input("Enter the index number of the item you would like to remove (Index 0 is the first item):"))	

		#After user has entered valid number, remove desired item from list via index:
		groceries.remove(groceries[y])

		#Reset p and y as 0?
	#Keep printing menu while user is choosing not to exit:
	p = int(input("Grocery List Menu: \n[1]: Add an item to the list.\n[2]: View the list.\n[3]:Remove an item from the list.\n[4]: Exit the menu."))
		
#If user enters 4:
print("You have chosen to exit the program.")
