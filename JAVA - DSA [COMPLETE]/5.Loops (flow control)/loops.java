import java.util.Scanner;

public class loops {
    public static void main(String[] args) {

        // lec 2 WHILE LOOP
        // int counter = 0;
        // while (counter < 20) {
        // System.out.println("Hello world " + counter);

        // counter++;
        // }
        // System.out.println("printex 100X");
        //

        // lec 3 print nums from 1 to 10
        // int num = 1;
        // while (num <= 10) {
        // System.out.print(num + " "); // double quotes kai bech mai space doo

        // num++;

        // }
        // System.out.println(" 10 numbers printed");

        // lec 6 sum of first n numbers
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int sum = 0;
        // int i = 1; // iterator

        // while (i <= n) {
        // sum += i;
        // i++;

        // }
        // System.out.println("som :::" + sum);

        // for (int i = 0; i <= 20; i++) { // can alse use i=i+1
        // System.out.println(i);
        // }

        // lec 8 PRINT SQUARE
        // for (int i = 1; i <= 4; i++) {
        // System.out.println("* * * *"); // "****" **** **** ****
        // }

        // lec 9 PRINT REVERSE OF NUM using while loop

        // int n = 10899;

        // while (n > 0) {

        // int lastDigit = n % 10;
        // System.out.print(lastDigit);
        // n = n / 10; // n/=10
        // }
        // System.out.println();

        // lec 10 reverse given no 10899
        // int n = 10899;
        // int rev = 0; // this time we have to calculate rev no too

        // while (n > 0) { // jb tkk n is greater than 0 till that time
        // int lastdigit = n % 10;
        // rev = (rev * 10) + lastdigit;
        // n = n / 10;

        // }
        // System.out.println(rev);

        // lec 11 do while loop
        // int counter = 2;
        // do {
        // System.out.println("hello world" + counter);
        // counter++;
        // } while (counter <= 10);

        // lec12 Break st
        // for (int i = 1; i <= 5; i++) {
        // if (i == 3) {
        // break;

        // }

        // System.out.println(i);
        // }
        // System.out.println("i'm out of the loop");

        // lecture 13

        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter your number");
        // do {
        // int n = sc.nextInt();
        // if (n % 10 == 0) { // multiple 10 sai exit ho
        // break;

        // }
        // System.out.println(n);
        // } while (true);

        // lecture 12 continue statement
        // for (int i = 0; i <= 10; i++) {

        // if (i == 7) {
        // continue; //it will skip that number

        // }
        // System.out.println(i);

        // }

        // lecture 15 QUESTION CONTINUE KEYWORD
        // DIAPLAY ALL NUMBERS ENTERED BY USER EXCEP MULTIPLE OF 10

        Scanner sc = new Scanner(System.in);

        // do {
        // int num = s.nextInt();
        // if (num % 10 == 0) { //skip 10 walai
        // continue;
        // }
        // System.out.println(num);
        // } while (true);

        // 16 check if a number is prime or not
        // int num = s.nextInt();
        // if (num % 2 == 0) {
        // System.out.println("it is a prime number");
        // } else {
        // System.out.println("it ia odd number");
        // }

        // or

        // for (int num = 0; num <= 20; num++) {
        // int ab = sc.nextInt();
        // if (num % 2 == 0) {
        // System.out.println("even");
        // } else {
        // System.out.println("odd");
        // }
        // System.out.println(ab);
        // }

        // int n = sc.nextInt();
        // if (n == 2) {
        // System.out.println("n is prime");
        // } else {
        // boolean isPrime = true;
        // for (int i = 2; i <= Math.sqrt(n); i++) {
        // if (n % i == 0) {
        // isPrime = false;

        // }
        // }
        // if (isPrime == true) {
        // System.out.println("n is prime");

        // } else {
        // System.out.println(" n is not prime");
        // }
        // }

    }
}
