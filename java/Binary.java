/*
    Binary.java: This program introduces concepts of arithmetic expressions in programming through Java Arithmetic 
               Operators. We learn how and why to perform two different kinds of division in Java; quotient division
               AND modulus (remainder) division. Our example teaches how to convert a Decimal Number to a Binary
               Number, which requires knowing both the quotient and remainder of a division. We will also declare
               and assign values to several integer variables to save data temporarily for each of the 8 bits
               in the converted binary number, as well as a temporary variable to store the remainder on each 
               calculation, that we will then swap into a bit variable. We will also have a variable that keeps track of the 
               number we need to convert. We will use output statements to present the converted information by taking advantage
               of string concatenation to string together the binary digits.
    Authored by: Professor Tirrito & Students
    CMP128-81110: Computer Science I
    FALL 2024
    Paulina Mostek
    County College of Morris
    Date Last Modified: 09/18/2024
*/

//IMPORT STATEMENTS AREA
import java.util.Scanner;

public class Binary
{//This opens the public class Binary
   public static void main(String [] args)
   {
      //VARIABLE INITIALIZATIONS AREA
      int numToConvert = 0;
      //initialize bits and turn them off by assigning them to 0
      int bitOne = 0;
      int bitTwo = 0;
      int bitThree = 0;
      int bitFour = 0;
      int bitFive = 0;
      int bitSix = 0;
      int bitSeven = 0;
      int bitEight = 0;
      //initialize remainder variable
      int remainder = 0;
      
      
      //DISPLAYING A WELCOME BANNER TO THE END USER
      System.out.println("************************************************************");
      System.out.println("*        Welcome to the Binary Number Converter App.       *");
      System.out.println("*      Written by: Professor Tirrito & CMP128 Students     *");
      System.out.println("*                 Date modified: 09/16/2024                *");
      System.out.println("************************************************************");
      
      //DISPLAYING THE DETAILS ON THE NUMBER TO CONVERT
      System.out.println("This program will take a Decimal (Base-10) Number and convert it to a" + 
         " Base-2 binary number to illustrate how a computer converts our characters to machine code." +
         " For this first conversion, we will use the example of the capital letter A, which is 65 on the" +
         " ASCII/Unicode Character Map.\n");
         
      //CALCULATING THE BINARY CONVERSION VALUE
      //Start with a temporary swapping variable called numToConvert. This variable will contain 
      //the original Base-10 value we want to convert. It will be reduced each time we perform
      //a division, until we reach 0, indicating we have fully converted to the target base-2 value.
      numToConvert = 65;
      bitEight = numToConvert % 2; //This gives us a remainder of 1 in the bitEight slot
      numToConvert = numToConvert / 2; //This gives us a quotient of 32
      
      bitSeven = numToConvert % 2; //bitSeven is assigned the remainder of the quotient and 2, which is 0
      numToConvert = numToConvert / 2; //16 is the remaining quotient
      
      bitSix = numToConvert;
      numToConvert = numToConvert / 2;
      
      bitFive = numToConvert;
      numToConvert = numToConvert / 2;
      
      bitFour = numToConvert;
      numToConvert = numToConvert / 2;
      
      bitThree = numToConvert;
      numToConvert = numToConvert / 2;
      
      bitTwo = numToConvert;
      numToConvert = numToConvert / 2;
      
      bitOne = numToConvert;
      numToConvert = numToConvert / 2;
      
      //DISPLAYING THE RESULTS
      System.out.println("The conversion to binary has completed!\n\n65 (Base-10) in Binary is: " +
         bitOne + bitTwo + bitThree + bitFour + bitFive + bitSix + bitSeven + bitEight +".\n");
         
      //COLLECTING INPUT FROM THE USER FOR NEXT NUMBER TO CONVERT
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter a New Base-10 Number to convert to Binary: ");
      numToConvert = keyboard.nextInt();
      int input = numToConvert;
      
      bitEight = numToConvert % 2; //This gives us a remainder of 1 or 0 in the bitEight slot
      numToConvert = numToConvert / 2; //This gives us a quotient 
      
      bitSeven = numToConvert % 2; //bitSeven is assigned the remainder of the quotient and 2
      numToConvert = numToConvert / 2; 
      
      bitSix = numToConvert;
      numToConvert = numToConvert / 2;
      
      bitFive = numToConvert;
      numToConvert = numToConvert / 2;
      
      bitFour = numToConvert;
      numToConvert = numToConvert / 2;
      
      bitThree = numToConvert;
      numToConvert = numToConvert / 2;
      
      bitTwo = numToConvert;
      numToConvert = numToConvert / 2;
      
      bitOne = numToConvert;
      numToConvert = numToConvert / 2;
      
      //DISPLAYING THE RESULTS
      System.out.println("The conversion to binary has completed!\n\n" + input + 
       " (Base-10) in Binary is: " +
         bitOne + bitTwo + bitThree + bitFour + bitFive + bitSix + bitSeven + bitEight +".\n");
      

      
   }//This closes the public method main
}//This closes public class Binary