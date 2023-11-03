/*Write a Java program to track the performance of a basketball team throughout a season. Implement an array to store the team's scores and the corresponding opposing team's scores for each game and calculate various statistics, such as the average score, highest score, and lowest score. Additionally, the program should display the number of games won and lost. Consider a game won if the team scores more points than the opposing team and lost if the team scores fewer points. If the scores are equal, it can be considered a tie or handled as per the specific requirements of the program. 

 

Sample Input: 

Enter the number of games played: 4 
Enter the scores for each game: 
Game 1 - Team's Score: 85 
Game 1 - Opposing Team's Score: 70 
Game 2 - Team's Score: 92 
Game 2 - Opposing Team's Score: 80 
Game 3 - Team's Score: 78 
Game 3 - Opposing Team's Score: 82 
Game 4 - Team's Score: 90 
Game 4 - Opposing Team's Score: 95 
  

Sample Output: 

Average Score: 86.25 
Highest Score: 95 
Lowest Score: 70 
Games Won: 2 
Games Lost: 2 
*/
import java.util.Scanner;
import java.util.Arrays;
class BasketBallGame{
  public void basketBall(int team1[],int team2[]){
    int sum=0,hightScore=0,lowScore=0,length=team1.length;
    float avg=0;
    for(int i=0;i<team1.length;i++){
      sum=sum+(team1[i]+team2[i]);
    }
    
    avg=(float)sum/(float)(team1.length*2);
    int win=0,lost=0;
    for(int i=0;i<length;i++){
      if(team1[i]>team2[i])
        win++;
      else
        lost++;
    }
    if(team1[0]<team2[0]){
      lowScore=team1[0];
    }
    else{
      lowScore=team2[0];
    }
    if(team1[length-1]<team2[length-1]){
      hightScore=team2[length-1];
    }
    else{
      hightScore=team1[length-1];
    }
    
    System.out.println("Average Score:"+(float)avg);
    System.out.println("Hight Score:"+hightScore);
    System.out.println("Low Score:"+lowScore);
    System.out.println("Game wins:"+win);
    System.out.println("Game lost:"+lost);
    
  }
}
public class BasketBallGameMain{
  public static void main(String[] args){
    int playedGames;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the numbers of games played");
    playedGames=sc.nextInt();
    int team1[]=new int[playedGames];
    int team2[]=new int[playedGames];
    System.out.println("Enter the first team scores");
    for(int i=0;i<playedGames;i++){
      team1[i]=sc.nextInt();
    }
    System.out.println("Enter the second team scores");
    for(int i=0;i<playedGames;i++){
      team2[i]=sc.nextInt();
    }
    BasketBallGame call=new BasketBallGame();
    call.basketBall(team1,team2);
  }
}
