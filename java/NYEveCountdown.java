/*
    NYEveCountdown.java: This is our seventh lesson in Java. We are learning how to use repetition structures
                  in this application. Specifically, we will use a reverse countdown looping structure
                  that starts high and goes low. This is an example of a count-controlled loop. Other names
                  for a count-controlled loop are a finite loop or a quantifiable loop, meaning we can
                  specify a precise number of iterations the loop will execute. In Java, that is handled
                  with a for loop. 
    Authored by: Professor Tirrito & Students
    CMP128-81110: Computer Science I
    FALL 2024
    Paulina Mostek
    County College of Morris
    Date Last Modified: 11/06/2024
*/

//Import Libraries
import javax.swing.JOptionPane; //GUI Library for collecting input as String data.

public class NYEveCountdown
{
   public static void main(String [] args)
   {
      //Initialize variables
      char borderSymbol = '*';
      byte seconds = 0; //This is a byte in order to use less RAM
      
      //prompt and get input for border symbol
      borderSymbol = (JOptionPane.showInputDialog("What symbol would you like to use for" 
                        + " your banners? ")).charAt(0);
      //extrapolate character from the string and assign it to borderSymbol using .charAt();
         //We index by the first character, which is at index 0
      
      //call Welcome Banner method to send border symbol
      welcomeBanner(borderSymbol); //pass the argument borderSymbol from main to welcomeBanner
      
      //prompt and get number of seconds as a byte, which takes up less space in the ram
      seconds = Byte.parseByte(JOptionPane.showInputDialog("How many seconds? "));
      
      //FOR LOOP TO PROCESS THE NEW YEAR'S EVE COUNTDOWN
      for(int i = seconds; i > 0; i--)
      {
         JOptionPane.showMessageDialog(null, i + "..."); //display current value of seconds (i)
      }//end of for loop to process new year's eve countdown
      
      //Display Happy New Year message
      JOptionPane.showMessageDialog(null, "HAPPY NEW YEAR!!!!!!!!!!!!");
      
      //Call closing banner
      closingBanner(borderSymbol);
   
         }//end of public main method
         
         //OTHER METHODS DEFINED BELOW:
         public static void welcomeBanner(char symbol)
         {
            //INITIALIZE VARIABLE
            String topBorder = "";
            String bottomBorder = "";
            //DISPLAYING THE WELCOME BANNER
             for(int i = 0; i<80; i++) //prints a banner 60 characters long
                {
                    topBorder += symbol; //concatenates entered input (symbol) to the string borderLine
                    //loop contains 80 symbols
                }//end of for loop
                bottomBorder = topBorder;
       
            //This section prints the welcome banner
            System.out.println(topBorder); //top border
            System.out.println("*                   Welcome to the New Year's Eve Countdown App                 *");
            System.out.println("*                Written by: Professor Tirrito & CMP128 Students                *");
            System.out.println("*                           Date Modified: 11/06/2024                           *");
            System.out.println(bottomBorder + "\n"); //bottom border
         }//end of public welcomeBanner method
         
         public static void closingBanner(char symbol)
         {
            //INITIALIZE VARIABLE
            String topBorder = "";
            String bottomBorder = "";
            //DISPLAYING THE WELCOME BANNER
             for(int i = 0; i<80; i++) //prints a banner 60 characters long
                {
                    topBorder += symbol; //concatenates entered input (symbol) to the string borderLine
                    //loop contains 80 symbols
                }//end of for loop
                bottomBorder = topBorder;
                
            //DISPLAYING THE CLOSING BANNER
            System.out.println(topBorder); //top border
            System.out.println("*                This concludes the New Year's Eve Countdown App                *");
            System.out.println("*                Written by: Professor Tirrito & CMP128 Students                *");
            System.out.println("*                            Date Modified: 10/23/2024                          *");
            System.out.println(bottomBorder + "\n"); //bottom border
         }//end of public closingBanner method
         
}//end of public NYEveCountdown method