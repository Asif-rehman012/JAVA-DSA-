import java.util.Scanner;

public class conditions {
    public static void main(String[] args) {

        // lec 1 if-else st
        // int age = 15;
        // if (age >= 18) {
        // System.out.println("Your age is = " + age);
        // System.out.println("you are adult and can drive a car");

        // }
        // if (age > 13 && age < 18) {
        // System.out.println("not adult but you can get a lerner liecence");
        // }

        // else {
        // System.out.println("you are not adult and can't drive a car");
        // }

        // lecture 2
        // int a = 3;
        // int b = 3;

        // if (a >= b) // it can even work without curly braces as {} are used for
        // multiple statements
        // System.out.println("Number a is greater than b");

        // else {
        // System.out.println("b is greater than a");
        // }

        // lecture 3

        Scanner sc = new Scanner(System.in);

        // int num = sc.nextInt();
        // if (num % 2 == 0) {
        // System.out.println(" Given number ia an even num");

        // } else {
        // System.out.println("num is odd");
        // }

        // lec 5 else-if
        // int age = 22;
        // if (age == 18) {
        // System.out.println("you are adult"); // if cond is true next cond isn't
        // checked
        // } else if (age >= 19 && age <= 40) {
        // System.out.println("you are man");
        // } else {
        // System.out.println("you are not adult");
        // }

        // lec 6 INCOME TAX CALCULATOR
        // int income = sc.nextInt();
        // int tax; // java will automatically assign it 0
        // if (income <= 5) {
        // System.out.println(" you have to pay 0% tax");
        // } else if (income <= 10) {
        // System.out.println("you have to pay 20% tax");
        // } else {
        // System.out.println("30% tax");
        // }

        // OR ANOTHER WAY
        // if (income < 500000) {
        // tax = 0;
        // } else if (income >= 500000 && income < 1000000) {
        // tax = (int) (income * 0.2); // error may occur as its combination of int &
        // float DO TYPE CASTING
        // } else {
        // tax = (int) (income * 0.3);
        // }

        // System.out.println(" your tax amount is = " + tax);

        // lecture 7 largest of 3 nos
        // int a = 1, b = 88, c = 6;

        // if ((a >= b) && (a < c)) {
        // System.out.println("print a is largest");

        // } else if (b >= c) {
        // System.out.println("b is largest");
        // } else {
        // System.out.println(" c is largest of 3");
        // }

        // lecture 8 ternary operater if else shortcut (3 operands)
        // int number = 44;
        // String checkit = (43 % 2 == 0) ? "even" : "odd";
        // System.out.println(checkit);

        // lec 9 :::::: check a student will pass or fail
        // with ternary operator
        // int submarks = 34;
        // String reportcard = (submarks >= 33) ? "pass" : "fail";
        // System.out.println(reportcard);

        // lec 10 switch statements

        // int num = sc.nextInt();
        // // int num =2; can also use char ch= "b"
        // switch (num) { // testing kr rhai number kai liyai
        // case 1:
        // System.out.println("sunday");

        // break;
        // case 2:
        // System.out.println("monday");
        // break;
        // case 3:
        // System.out.println("tuesday");
        // break;

        // default:
        // System.out.println("reality mai sakoon");
        // break;
        // }

        // lec 11 CALCULATOR USING SWITCH STATEMENTS
        System.out.println("enter a value =");
        int a = sc.nextInt();
        System.out.println(" enter b vaalue= ");

        int b = sc.nextInt();
        System.out.println("enter operator");
        char operator = sc.next().charAt(0); // next() sai string aati but we need char so use charAt.

        switch (operator) {
            case '+':
                System.out.println(a + b);

                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
            case '/':
                System.out.println(a % b);

            default:
                break;
        }
    }

}
