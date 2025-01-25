/*
    BasicMath.java: This is our second lesson in Java. This is a simple Java Program that will introduce
               collecting input from the user, and displaying results based on that input. We will be
               concatenating strings and performing basic arithmetic expressions. There will be variables
               that will initially be hard-coded with default data until the user re-populates it with
               new data that is more relevant. The program will take entry of individual prices for three
               items to bepurchased by a fictitious customer. It will then calculate a sum of the
               numbers, and display a formatted result on the screen that includes the dollar amount of
               each individual item, followed by the subtotal, sales tax, and grand total, just like
               a standard cash register receipt.
    Authored by: Professor Tirrito & Students
    CMP128-81110: Computer Science I
    FALL 2024
    Paulina Mostek
    County College of Morris
    Date Last Modified: 09/18/2024
*/

//DEFINES IMPORTED CLASSES FROM THE JAVA API LIBRARIES
import java.util.Scanner;

//DEFINES THE PUBLIC CLASS
public class BasicMath
{
   //DEFINE PUBLIC MAIN METHOD FOR THIS CLASS
   public static void main(String [] args)
   {
      //INITIALIZES VARIABLES
      String borderLine = "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$"; //60 characters
      String fName = "John";
      String mI = "A";
      String lName = "Doe";
      double item1 = 0.0;
      double item2 = 0.0;
      double item3 = 0.0;
      double subtotal = 0.0;
      double salesTax = 0.0;
      double grandTotal = 0.0;
      final double TAX_RATE = 0.07; //State Sales Tax Rate
      Scanner keyboard = new Scanner(System.in);
      
      //WELCOME BANNER AND PROGRAM INSTRUCTIONS
      System.out.println(borderLine);
      System.out.println("$        This is lesson #04: Basic Math Application        $");
      System.out.println("$                                                          $");
      System.out.println("$ In this lesson, we will learn how to use basic statements$");
      System.out.println("$ in the Java programming language to display content on   $");
      System.out.println("$ the screen, like this paragraph, to collect input and    $");
      System.out.println("$ process it into a concatenated string that contains      $");
      System.out.println("$ whitespace in the concatenation, and to perform basic    $");
      System.out.println("$ mathematical calculations.                               $");
      System.out.println("$                                                          $");
      System.out.println("$ This program will start by outputting a random student's $");
      System.out.println("$ name, selected by the professor and hard-coded into the  $");
      System.out.println("$ three variables containing the frist name, middle initial$");
      System.out.println("$ and last name of the student. It may coincidentally be   $");
      System.out.println("$ the name of a student in this class, but it doesn't have $");
      System.out.println("$ to necessarily be that way.                              $");
      System.out.println("$                                                          $");
      System.out.println("$ " + fName + " " + mI + " " + lName + "                    " +
           "                         $");
      System.out.println("$                                                          $");
      //System.out.println("$ This system will not PAUSE for Test Phase #01 -          $");
      //System.out.println("$ SMALL STAGE DESIGN TESTING                               $");
      System.out.println("$ Now that you have seen what was hard-coded to the name     $");
      System.out.println("$ variables, we will overwrite the default data with a new   $");
      System.out.println("$ student name, which will be collected from the user as     $");
      System.out.println("$ input. This will give you the opportunity to use your own  $");
      System.out.println("$ name and allow any other user to use their own name.       $");
      System.out.println(borderLine);
      
      //BASIC INPUT STATEMENTS
      System.out.print("Please enter first name: ");
      fName = keyboard.nextLine();
      
      System.out.print("Please enter middle initial: ");
      mI = keyboard.nextLine();
      
      System.out.print("Please enter last name: ");
      lName = keyboard.nextLine();
      System.out.println(""); //prints a new blank lines
      //You have now finished collecting all three pieces of new data as input from the end-user
      
      //Output statements for the altered data
      System.out.println("### THE PROGRAM HAS MODIFIED THE STUDENT NAME VARIABLES! ###");
      System.out.println("The user-provided full name is: " + fName + " " + mI + " " + lName + "\n");
      
      //System.out.println(borderLine);
      //System.out.println("$ This system will not PAUSE for Test Phase #02 -          $");
      //System.out.println("$ SMALL STAGE DESIGN TESTING                               $");
      //System.out.println(borderLine);
      
      //COLLECTING NUMERIC FLOATING-POINT INPUT FROM THE USER FOR 3 SALE ITEMS
      System.out.print("Please enter the price for item #01: $");
      item1 = keyboard.nextDouble();
      
      System.out.print("Please enter the price for item #02: $");
      item2 = keyboard.nextDouble();
      
      System.out.print("Please enter the price for item #03: $");
      item3 = keyboard.nextDouble();
      System.out.println(""); //print a blank line
      //finished collecting 3 sales items
      
      //CALCULATING BASIC ARITHMETIC OPERATIONS ON THE SALES ITEMS
      subtotal = item1 + item2 + item3;
      salesTax = subtotal * TAX_RATE;
      grandTotal = subtotal + salesTax;
      
      //OUTPUTTING ALL PROCESSED VALUES AS TOTAL INFORMATION ON A RECEIPT
      System.out.println(borderLine);
      System.out.println("$                    SALES RECEIPT                             $");
      System.out.println("$--------------------------------------------------------------$");
      System.out.println("$                                    Monday September 23, 2024 $");
      System.out.println("$                                                              $");
      System.out.println("$ Customer Name: " + fName + " " + mI + " " + lName + " $");
      System.out.println("$                                                              $");
      System.out.println("$ PRODUCTS:                                                    $");
      System.out.println("$ --------                                                     $");
      System.out.println("$ Item #01: $" + item1 + "                                       $");//40 spaces
      System.out.println("$ Item #02: $" + item2 + "                                       $");
      System.out.println("$ Item #03: $" + item3 + "                                       $");
      System.out.println("$ ------------------------------------------------------------ $");
      System.out.println("$ Subtotal: $" + subtotal + "                                        $"); //40 spaces
      System.out.println("$ Sales Tax: $" + salesTax + "                                       $");
      System.out.println("$ Grand Total: $" + grandTotal + "                        $");
      System.out.println("$ ------------------------------------------------------------ $");
      System.out.println("$                 END OF SALES RECEIPT                         $");
      
   }//closes public method
}//closes public class BasicMath