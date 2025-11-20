public class dp_part2 {

    //! lec-02 Knapsack (Recurssion code)
// public static int knapsack(int val[], int wt[], int W, int n){
//      if (W == 0 || n==0) {
//         return 0;
//      }

//   if (wt[n-1] <= W) { //valid
//     //include
//     int ans1 = val[n-1]+knapsack(val, wt, W-wt[n-1], n-1);
//     //exclude
//     int ans2 = knapsack(val, wt, W, n-1);
//     return Math.max(ans1, ans2);
//   }else{ // not valid
//      return knapsack(val, wt, W, n-1);
     
//   }
// }


//! lec-03 KnapSack (Memoization code )
   
  public static int knapsack(int val[], int wt[], int W, int n, int dp[][]){
     if (W == 0 || n==0) {
        return 0;
     }

     if (dp[n][W] !=-1) {
        return dp[n][W];
     }

  if (wt[n-1] <= W) { //valid
    //include
    int ans1 = val[n-1]+knapsack(val, wt, W-wt[n-1], n-1, dp);
    //exclude
    int ans2 = knapsack(val, wt, W, n-1, dp);
    dp[n][W] = Math.max(ans1, ans2);
    return dp[n][W];
  }else{ // not valid
     dp[n][W] = knapsack(val, wt, W, n-1,dp);
     return dp[n][W];
  }
}


//! lec-04 ... 0-1 Knapsack(Tabulation code)
//it will print the table
// public static void print(int dp[][]){
//     for(int i=0; i<dp.length; i++){
//        for(int j=0; j<dp[0].length; j++){
//            System.out.print(dp[i][j]+ " ");
//        }
//        System.out.println();
//     }
//     System.out.println();
// }
//    public static int knapsackTab(int val[], int wt[], int W){
//       int n = val.length;
//       int dp[][] = new int [n+1][W+1];
//       for(int i=0; i<dp.length; i++){
//         dp[i][0] = 0;
//       }
//       for(int j=0; j<dp[0].length; j++){
//          dp[0][j] =0;
//       }

//       for(int i=1; i<n+1; i++){
//           for(int j=1; j<W+1; j++){
//              int v = val[i-1]; // ith item val
//              int w = wt[i-1]; // ith item wt
//              if (w <= j) { // valid
//                  int incProfit = v + dp[i-1][j-w];
//                  int excProfit = dp[i-1][j];
//                  dp[i][j] = Math.max(incProfit, excProfit);

              
//              }else{
//                 int excProfit = dp[i-1][j];
//                 dp[i][j] = excProfit;
//              }
//           }
//       }
//         print(dp);
//        return dp[n][W];
//    }

  //! lec-06 Target Sum SubSet (code )
  // public static boolean targetSumSubset(int arr[], int sum){
  //   int n = arr.length;
  //   boolean dp[][] = new boolean[n+1][sum+1];
  //   // i=items & j=target sum
  //   for(int i=0; i<n+1; i++){
  //     dp[i][0] = true;
  //   }

  //   for(int i=1; i<n+1; i++){
  //      for(int j=1; j<sum+1; j++){
  //        int v = arr[i-1];
  //        //include
  //        if (v <= j && dp[i-1][j-v] == true) {
  //           dp[i][j] = true;
  //        }
  //        //exclude
  //        else if (dp[i-1][j] == true) {
  //            dp[i][j] = true;
  //        }
  //      }
  //   }
  //    print(dp);
  //   return dp[n][sum];
  // }

  // public static void print(boolean dp[][]){
  //    for(int i=0; i<dp.length; i++){
  //     for(int j=0; j<dp[0].length; j++){
  //        System.out.print(dp[i][j]+ " ");
  //     }
  //     System.out.println();
  //    }
  //    System.out.println();
  // }

  //! lec-07 Unbounded knapsack (Tabulation code)

  public static int unboundedKnapsack(int val[], int wt[], int W){
    int n = val.length;
    int dp[][] = new int [n+1][W+1];

    for (int i=0; i<n+1; i++){
        dp[i][0] = 0;
    }
    for(int j=0; j<W+1; j++){
        dp[0][j] = 0;
    }

      for(int i=1; i<n+1; i++){
          for(int j=1; j<W+1; j++){
             if (wt[i-1] <= j) { //valid
                dp[i][j] = Math.max(val[i-1] + dp[i-1][j-wt[i-1]], dp[i-1][j]);
              
             }else{ //invalid
                 dp[i][j] = dp[i-1][j];
             }
          }
      }

       return dp[n][W];
  }


public static void main(String[] args) {
//     int val[] = {15, 14, 10, 45, 30};
//     int wt[] = {2, 5, 1, 3, 4};
//     int W=7;


//     System.out.println(knapsack(val, wt, W, val.length));
// }

//! lec-03 main code
    // int val[] = {15, 14, 10, 45, 30};
    // int wt[] = {2, 5, 1, 3, 4};
    // int W=7;

    // int dp[][] = new int[val.length+1][W+1];
    // for(int i=0; i<dp.length; i++){
    //     for(int j=0; j<dp[0].length; j++){
    //         dp[i][j] = -1;
    //     }
    // }

    // System.out.println(knapsack(val, wt, W, val.length, dp));

    //  System.out.println("The final value = " + knapsackTab(val, wt, W));
 
 
     //! lec 06 main drive code
    //  int arr[] = {4, 2, 7, 1, 3};
    //  int sum = 10;
    //  System.out.println(targetSumSubset(arr, sum));

    //!lec 07 main driver code
     int val[] = {15, 14, 10, 45, 30};
     int wt[] = {2, 5, 1, 3, 4};
     int W=7;

     System.out.println("unbounded final answer =" + unboundedKnapsack(val, wt, W));
  }



    
}
