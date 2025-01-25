"""
Your savings account earns compound monthly interest and you want to calculate the amount you will have after a number of months.
F = P * (1 + i) ^ t

F = future value
P = present value
i = monthly interest rate
t = number of months

Write a program that prompts for P, i, and t.
The program passes these values to a function "futureValue" and returns the future value as well as displaying it.
"""

#Define celsius function
def futureValue(a,b,c):
    #Calculate future value
    f = a * (1 + b) ** c
    return f

#Define main
def main():
    #Prompt for P, i, t
    p = int(input("Enter the present value: "))
    interest = float(input("Enter the monthly interest rate as a decimal: "))
    t = int(input("Enter the number of months: "))

    #Call futureValue and assign it a variable (overwriting) so we can print it
    f = futureValue(p,interest,t)
    #Print new value
    print(f"Amount after {t} months: ${f:,.2f}")
#call main
main()
