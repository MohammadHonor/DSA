import java.util.Arrays;
import java.util.Scanner;

public class ClimbingStairs {
      // By recursion 
      // static int solve(int n ){

      //       if(n == 0){
      //             return 1;
      //       }
      //       if(n <0){
      //             return 0;
      //       }
      //       int totalWay=0;
      //       totalWay += solve(n-1);
      //       totalWay += solve(n-2);

      //       return totalWay;
      // }

      // By dp 
      static int solveMemo(int n ,int dp[]){

            if(n == 0){
                  return 1;
            }
            if(n <0){
                  return 0;
            }
            if(dp[n]!=-1){
                  return dp[n];
            }
            int totalWay=0;
            totalWay+= solveMemo(n-1,dp);
            totalWay+= solveMemo(n-2,dp);
            dp[n]=totalWay;

            return dp[n];
      }
      public static void main(String[] args) {
            System.out.println("Enter steps to reach the top : ");
            Scanner sc = new Scanner(System.in);
            int n  = sc.nextInt();
            int []dp = new int[n+1];
            Arrays.fill(dp,-1);
            System.out.print(solveMemo(n, dp));
            sc.close();
      }
}

