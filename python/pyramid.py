"""
Write a program that uses a loop to display a pyramid, followed by another loop that displays an inverted pyramid.

"""
#Loop for first pyramid
for i in range (11):
    #This loop starts at 0 and will add 1 to i for each iteration, running 10 times (until 11)
    #Add asterisks to the current string:
    print(i * "+") #first loop: print 1 "+"

#Separating line
print("")

#Loop for second pyramid
for i in range(10, 0, -1):
    #This loop starts at 10, subtracting 1 from i for each iteration, running 10 times (until 0)
    print(i * "+") #first loop: print 10 "+"s