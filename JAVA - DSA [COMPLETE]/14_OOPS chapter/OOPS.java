
public class OOPS {

    // todo :: this main function does the program execution
    // its necessary to add public , static keyword in main function
    public static void main(String[] args) {

        // ! L1 TO L4 oops acc. modifiers, getter setter, encapsulation etc
        // // to create actual pen object in memory.... class ka name-- then p1 pen ka
        // name
        // // new sai memory kai andr space bnai ge jha sari properties store hogi
        // // Pen(); known as constructor
        // Pen p1 = new Pen(); // created pen obj called p1 in heap
        // p1.setColor("purple"); // call p1
        // System.out.println(p1.getColor()); // to access properties use dot .
        // p1.setTip(5000); // set kiya tip
        // System.out.println(p1.getTip()); // get kiya tip
        // ;

        // p1.setColor("black");
        // System.out.println(p1.getColor());

        // // ab bank acc ka object bnayai gai
        // BankAccount myAcc = new BankAccount();
        // myAcc.username = " Aasif Rehman";
        // myAcc.setPassword("mgkf0igm");
        // System.out.println(myAcc.username);

        // }

        // }
        // // todo Always try to make other classes below Public Class.

        // // todo ALWAYS START CLASS NAME WITH CAPITAL LETTER
        // // todo AND FUNCTIONS NAME START with small letters

        // class BankAccount {
        // public String username;
        // private String password;

        // public void setPassword(String pwd) {
        // password = pwd;
        // }
        // }

        // class Pen {
        // // Define all PROPERTIES + FUNCTIONS

        // // 2 qualities color tip
        // String color;
        // int tip;

        // // yha pai getter bnaya
        // String getColor() {
        // return this.color;
        // }

        // int getTip() {
        // return this.tip;
        // }

        // // lets create 2 functions setcolor settip
        // // nechai wala setter hogaya hai
        // void setColor(String newColor) {
        // color = newColor;
        // }

        // void setTip(int newTip) {
        // tip = newTip;
        // }
        // }

        // // student class
        // class Student {
        // String name;
        // int age;
        // float percentage; // ccgpa

        // void calcPercentage(int phy, int chem, int math) {
        // percentage = (phy + chem + math) / 3;
        // }

        // ! L5 Constructors
        // Student s1 = new Student("Aasif-Rehman");
        // System.out.println(s1.name);
        // Student s2 = new Student(); // will directly call non-p
        // Student s3 = new Student(154);//

        // ! L7
        // Student s1 = new Student();
        // s1.password = "xxyy7788p";
        // s1.name = "asif";
        // s1.roll = 99;

        // s1.marks[0] = 96;
        // s1.marks[1] = 68;
        // s1.marks[2] = 78;

        // Student s2 = new Student(s1);
        // s2.password = "xxyy45g";
        // s1.marks[2] = 100;
        // for (int i = 0; i < 3; i++) {
        // System.out.println(s2.marks[i]);
        // }
        // }
        // }

        // class Student {
        // String name;
        // int roll;
        // String password;
        // int marks[];

        // copy constructor
        // Shallow copy constructor
        // Student(Student s1) {
        // marks = new int[3];
        // this.name = s1.name;
        // this.roll = s1.roll;

        // }

        // deep copy constructor
        // Student(Student s1) {
        // marks = new int[3];
        // this.name = s1.name;
        // this.roll = s1.roll;

        // for (int i = 0; i < 3; i++) {
        // this.marks[i] = s1.marks[i]; // Now values will be copied
        // }
        // }

        // // ! L5-6
        // Student(String name) {
        // marks = new int[3]; // parametirized cons.
        // this.name = name;
        // }

        // Student() {
        // marks = new int[3];
        // System.out.println("Constructor is called...non-parameterized cons.");
        // }

        // Student(int roll) {
        // marks = new int[3];
        // this.roll = roll;
        // }
        // }

        // ! L10 INHERITANCE
        // todo Object create that will use Animal class func
        // Fish shark = new Fish();
        // shark.eat();

        // Dog dobby = new Dog();
        // dobby.eat();
        // dobby.legs = 4;
        // System.out.println(dobby.legs);
        // }
        // }

        // // Base class
        // class Animal {
        // String color;

        // void eat() {
        // System.out.println("eats");
        // }

        // void breathe() {
        // System.out.println("breathes");
        // }
        // }

        // class Mammal extends Animal {
        // int legs;
        // }

        // class Dog extends Mammal {
        // String breed;
        // }

        // Derived class
        // class Fish extends Animal {
        // int fins;

        // void swim() {
        // System.out.println("swims in water");
        // }
        // }

        // ! L16 Method over-loading

        // Calculator calc = new Calculator();
        // System.out.println(calc.sum(1, 2));
        // System.out.println(calc.sum((float) 1.5, (float) 2.5));
        // System.out.println(calc.sum(1, 2, 3));

        // Deer d = new Deer();
        // d.eat();
        // // child class overrides parent class

        // }
        // }

        // class Animal { // parent class
        // void eat() {
        // System.out.println("eats anyrhing");
        // }
        // }

        // class Deer extends Animal { // child class
        // void eat() {
        // System.out.println("eats grass");
        // }
        // }

        // class Calculator {
        // int sum(int a, int b) {
        // return a + b;
        // }

        // float sum(float a, float b) {
        // return a + b;
        // }

        // int sum(int a, int b, int c) {
        // return a + b + c;
        // }
        // }

        // ! L20 ABSTRACTION

        // Horse h = new Horse();
        // h.eat();
        // h.walk();
        // System.out.println(h.color);

        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();
        // System.out.println(c.color);

        // }
        // }

        // // abstract classs
        // abstract class Animal {
        // String color;

        // // lets create constructor
        // Animal() {
        // color = " brown";
        // }

        // void eat() {
        // System.out.println("animal eats");
        // }

        // // abstract method
        // // har animal kai pass walk ki func honi chahiyai
        // // walk isnt depend on Animal . Animal just gives idea
        // abstract void walk();

        // }

        // class Horse extends Animal {
        // // super clas kai methods ko implement kiya horse class mai
        // void changeColor() {
        // color = "dark brown";
        // }

        // void walk() {
        // System.out.println("walks on four legs");
        // }

        // }

        // class Chicken extends Animal {
        // void changeColor() {
        // color = "black";
        // }

        // void walk() {
        // System.out.println(" walks on 2 legs ");
        // }

        // ! L21 INTERFACES
        // // todo now we will create Queen Object
        // Queen q = new Queen();
        // q.moves(); // to check moves inside it
        // }
        // }

        // interface ChessPlayer {
        // void moves();
        // }

        // class Queen implements ChessPlayer {
        // public void moves() {
        // System.out.println("up, down, left, right, diagonal (in all 4 ways)");
        // }
        // }

        // class Rook implements ChessPlayer {
        // public void moves() {
        // System.out.println("up, down, left, right");
        // }
        // }

        // class King implements ChessPlayer {
        // public void moves() {
        // System.out.println("up, down, left, right, diagonal (by 1 step)");
        // }
        // }

        // ! L22 Static keyword

        MyClass.showNumber(); // No object needed!
        System.out.println(MyClass.number); // Accessing static variable
    }
}

class MyClass {
    static int number = 10; // static variable

    static void showNumber() { // static method
        System.out.println("Number is " + number);
    }
}
