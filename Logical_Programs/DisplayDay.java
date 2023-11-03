/*
  JFM1T4_Assignment2:
  Write a program to display the name of the day, based on the number, using the switch statement.
  Prompt the user to input a number between 1 and 7. 
  
  Sample Input: 1
  
  Expected Output: Monday
  
*/

//import statements for java program to read inputs using Scanner class 
import java.util.Scanner;

public class DisplayDay {
  public static void main(String[] args){
    int day_number;
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the day number");
    day_number=sc.nextInt();
    switch(day_number){
      case 1:
        System.out.println("Sunday");
        break;
      case 2:
        System.out.println("Monday");
        break;
      case 3:
        System.out.println("Tuesday");
        break;
      case 4:
        System.out.println("Wednesday");
        break;
      case 5:
        System.out.println("Thursday");
        break;
      case 6:
        System.out.println("Friday");
        break;
      case 7:
        System.out.println("Saturdat");
        break;
      default:
        System.out.println("Enter the correct week nnumber");
        
    }
  }
     
}