"""
Kinetic energy formula:
KE = 1/2 mv^2
m = mass (kg), v = velocity (meters per second)


Write a function named kineticEnergy at accepts an object's mass (in kg)
and velocity (in meters per second) as arugments.
It returns the amount of kinetic energy the object has.
Call it in a program that asks the user to enter mass and velocity.
"""

#Define kinetic energy function
def kineticEnergy(a,b):
    #Calculate kinetic energy
    kEnergy = 0.5 * a * (b ** 2)
    return kEnergy

#Define main
def main():
    #Prompt user for mass and velocity
    mass = float(input("Enter the mass of the object in kilograms: "))
    velocity = float(input("Enter the velocity of the object in meters per second: "))

    #Call kineticEnergy and pass the arguments mass and velocity
    energy = kineticEnergy(mass, velocity)
    #Print result
    print(f"The kinetic energy of the object is {energy} joules.")

#Call main
main()
