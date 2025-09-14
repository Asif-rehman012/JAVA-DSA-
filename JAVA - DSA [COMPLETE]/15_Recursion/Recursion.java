
public class Recursion {
    // // ! L2 print numbers in decreasing order
    // public static void printDecno(int n) {
    // // we would define base case too if n==1 then print & return
    // if (n == 1) {
    // System.out.print(n);
    // return;
    // }
    // System.out.print(n + " ");
    // printDecno(n - 1);
    // }

    // // ! L4 print numbers from n to 1 (increasing order)
    // public static void printINC(int n) {
    // if (n == 1) {
    // System.out.print(n + " ");
    // return;

    // }
    // printINC(n - 1); // call krai gai
    // System.out.print(n + " ");
    // }

    // ! L5 Find factorial of n
    // public static int fact(int n) {
    // if (n == 0) {
    // return 1; // static int

    // }

    // int fnm1 = fact(n - 1);
    // int fn = n * fact(n - 1);
    // return fn;
    // }

    // ! L6 sum of nat numbers
    // public static int calcSum(int n) {
    // if (n == 1) {
    // return 1;
    // }
    // int Snm1 = calcSum(n - 1);
    // int Sn = n + Snm1;
    // return Sn;
    // }

    // ! L7 Print Nth Fibonacci number
    // public static int fib(int n) {
    // if (n == 0 || n == 1) {
    // return n;
    // }
    // int fnm1 = fib(n - 1);
    // int fnm2 = fib(n - 2);
    // int fn = fnm1 + fnm2;
    // return fn;
    // }

    // ! L8 Check if array is sorted or not
    // public static boolean isSorted(int arr[], int i) {
    // if (i == arr.length - 1) {
    // return true;
    // }

    // if (arr[i] > arr[i + 1]) {
    // return false;
    // }

    // return isSorted((arr), i + 1);
    // }

    // ! L9 first occurrence
    // public static int firstOccurence(int arr[], int key, int i) {
    // if (i == arr.length) {
    // return -1;
    // }
    // if (arr[i] == key) {
    // return i;
    // }

    // return firstOccurence(arr, key, i + 1);
    // }

    // !L10 last occurance
    // public static int lastOccurence(int arr[], int key, int i) {
    // if (i == arr.length) {
    // return -1;
    // }

    // int isFound = lastOccurence(arr, key, i + 1);
    // if (isFound == -1 && arr[i] == key) {
    // return i;
    // }
    // return isFound;
    // }

    // ! L11 print x to the power n Problem 9
    // public static int power(int x, int n) {
    // if (n == 0) { // base case
    // return 1;
    // }

    // return x * power(x, n - 1); // recursion line
    // }

    // ! L12 print x to the power n (Optimized)
    // public static int OptimizedPower(int a, int n) {
    // if (n == 0) {
    // return 1;
    // }
    // int halfpower = OptimizedPower(a, n / 2);
    // int halfpowerSq = halfpower * halfpower;

    // // n is odd
    // if (n % 2 != 0) {
    // halfpowerSq = a * halfpowerSq;
    // }
    // return halfpowerSq;
    // }

    // ! L14 Tiling problem code
    // public static int tilingProblem(int n) { // 2*n (floor size)
    // // base case
    // if (n == 0 || n == 1) {
    // return 1;
    // }

    // // kaam
    // // vertical choice
    // int fnm1 = tilingProblem(n - 1);

    // // horizontal choice
    // int fnm2 = tilingProblem(n - 2);

    // int totways = fnm1 + fnm2;
    // return totways;
    // }

    // ! L15 Remove Duplicates in a String

    // public static void removeDuplicates(String str, int idx, StringBuilder
    // newStr, boolean map[]) {
    // if (idx == str.length()) {
    // System.out.println(newStr);
    // return;
    // }

    // // kaam
    // char currChar = str.charAt(idx);
    // if (map[currChar - 'a'] == true) {
    // // duplicate
    // removeDuplicates(str, idx + 1, newStr, map);
    // } else {
    // map[currChar - 'a'] = true;
    // removeDuplicates(str, idx + 1, newStr.append(currChar), map);
    // }
    // }

    // ! L16 Friends Pairing Problem [problem 13]
    // public static int friendsPairing(int n) {
    // if (n == 1 || n == 2) {
    // return n;

    // }
    // // choice
    // // single
    // int fnm1 = friendsPairing(n - 1);

    // // pair
    // int fnm2 = friendsPairing(n - 2);
    // int pairWays = (n - 1) * fnm2;

    // // totways
    // int totWays = fnm1 + pairWays;
    // return totWays;
    // // ? this sinle below line did all work of above lines
    // return friendsPairing(n - 1) + (n - 1) * friendsPairing(n - 2);
    // }

    // ! L18 Binary Strings problem
    public static void printBinStrings(int n, int lastPlace, String str) {
        // base case
        if (n == 0) {
            System.out.println(str);
            return;
        }
        // kaam
        printBinStrings(n - 1, 0, str + "0");
        if (lastPlace == 0) {
            printBinStrings(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {

        // int n = 22; //use this line uptoL7
        int arr[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
        // System.out.println(firstOccurence(arr, 5, 0)); // 5 should be availabe in arr
        // System.out.println(isSorted(arr, 0));
        // printDecno(n);
        // printINC(n);
        // System.out.println("factorial of " + n + " = " + fact(n));
        // System.out.println(calcSum(n));
        // System.out.println(fib(n));
        // System.out.println(fib(23));
        // System.out.println(lastOccurence(arr, 5, 0));
        // System.out.println(power(5, 2));
        // System.out.println(tilingProblem(4));
        // String str = "appnnacollege";
        // removeDuplicates(str, 0, new StringBuilder(), new boolean[26]);
        // System.out.println(friendsPairing(4));
        printBinStrings(3, 0, "");
    }
}