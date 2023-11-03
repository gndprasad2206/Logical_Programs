/* JFM1T4_Assignment1:
   Write a program to find the highest among the given 3 numbers.
   Prompt the user for the 3 numbers to be input from the terminal.

   SampleInput: 
   Enter the first number: 11
   Enter the second number: 22
   Enter the third number: 1

   Expected Output:
   22 is highest number
 	
*/

//import statements for java program to read inputs using Scanner class 
import java.util.Scanner;

public class HighestNumber {
  public static void main(String[] args){
    int number_1,number_2,number_3;
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the number_1 value");
    number_1=sc.nextInt();
    System.out.println("Enter the number_2 value");
    number_2=sc.nextInt();
    System.out.println("Enter the number_3 value");
    number_3=sc.nextInt();
    int max=number_1;
    if(max<number_2){
      max=number_2;
      if(max<number_3){
        max=number_3;
      }
    }
    else{
      if(max<number_3){
        max=number_3;
      }
    }
    System.out.println("The max of three numbers is = "+max);
  }
}