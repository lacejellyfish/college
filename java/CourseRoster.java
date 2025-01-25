/*
    CourseRoster.java: This is our eighth lesson in Java. We are reinforcing how to use Java selection
                        (decision) structures and Java repetition (looping) structures in this application.
                        We are also reinforcing how to use programmer-defined functions (methods)
                        in this application. We will introduce the concepts of multi-compartmentalized
                        containers through the use of objects called arrays to store simple lists in this
                        assignment. This covers content from chapters 3-5 and part of chapter 7. The theme
                        for this lesson is an application that creates and displays the names of all people
                        enrolled in this course as a professor or student.
    Authored by: Professor Tirrito & Students
    CMP128-81110: Computer Science I
    FALL 2024
    Paulina Mostek
    County College of Morris
    Date Last Modified: 11/13/2024
    HAPPY VETERANS' DAY. THANK YOU TO ALL THOSE WHO HAVE SERVED OUR COUNTRY AND CONTINUE TO DEFEND US.
*/

//Import Libraries
import java.util.Scanner;
import javax.swing.JOptionPane;

public class CourseRoster
{
   public static void main(String [] args)
   {
      //Initialize variables
      char borderSymbol = ' ';
      String [] membership = new String[20]; //array containing 19 strings
      int userChoice = 0;
      int sentinel = 0;
      
      //prompt and set borderSymbol
      borderSymbol = (JOptionPane.showInputDialog("What symbol would you like to use for" 
                        + " your banners? ")).charAt(0);
                        
      //call populateMembership and send membership array
      populateMembership(membership);
      
      /* START OF POST-TEST DO/WHILE LOOP STRUCTURE */
      do
      {
         //call welcomebanner
         welcomeBanner(borderSymbol);
         //call main menu, return userChoice
         userChoice = mainMenu(); 
         //call process menu, send userChoice and membership, catch returned userChoice
         userChoice = processMenu(userChoice, membership);
         //copy user choice into sentinel
         sentinel = userChoice;
      }//end of post-test do/while loop
      while(sentinel != -1); //loop will run at least once and check that sentinel is not -1
      
      //call closingbanner
     
   
   }//end main
   
   //OTHER METHODS DEFINED HERE:
   //populateMembership (membership)
      //count controlled 0-19, enter course name: set into course names list at index i
    
    //Welcome Banner
    public static void welcomeBanner(char symbol)
         {
            //INITIALIZE VARIABLE
            String topBorder = "";
            String bottomBorder = "";
            String borderSymbol = "";
            //DISPLAYING THE WELCOME BANNER
             for(int i = 0; i<80; i++) //prints a banner 60 characters long
                {
                    topBorder += borderSymbol; //concatenates entered input (symbol) to the string borderLine
                    //loop contains 80 symbols
                }//end of for loop
                bottomBorder = topBorder;
       
            //This section prints the welcome banner
            System.out.println(topBorder); //top border
            System.out.println("*                        Welcome to the Course Roster App                       *");
            System.out.println("*                Written by: Professor Tirrito & CMP128 Students                *");
            System.out.println("*                           Date Modified: 11/13/2024                           *");
            System.out.println(bottomBorder + "\n"); //bottom border
         }//end of public welcomeBanner method

   //main menu
      /* set variables: dashline "|" pipe symbol
            choice: 0
            keyboard: standard input buffer
      count controlled loop for dash line 0-78, +1, append a dash into dash and loop back
      append a pipe symbol into dash line
      display MAIN MENU
      display dash line
      display "| 1. Professor's name |"
      display "| 2. STudent 1's name |"
      etc
      display "| 20. print entire course list |", to 80 characters
      display "| 21. Exit the COurse ROster App |", to 80 characters
      display dash line
      display "Make your selection ==>"
      get and set choice
      return choice
      */
   //PROCESS MENU (user choice, members)
         /*
         */
   //Closing banner
   public static void closingBanner(char symbol)
         {
            //INITIALIZE VARIABLE
            String topBorder = "";
            String bottomBorder = "";
            String borderSymbol = "";
            //DISPLAYING THE WELCOME BANNER
             for(int i = 0; i<80; i++) //prints a banner 60 characters long
                {
                    topBorder += borderSymbol; //concatenates entered input (symbol) to the string borderLine
                    //loop contains 80 symbols
                }//end of for loop
                bottomBorder = topBorder;
                
            //DISPLAYING THE CLOSING BANNER
            System.out.println(topBorder); //top border
            System.out.println("*                     This concludes the Course Roster App                      *");
            System.out.println("*                Written by: Professor Tirrito & CMP128 Students                *");
            System.out.println("*                            Date Modified: 11/13/2024                          *");
            System.out.println(bottomBorder + "\n"); //bottom border
         }//end of public closingBanner method
   public static int mainMenu() //this returns an int
   {
      //INITIALIZING LOCAL SCOPE METHOD VARIABLES
      String dashLine = "|";
      int choice = 0;
      Scanner keyboard = new Scanner(System.in); //scanner object for input
      
      for(int i = 0; i < 78; i++)
      {
         dashLine += "-";
      }//end of for loop
      
      dashLine += "|"; //append pipe to dashLine
      
      System.out.println(dashLine);
      System.out.println("MAIN MENU");
      System.out.println(dashLine);
      System.out.println("| 1. Print Professor's Name                                                      |");
      System.out.println("| 2. Print Student #1's Name                                                     |");
      System.out.println("| 3. Print Student #2's Name                                                     |");
      System.out.println("| 4. Print Student #3's Name                                                     |");
      System.out.println("| 5. Print Student #4's Name                                                     |");
      System.out.println("| 6. Print Student #5's Name                                                     |");
      System.out.println("| 7. Print Student #6's Name                                                     |");
      System.out.println("| 8. Print Student #7's Name                                                     |");
      System.out.println("| 9. Print Student #8's Name                                                     |");
      System.out.println("| 10. Print Student #9's Name                                                    |");
      System.out.println("| 11. Print Student #10's Name                                                   |");
      System.out.println("| 12. Print Student #11's Name                                                   |");
      System.out.println("| 13. Print Student #12's Name                                                   |");
      System.out.println("| 14. Print Student #13's Name                                                   |");
      System.out.println("| 15. Print Student #14's Name                                                   |");
      System.out.println("| 16. Print Student #15's Name                                                   |");
      System.out.println("| 17. Print Student #16's Name                                                   |");
      System.out.println("| 18. Print Student #17's Name                                                   |");
      System.out.println("| 19. Print Student #18's Name                                                   |");
      System.out.println("| 20. Print Student #19's Name                                                   |");
      System.out.println("| 21. Print Entire Course List                                                   |");
      System.out.println("| 22. EXIT THE COURSE ROSTER APP                                                 |");
      System.out.println(dashLine);
      System.out.println("Make your selection now ==> ");
      
      //get and set choice with scanner
      choice = keyboard.nextInt();
      return choice;
   }//end of mainMenu
   
   public static void populateMembership(String [] courseMembers) 
   {
      //the string array is called courseMembers inside of the class. outside of the class, it is called membership.
      //these 2 different objects in the ram point to the same data.
      
      JOptionPane.showMessageDialog(null, "We will collect 20 course members from you at this time.");
      for(int i = 0; i < 19; i++)
      {  //prompt for course member name and assign it to index "i" in membership list
         courseMembers[i] = JOptionPane.showInputDialog("Enter a course member name (starting with Professor): ");
         
      }//end of for loop
      JOptionPane.showMessageDialog(null, "The membership list has been populated.");
   }//end of populateMembership()
   
   public static int processMenu(int choice, String [] courseMembers)
   {
      switch(choice)
      {
         case 1:
            System.out.println(courseMembers[0]);
            break;
         case 2:
            System.out.println(courseMembers[1]);
            break;
         case 3:
            System.out.println(courseMembers[2]);
            break;
         case 4:
            System.out.println(courseMembers[3]);
            break;
         case 5:
            System.out.println(courseMembers[4]);
            break;
         case 6:
            System.out.println(courseMembers[5]);
            break;
         case 7:
            System.out.println(courseMembers[6]);
            break;
         case 8:
            System.out.println(courseMembers[7]);
            break;
         case 9:
            System.out.println(courseMembers[8]);
            break;
         case 10:
            System.out.println(courseMembers[9]);
            break;
         case 11:
            System.out.println(courseMembers[10]);
            break;
         case 12:
            System.out.println(courseMembers[11]);
            break;
         case 13:
            System.out.println(courseMembers[12]);
            break;
         case 14:
            System.out.println(courseMembers[13]);
            break;
         case 15:
            System.out.println(courseMembers[14]);
            break;
         case 16:
            System.out.println(courseMembers[15]);
            break;
         case 17:
            System.out.println(courseMembers[16]);
            break;
         case 18:
            System.out.println(courseMembers[17]);
            break;
         case 19:
            System.out.println(courseMembers[18]);
            break;
         case 20:
            System.out.println(courseMembers[19]);
            break;
         case 21:
            for(int i = 0; i < 20; i++)
            {
               System.out.println(courseMembers[i]);  
            }//end for loop
            break;
          case 22:
            choice = Integer.parseInt(JOptionPane.showInputDialog("Are you sure you want to exit?" +
                                                " Enter -1 for yes or 0 for no ==> "));
            break;
          default:
            JOptionPane.showMessageDialog(null, "User input error. That is not a valid value for any menu option."
                                       + " Please try again!");
            choice = 0; //resets choice variable to avoid accidental program termination on bad -1 data entry
      }//end of switch statement
      return choice;
   }//end of processMenu()
   
}//CourseRoster