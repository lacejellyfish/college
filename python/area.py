#Define area function (return-value function)
def rectangle_area(length,width): #length and width is passed as argument
	return length * width #product is returned

#Define circle function (return-value function)
def circle_area(radius):
	pi = 3.14
	return pi * (radius ** 2)

#Define display function (void function)
def display (a,b):
    print(f"The area of the rectangle is: {a}")
    print(f"The area of the circle is: {b}")

#Main program
def main():
    print("Area calculator")

	#Get input for dimensions
    length = float(input("Enter the length: "))
    width = float(input("Enter the width: "))

    #Call rectangle function
    rect_area = rectangle_area(length,width)
    #print(f"The area is {rect_area}") #This is replaced by the display function

    #Get input for circle
    radius = float(input("Enter radius: "))

    #Call circle_area function
    circ_area = circle_area(radius)
    #print(f"The circle area is: {circ_area}") #This is replaced by the display function
    #Call display function on both area variables
    display(rect_area, circ_area)
    #Here:
        #rect_area is passed to a, which will print the rectangular area.
        #circ_area is passed to b in the function, which will print the circle area.

#Call main to run program
main()