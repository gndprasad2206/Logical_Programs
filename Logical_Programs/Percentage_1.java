//JFM1T3_Assignment2:
/*
1.Write a program to calculate your percentage assuming total marks given. Print the percentage after rounding it off. 
  Allow user to input the marks from the terminal. 

  Sample Input:
        maximum_marks=500
        total_marks=348

  Expected Output:
        percentage= 70%
       

*/

//import statements for java program to read inputs using Scanner class 
import java.util.Scanner;

public class Percentage_1{
  public static void main(String[] args){//Define the main method
    int total_Marks,maximum_Marks,percentage=0;//Declare the variables
    Scanner sc=new Scanner(System.in);//Use the scanner class to provide total_marks and maximum_marks at execution time
    System.out.println("Enter the Maximum marks");
    /*
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the total marks");
total_marks= scanner.nextInt();
System.out.println("Enter maximum marks possible "); 
maximum_marks=scanner.nextInt(); 
*/
    maximum_Marks=sc.nextInt();
    System.out.println("Enter the total marks");
    total_Marks=sc.nextInt();
    percentage=(total_Marks*100/maximum_Marks);//Calculate the percentage of marks
    System.out.println("Percentage ="+percentage);   //Print the Result
  }
}