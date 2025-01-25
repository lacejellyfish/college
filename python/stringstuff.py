#Perform basic operations on strings
sentence = "Vanilla flavor is the best     "     
print(sentence[0]) #Index string by 0 - V
print(sentence[5]) #Index string by 5 - l
print(len(sentence)) #Print the length of the string, 31 characters
print(sentence[2:9]) #Print the string from 2nd to 9th index
print(sentence.rstrip()) #Removes whitespace on right
print(sentence.upper()) #Forces uppercase
print(sentence.lower()) #Forces lowercase
print(sentence.replace("Vanilla", "Chocolate")) #Replaces vanilla with chocolate

#Split a string and print it
the_string = "The wizard is here"
print(the_string.split(" "))

#Use a loop to print each character in a string
explosion = "BOOM!"
for x in explosion:
	print(x)

#Use loop to iterate over the string, splitting it into words
animals = "cat,dog,fox,bunny"
words = animals.split(",") #Creates a list by splitting the words with a comma
for word in words: #Creates a loop for each item in the list, printing it
	print(word)

#Use f-string and format 
price = 999999999
print("\n The price of this gem is ", "$" + (f'{price:,.2f}'))
