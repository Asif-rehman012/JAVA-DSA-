// import java.util.Scanner;

// //!L6
public class Strings {

    // public static void printLetters(String str) {

    // // .length mai () add krna hai
    // for (int i = 0; i < str.length(); i++) {
    // System.out.print(str.charAt(i) + " ");
    // }
    // System.out.println();
    // }

    // public static void main(String[] args) {
    // char arr[] = { 'a', 'b', 'c', 'd' };
    // String name = "Asif ";
    // String str2 = new String("xyz");
    // System.out.println(arr);
    // System.out.println(name);
    // System.out.println(str2);

    // ! L3
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Type you Name : ");
    // String name2 = sc.nextLine();
    // System.out.println(name2);

    // !L4 String LengthS
    // String fullName = "Tony stark";
    // System.out.println(fullName.length());

    // !L5 Concatenation
    // String firstName = "Asif";
    // String lastName = "Rehman";
    // String fullName = firstName + " " + lastName;
    // System.out.println(fullName.charAt(3));

    // printLetters(fullName);
    // }

    // }

    // todo Starting function from new
    // ! L7 Question Palindeome check (INTUIT)
    // public static boolean PalindromeCheck(String str) {
    // for (int i = 0; i < str.length() / 2; i++) {
    // int n = str.length();
    // if (str.charAt(i) != str.charAt(n - 1 - i)) {

    // // not a palindrome
    // // agai ki comparison nhi krnai hai false
    // return false;
    // }
    // }
    // return true;
    // }

    // ! L8 Shortest path find ?
    // public static float getShortestPath(String path) {
    // int x = 0, y = 0;

    // for (int i = 0; i < path.length(); i++) {
    // char dir = path.charAt(i);
    // // south
    // if (dir == 'S') {
    // y--;
    // }
    // // North
    // else if (dir == 'N') {
    // y++;
    // }
    // // west
    // else if (dir == 'W') {
    // x--;
    // }
    // // East
    // else {
    // x++;
    // }
    // }
    // int X2 = x * x;
    // int Y2 = y * y;
    // return (float) Math.sqrt(X2 + Y2);
    // }

    //
    // public static void main(String args[]) {
    // String path = "WNEENESENNN";
    // // String str = "racecar";
    // // System.out.println(PalindromeCheck(str));

    // System.out.println(getShortestPath(path));

    // }
    // }

    // public static void main(String[] args) {
    // String s1 = "Tony";
    // String s2 = "Tony";
    // String s3 = new String("Tony");

    // if (s1 == s2) {
    // System.out.println("Strings are equal");

    // } else {
    // System.out.println("Strings are not equal");
    // }

    // // todo insted of == we will use .equals in java
    // // if (s1.equals(s3)) {
    // // System.out.println("Strings are equal");
    // // } else {
    // // System.out.println("Strings are not equal");
    // // }

    // }
    // }

    // public static String subString(String str, int si, int ei) {
    // String substr = "";
    // for (int i = si; i < ei; i++) { // starting index si
    // // starting to ending -i kai sarai elements add hogai
    // substr += str.charAt(i);
    // }

    // return substr;
    // }

    // ! L11 Print Largest String
    // public static void main(String[] args) {
    // substring
    // String str = "HelloWorld";
    // // yah substring hmm nai bnaya java kai pass khud sai ss ka method hai

    // System.out.println(str.substring(0, 6));

    // System.out.println(subString(str, 0, 5));

    // !L11

    // String fruits[] = { "apple", "mango", "banana" };

    // String largest = fruits[0];
    // for (int i = 1; i < fruits.length; i++) {
    // if (largest.compareTo(fruits[i]) < 0) {
    // largest = fruits[i];
    // }

    // }

    // System.out.println(largest);
    // // todo mango . lexcical graphically bda hai 'M'

    // ! L13 String builder
    // StringBuilder sb = new StringBuilder("");
    // for (char ch = 'a'; ch <= 'z'; ch++) {
    // sb.append(ch);

    // }
    // String a = "asif rehman ";
    // String j = a.toUpperCase();
    // System.out.println(sb);
    // System.out.println(j);

    // ! L14 Convert Letters To uppercase (code_nation)
    // public static String toUpperCase(String str) {
    // StringBuilder sb = new StringBuilder("");

    // char ch = Character.toUpperCase(str.charAt(0));
    // sb.append(ch);

    // for (int i = 1; i < str.length(); i++) {
    // if (str.charAt(i) == ' ' && i < str.length() - 1) {
    // sb.append(str.charAt(i));
    // i++;
    // sb.append(Character.toUpperCase(str.charAt(i)));
    // } else {
    // sb.append(str.charAt(i));
    // }
    // }

    // return sb.toString();
    // }

    // ! L15 String Compression (amazon Q5)
    // todo iss ki t.c = O(n) Not N^2 because iss mai i++ ho rha string ki lenth tkk
    // hee run hoga
    // todo SOLVE IT WITH STRING BULDER

    public static String compress(String str) {

        String newStr = "";
        // aaabc
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;

            }
            newStr += str.charAt(i);
            if (count > 1) {
                newStr += count.toString();
            }
        }

        return newStr;
    }

    public static void main(String args[]) {
        // String str = "hi i am asif";
        String str = "aaabbcccdd";
        // System.out.println(toUpperCase(str));
        System.out.println(compress(str));
    }
}
