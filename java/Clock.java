/*
    Clock.java: This is our first lab in Java. This is a lesson that will coincide
                  with October cybersecurity awareness month by introducing some basic concepts of
                  multifactor encryption. While loosely mimicking basic concepts of public/private key
                  encryption, we will use a modified version of a Caesar Cypher wheel developed by 
                  Professor Tirrito. This is not meant to be a robust example of modern day encryption
                  technology that uses 256-bit encryption, but rather a simplistic look at how
                  encryption occurs.
    Authored by: Professor Tirrito & Students
    CMP128-81110: Computer Science I
    FALL 2024
    Paulina Mostek
    County College of Morris
    Date Last Modified: 11/04/2024
*/

//Import Libraries
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Clock
{
   public static void main(String [] args)
   {
      //Initialize variables
      String borderLine = "";
      Scanner keyboard = new Scanner(System.in); //scanner object for input
   
      //DISPLAYING THE WELCOME BANNER
      for(int i = 0; i<60; i++) //prints a banner 60 characters long
      {
         borderLine += "*"; //concatenates "*" to the string borderLine
      }//end of for loop
      borderLine += "\n"; //concatenates a new line to the border
      //As a result, borderLine contains 
      //************************************************************\n
      
      //This section prints the welcome banner
      System.out.println(borderLine); //top border
      System.out.println("*             Welcome to the Clock App v. 1.0               *");
      System.out.println("*                Written by: Paulina Mostek                 *");
      System.out.println("*                 Date Modified: 11/12/2024                 *");
      System.out.println(borderLine); //bottom border

      //This section will prompt for the time
      //parse string data and converse it to an integer
     // System.out.println("Please enter the start hour: "); //Prompt for start hour
      //startH = keyboard.nextInt(); //store variable as Integer input
      int startH = Integer.parseInt(JOptionPane.showInputDialog("Enter start hour: "));
      int startM = Integer.parseInt(JOptionPane.showInputDialog("Enter start minute: "));
      int startS = Integer.parseInt(JOptionPane.showInputDialog("Enter start second: "));
      int endH = Integer.parseInt(JOptionPane.showInputDialog("Enter end hour: "));
      int endM = Integer.parseInt(JOptionPane.showInputDialog("Enter end minute: "));
      int endS = Integer.parseInt(JOptionPane.showInputDialog("Enter end second: "));
      
      //initialize variables for current time
      int currentH = startH, currentM = startM, currentS = startS;
      
      //While loop to update the clock
      while ((currentH < endH) || (currentH == endH && currentM < endM) || (currentH == endH && currentM == endM && currentS <= endS))
      {
         //print current time in correct format
         System.out.printf("Time: %02d:%02d:%02d\n", currentH, currentM, currentS);
         //add 1 to the second
         currentS++;
         
         //if the current second reaches 60 or above, reset seconds to 0 and increase minutes by 1
         if (currentS >= 60)
         {
            currentS = 0;
            currentM++;
         }//end of true path for current Second 60+
         
         //once current minute reaches 60, minutes will reset and hour will be incremented by 1
         if (currentM >= 60)
         {
            currentM = 0;
            currentH++;
         }//end of true path for current minute 60+
         
      }//end of while loop
       
      
      
       //DISPLAYING THE CLOSING BANNER
      System.out.println(borderLine); //top border
      System.out.println("*             Thanks for using the Clock App v. 1.0         *");
      System.out.println("*                Written by: Paulina Mostek                 *");
      System.out.println("*                 Date Modified: 11/12/2024                 *");
      System.out.println(borderLine); //bottom border
   
   }//end main class
   
}//end Clock class