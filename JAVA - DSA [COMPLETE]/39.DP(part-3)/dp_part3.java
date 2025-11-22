public class dp_part3 {

    //!  lec-01 Coin Change live class code
    // public static int coinChange(int coins[], int sum){
    //     int n = coins.length;
    //     int dp[][] = new int[n+1][sum+1];

    //     //initialize -- sum is 0
    //     //i -> coins; j-> sum/change
    //     for(int i=0; i<n+1; i++){
    //         dp[i][0] = 1;

    //     }
    //     for(int j=1; j<sum+1; j++){
    //         dp[0][j] = 0;
    //     }
    //     //O(N*SUM)
    //     for(int i=1; i<n+1; i++){
    //         for(int j=1; j<sum+1; j++){
    //              if (coins[i-1] <= j) { //valid
    //                 dp[i][j] = dp[i][j-coins[i-1]] + dp[i-1][j];
                    
    //              }else{
    //                 dp[i][j] = dp[i-1][j];
    //              }
    //         }
    //     }

    //     return dp[n][sum];
    // }
 
    //!  lec-02 Rod-cutting code
    // public static int rodcutting(int length[], int price[], int totRod){
    //      int n = price.length;
    //      int dp [][] = new int [n+1] [totRod+1];

    //      for(int i=0; i<n+1; i++){
    //          for(int j=0; j<totRod+1; j++){
    //             if (i==0 || j==0) {
    //                 dp[i][j] = 0;
    //             }
    //          }
    //      }

    //      for(int i=1; i<n+1; i++){
    //         for(int j=1; j<totRod+1; j++){
    //             //valid
    //             if (length[i-1] <= j) {
    //                 dp[i][j] = Math.max(price[i-1] + dp[i][j-length[i-1]], dp[i-1][j]);
    //             }else{ //invalid
    //                dp[i][j] = dp[i-1][j];
    //             }
    //         }
    //      }

    //      return dp[n][totRod];
    // }


    //! lec-03 Longest common subsequence(Recursion code)
    // public static int lcs(String str1, String str2, int n, int m){
    //     if (n==0 || m==0)  {
    //          return 0;
    //     }
    //     if (str1.charAt(n-1) == str2.charAt(m-1)) { //same
    //         return lcs(str1, str2, n-1, m-1)+ 1;

    //     }else{ // diff
    //         int ans1 = lcs(str1, str2, n-1, m);
    //         int ans2 = lcs(str1, str2, n, m-1);
    //         return Math.max(ans1, ans2);

    //     }
    // }

    //! lec-04 lcs2 (memoization code)
//     public static int lcs2(String str1, String str2, int n, int m, int dp[][]) {
//     // Base case: if one string is empty, LCS length is 0
//     if (n == 0 || m == 0) {
//         return 0;
//     }

//     // Check if result already computed
//     if (dp[n][m] != -1) {
//         return dp[n][m];
//     }

//     // If characters match, include this character in LCS
//     if (str1.charAt(n - 1) == str2.charAt(m - 1)) {
//         dp[n][m] = lcs2(str1, str2, n - 1, m - 1, dp) + 1;
//     } 
//     // If not matching, find max of two possibilities
//     else {
//         int ans1 = lcs2(str1, str2, n - 1, m, dp);
//         int ans2 = lcs2(str1, str2, n, m - 1, dp);
//         dp[n][m] = Math.max(ans1, ans2);
//     }

//     return dp[n][m];
// }

   public static int lcsTab(String str1, String str2) {
    int n = str1.length();
    int m = str2.length();

    int[][] dp = new int[n+1][m+1];

    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= m; j++) {
            if (str1.charAt(i-1) == str2.charAt(j-1)) {
                dp[i][j] = dp[i-1][j-1] + 1;
            } else {
                dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
    }

    return dp[n][m];
}


    public static void main(String[] args) {
        //lec 01
    //     int coins [] = {2, 5, 3, 6};
    //     int sum = 10; // ans=5
    //    System.out.println("possible ways are as : " + coinChange(coins, sum));
    // lec 02
        //   int length[] = {1, 2, 3, 4, 5, 6, 7, 8}; // pieces length
        //   int price[] = {1, 5, 8, 9, 10, 17, 17, 20};
        //   int totRod = 8;
          
        //   System.out.println("rod-cutting final answer " + rodcutting(length, price, totRod));

        // lec -03
        // String str1 = "abcdge";
        // String str2 = "abedg" ; // lcs = "abdg"; length=4
        // System.out.println(lcs(str1, str2, str1.length(), str2.length()));
       

        // lec-04 
        // int n = str1.length();
        // int m = str2.length();
        // int dp[][] = new int[n+1][m+1];
        //   //initialization
        // for(int i=0; i<n+1; i++){
        //      for(int j=0; j<m+1; j++){
        //          dp[i][j] = -1;
        //      }
        // }

        // System.out.println("Final result for memoization = " + lcs2(str1, str2, n, m, dp));

  
        String str1 = "abcdge";
        String str2 = "abedg" ; // lcs = "abdg"; length=4

         System.out.println("lcs tabulation answer = " + lcsTab(str1, str2));
   
    }

    
}
