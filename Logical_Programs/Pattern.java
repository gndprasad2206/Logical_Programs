/* JFM1T4_Assignment4:
   Write a program to print the following pattern:
     1 
     01 
     101 
     0101 
     10101 
*/

public class Pattern {
  public static void main(String[] args){
    //Add main method here
    int n=5;
//Declare variable n and initialize value as 5
    int i=1;
    while(i<=n){
      int j=1;
      while(j<=i){
        if((i+j)%2==0){//Check whether the i and j are equal or not using for loop
          System.out.print(1);
        }
        else{//If i and j are equal check (i+j)%2==0 or not if zero then print one else print zero
          System.out.print(0);
        }
        j+=1;
      }
      i++;
      System.out.println();
    }
} 
}
