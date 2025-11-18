import java.util.*;
public class Dp {


    //! Lec-01 Introduction to Dp(fibnonacci momozation Top-Down)

   public static int fib(int n, int f[]){
    if (n==0 || n==1) {
        return n;
    }

    if (f[n] !=0) {
        return f[n];
    }

    f[n] = fib(n-1, f) + fib(n-2, f);
    return f[n];
   } 

   //! lec-03 tabulation (bottum up approach)
   public static int fibTabulation(int n){
      int dp[] = new int [n+1];
      dp[0] = 0;
      dp[1] =1;
      for(int i=2; i<=n; i++){
         dp[i] = dp[i-1]+ dp[i-1];
      }

      return dp[n]; //ans
   }

   //! lec-05 Climbing Stairs(Using Recursion code)
   public static int countWays(int n){
       if (n == 0) {
           return 1;

       }
       if (n < 0) {
          return 0;
       }
       return  countWays(n-1) + countWays(n-2);
   }

   //! lec-06 Climbing Stairs(Memoization DP)
   public static int countWaysMemo(int n, int ways[]){
       if (n == 0) {
           return 1;

       }
       if (n < 0) {
          return 0;
       }
        if (ways[n] != -1) { //already calculated
            return ways[n];
            
        }

        ways[n] = countWaysMemo(n-1, ways) + countWaysMemo(n-2, ways); 
        return ways[n];
    }

    //! lec-08 Climbing Stairs(Tabulation DP)
    public static int countWaysTab(int n){
        int dp[] = new int [n+1];
        dp[0] = 1;

        for(int i=1; i<=n; i++){
            if (i == 1) {
                 dp[i] = dp[i-1] + 0;
            }else{
                dp[i] = dp[i-1] + dp[i-2];
            }

        }
        return dp[n];
    }

   public static void main(String[] args) {
    int n=5;
    int ways[] = new int[n+1]; // 0,0,0,,
    // System.out.println(fib(n, ways));
    // System.out.println(fibTabulation(5));
    // System.out.println(countWays(5));
    //!lec-06
    Arrays.fill(ways, -1);
    System.out.println(countWaysMemo(n, ways));
    System.out.println(countWaysTab(5));
   }
}
 