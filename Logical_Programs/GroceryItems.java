/* JFM1T5_Assignment 2:

   Write a program to store your 10 different expenses done in this month and print the highest price you incurred.
   Prompt the user for the 10 numbers to be input from the terminal.
   Sample Input:
   45.90
   23.56
   123
   23
   90.00
   344
   44
   60.01
   267
   100
   
   Expected Output:

   The highest price you incurred is 344.0

*/

import java.util.Scanner;

public class GroceryItems {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the range of array");
    int n=sc.nextInt();
    double arr[]=new double[n];
    System.out.println("Enter the values into array");
    for(int i=0;i<n;i++){
      arr[i]=sc.nextDouble();
    }
    double high=0;
    for(int i=0;i<n;i++){
      if(high<arr[i])
        high=arr[i];
    }
    System.out.println("The highest price you incurred is "+high);
  }

}
