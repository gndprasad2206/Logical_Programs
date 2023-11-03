import java.util.Scanner;

/*Question 3: 

You are a software developer working on a student grade analysis program. Your task is to develop a program that allows users to enter the grades for each student and perform various operations, such as calculating the average grade, finding the highest and lowest grades, and determining the number of students who passed or failed based on a pass mark of 50. 

Sample Input and Output: 

Welcome to the Student Grade Analyzer! 

Enter the number of students: 5 

Enter the grades for each student: 

Student 1: 85 

Student 2: 90 

Student 3: 76 

Student 4: 68 

Student 5: 92 

 

Average Grade: 82.2 

Highest Grade: 92 

Lowest Grade: 68 

Passing Grade: 70 

Number of students who passed: 3 

Number of students who failed: 2 

Thank you for using the Student Grade Analyzer! */
import java.util.Scanner;
import java.util.Arrays;
class GreadingStudent{
  public void greadStudents(int studentGreads[],int studentCount){
    int sum=0,passCount=0,failCount=0;
    float avg=0;
    for(int i=0;i<studentGreads.length;i++){
      sum=sum+studentGreads[i];
      if(studentGreads[i]>=50){
        passCount++;
      }
      else{
        failCount++;
      }
    }
    avg=(float)sum/(float)studentCount;
    Arrays.sort(studentGreads);
    System.out.println("Average Grade: "+avg);
    System.out.println("Highest Grade: "+studentGreads[studentGreads.length-1]);
    System.out.println("Lowest Grade: "+studentGreads[0]);
    System.out.println("Number of students who passed: "+passCount);
    System.out.println("Number of students who failed: "+failCount);
    System.out.println("Thank you for using the Student Grade Analyzer!");
  }
  
} 
public class GreadingStudentMain{
  public static void main(String[] args){
    int studentsCount;
    Scanner sc=new Scanner(System.in);
    System.out.println("Welcome to the Student Grade Analyzer!");
    System.out.println("Enter the number of students");
    studentsCount=sc.nextInt();
    int studentGreads[]=new int[studentsCount];
    System.out.println("Enter the grades for each student");
    for(int i=0;i<studentsCount;i++){
      studentGreads[i]=sc.nextInt();
    }
    GreadingStudent call=new GreadingStudent();
    call.greadStudents(studentGreads,studentsCount);
  }
}