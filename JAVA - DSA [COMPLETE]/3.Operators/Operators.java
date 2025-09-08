import java.util.Scanner;

public class Operators {

    public static void main(String args[]) {

        // Scanner operatorobj = new Scanner(System.in);

        // int a = 55;
        // int b = 5;
        // int c = 8;
        // System.out.println(a + b);
        // System.out.println(a - b);
        // System.out.println(a / b);
        // System.out.println(a % b);

        // int d = --c;

        // System.out.println(++c); // pre increment (increse first then print)
        // System.out.println(c++); // print value ist then increase
        // System.out.println(c); // updated value with post increment
        // System.out.println(d);

        // lecture 5 relational operators ==,!=,>,<,>=,<=
        // int a = 15;
        // int b = 5;
        // int c = 5;

        // System.out.println(a == b); // false
        // System.out.println(b == c); // true
        // System.out.println(a != b); // not equalto (true)
        // System.out.println(b != c); // false
        // System.out.println(a > c); // true(as a is bigger)
        // System.out.println(b < c); // in both cases <>it will return as false
        // System.out.println(a >= c); // true (equal)

        // lecture 6 Logical operators
        // System.out.println((7 > 3) && (9 > 3)); // t t =t
        // System.out.println((5 > 1) || (1 > 5)); // if both false then result false
        // System.out.println(!(44 > 21));

        // assignment operators lecture 7

        // int a = 10;
        // int b = 5;
        // a = a + 10;
        // a += 10;
        // b -= 10;
        // a *= 5;
        // a /= 5;
        // System.out.println(a);// 20
        // System.out.println(b);// -5
        // System.out.println(a);

        int x = 2, y = 5;
        int exp1 = (x * y / x);
        int exp2 = (x * (y / x));
        System.out.print(exp1 + " -----5 is result");
        System.out.println(exp2);

    }

}
