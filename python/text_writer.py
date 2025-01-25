"""
This file must be in the same folder as the text file.
This program reads the file, adds text to the file, reads it, and prints it again.
"""

file_path = r'C:\Users\mostek.paulina\Downloads\New folder\testfile.txt' #Assigns the file path to a variable
with open(file_path, 'r+') as file: #Reads and writes over the file, taking the file path as an argument and r+
   content = file.read() #Run the read function and assign it to the variable "content"
   print(content) #Print the variable
   user_text = input("Enter the text to write in the file: ") #Prompts user for input and stores in variable
   file.write(user_text) #Overwrites the file with the text that the user has entered (stored as a variable)
   #file.seek(0)
   update_content = file.read() #Read the file again and send it to a variable
   print(update_content) #Print the updated file
   
file.close() #Close the file