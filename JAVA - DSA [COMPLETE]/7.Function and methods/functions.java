import java.util.*;

public class functions {

    // ! Lecture 5-6.... syntax with parameters
    // public static void printhello() {
    // System.out.println("hello world");
    // System.out.println("hello world");
    // System.out.println("hello world");
    // // return 2;
    // }

    // // TODOd passing parameters int a & int b between paranthesis()
    // public static int calculateSum(int num1, int num2) {
    // // todo parameters or formal parameters{}
    // int sum = num1 + num2;
    // return sum;
    // }

    // public static void main(String args[]) {
    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // int sum = calculateSum(a, b); // arguments or actual parameters
    // // calculateSum(a, b); // calling a function
    // System.out.println("sum is : " + sum);

    // ! L=7 What happens in memory
    // ! L8 Call by value
    // swap values echange

    // public static void swap(int a, int b) {
    // // swap
    // int temp = a;
    // a = b;
    // b = temp;

    // System.out.println("a = " + a);
    // System.out.println("b = " + b);
    // }

    // public static void main(String[] args) {
    // // swap-- values exchange
    // int a = 5;
    // int b = 10;
    // swap(a, b);
    // }

    // ! Lecture9 product of a and b
    // public static int multiply(int a, int b) { // multiply function
    // int product = a * b;
    // return product;
    // }

    // public static void main(String args[]) {
    // int a = 3;
    // int b = 5;
    // int prod = multiply(a, b);
    // System.out.println("product of a and b = " + prod);
    // prod = multiply(10, 20);
    // System.out.println("product " + prod);
    // }
    // !L10 FIND FACTORIAL
    // TODOD Lets make factorial function below:-
    public static int factorial(int n) {
        int f = 1; // factorial iss f mai store hoga

        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f; // factorial of n
    }

    // public static void main(String[] args) {
    // System.out.println(factorial(4 ));

    // }

    // ! L11 FIND BINOMIAL COEFFICENT
    // public static int binCoeff(int n, int r) {
    // int fact_n = factorial(n);
    // int fact_r = factorial(r);
    // int fact_nmr = factorial(n - r);

    // int binCoeff = fact_n / (fact_r * fact_nmr);
    // return binCoeff;
    // }

    // public static void main(String[] args) {
    // System.out.println(binCoeff(5, 2));
    // }

    // ! L14 FUNCTION OVER-LOADING USING PARAMETERS
    // public static int sum(int a, int b) {
    // return a + b;
    // }

    // public static int sum(int a, int b, int c) {
    // return a + b + c;
    // }

    // public static void main(String[] args) {
    // System.out.println("print first function of sum = " + sum(5, 8));
    // System.out.println("second sum function : " + sum(77, 74, 74));
    // }

    // ! L15 FUNCTION OVER-LOADING USING data types
    // public static int sum(int a, int b) {
    // return a + b;
    // }

    // public static float sum(float a, float b, float c) {
    // return a + b + c;
    // }

    // public static void main(String[] args) {
    // System.out.println("print first function of sum = " + sum(5, 8));
    // System.out.println("second sum function : " + sum(5.3f, 7.5f, 75f));
    // }

    // ! L16 Check if num is prime or not

    // public static boolean isPrime(int n) {
    // // corner cases
    // // 2
    // if (n == 2) {
    // return true; // directly print it as prime number true
    // // it wouldn't check other below conditions
    // }

    // for (int i = 21; i <= n - 1; i++) {
    // if (n % i == 0) {

    // // todoo why would i wait to run whole program loop if i'm getting isprime
    // false
    // // EXIT
    // return false;
    // }
    // }
    // return true;
    // }

    // public static void main(String[] args) {
    // System.out.println(isPrime(20));
    // }

    // ! L17 CHECK PRIME OPTMISED

    // public static boolean isPrime(int n) {
    // // corner cases
    // // 2
    // if (n == 2) {
    // return true; // directly print it as prime number true
    // // it wouldn't check other below conditions
    // }

    // for (int i = 2; i <= Math.sqrt(n); i++) {
    // if (n % i == 0) {

    // // todoo why would i wait to run whole program loop if i'm getting isprime
    // false
    // // EXIT
    // return false;
    // }
    // }
    // return true;
    // }

    // public static void main(String[] args) {
    // System.out.println(isPrime(21));
    // }

    // ! L18 print all primes in a Range
    // n=10 (2,3,5,7)---> primes

    // public static boolean isPrime(int n) {

    // for (int i = 2; i <= Math.sqrt(n); i++) {
    // if (n % i == 0) {

    // // todoo why would i wait to run whole program loop if i'm getting isprime

    // // EXIT
    // return false;
    // }
    // }
    // return true;
    // }

    // public static void primesInRange(int n) {
    // for (int i = 2; i <= n; i++) {
    // if (isPrime(i)) {
    // System.out.print(i + " ");
    // }
    // }
    // System.out.println();
    // }

    // public static void main(String[] args) {
    // primesInRange(20); // 2-20
    // }

    // ! L20 CODE -- Binary to decimal
    // public static void binToDec(int binNum) {
    // // power variable bnana hai aur dec number
    // int myNum = binNum;
    // int pow = 0;
    // int decNum = 0;

    // // jbtk mara binary num 0 hai tbtk loop chlna chahiyai
    // while (binNum > 0) {
    // int lastDigit = binNum % 10;
    // decNum = decNum + (lastDigit * (int) Math.pow(2, pow));

    // pow++;
    // binNum = binNum / 10;
    // }
    // System.out.println("decimal of " + myNum + " = " + decNum);

    // }

    // public static void main(String[] args) {
    // binToDec(1101);
    // }

    // !l22 code::: decimal to binary
    public static void decToBin(int n) {
        int myNum = n;
        int pow = 0;
        int binNum = 0;

        while (n > 0) {
            int rem = n % 2; // rha remainder nikaltai hai
            // int mai kiya type caste
            binNum = binNum + (rem * (int) Math.pow(10, pow)); // yha actually binary answer calculate hota hai

            pow++; // yha power ++
            n = n / 2; // yha quetent nikaltai hai
        }
        System.out.println("decimal of " + myNum + " = " + binNum);

    }

    public static void main(String[] args) {
        decToBin(7);
    }
}