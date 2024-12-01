import java.util.Scanner;

public class ClimbingStairs {
      static int solve(int n ){

            if(n == 0){
                  return 1;
            }
            if(n <0){
                  return 0;
            }
            int totalWay=0;
            totalWay += solve(n-1);
            totalWay += solve(n-2);

            return totalWay;
      }
      public static void main(String[] args) {
            System.out.println("Enter steps to reach the top : ");
            Scanner sc = new Scanner(System.in);
            int n  = sc.nextInt();
            System.out.print(solve(n));
            sc.close();
      }
}

