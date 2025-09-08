
public class patterns {

    // ! L=1,2 Print Holow Rectangle
    // public static void hollow_rectangle(int totRows, int totCols) {
    // // todo :::: kitni lines print krvani hai totle rows kai equal
    // // outer-loop
    // for (int i = 1; i <= totRows; i++) {
    // // inner-columns
    // for (int j = 1; j <= totCols; j++) {
    // // cell - (i--> represent Row , j--> represent column)
    // // if cell on boundry print star otherwise empty

    // if (i == 1 || i == totRows || j == 1 || j == totCols) {
    // // boundry cells
    // System.out.print("*");
    // } else {
    // System.out.print(" ");
    // }
    // }
    // System.out.println();
    // }

    // }

    // public static void main(String[] args) {
    // hollow_rectangle(4, 5);
    // }

    // ! L3 INVERTED AND ROTATED HALF-PYRAMID
    // public static void inverted_rotated_half_pyramid(int n) {
    // // Outer
    // for (int i = 1; i <= n; i++) {
    // // Spaces
    // for (int j = 1; j <= n - i; j++) {
    // System.out.print(" ");
    // }

    // // stars
    // for (int j = 1; j <= i; j++) {
    // System.out.print("*");
    // }
    // System.out.println();
    // }

    // }

    // public static void main(String[] args) {
    // inverted_rotated_half_pyramid(4);
    // }

    // !L4 Inverted Half-pyramid with numbers

    // public static void inverted_half_pyramid_withNumbers(int n) {
    // for (int i = 1; i <= n; i++) {
    // // inner- numbers
    // for (int j = 1; j <= n - i + 1; j++) {
    // System.out.print(j + " ");
    // }
    // System.out.println();
    // }
    }

    // public static void main(String[] args) {
    // inverted_half_pyramid_withNumbers(7);
    // }

    // !FLOYD'S Triangle
    // public static void floyds_triangle(int n) {
    // // outer loop
    // int counter = 1;
    // for (int i = 1; i <= n; i++) {

    // // inner loop how many times will counter be printed
    // for (int j = 1; j <= i; j++) {
    // System.out.print(counter + " ");
    // counter++;
    // }
    // System.out.println();
    // }

    // }

    // public static void main(String[] args) {
    // floyds_triangle(5);
    // }

    // // ! L-6 (0-1) Triangle Pattern

    // public static void zero_one_triangle(int n) {
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= i; j++) {
    // if ((i + j) % 2 == 0) { // even
    // System.out.print("1");
    // } else {
    // System.out.print("0");
    // }
    // }
    // System.out.println();
    // }

    // }

    // ! L7 to print butterfly pattern

    // public static void butterfly(int n) {
    // // Ist half ko print krvana hai
    // for (int i = 1; i <= n; i++) {

    // // to print stars in begnning -i
    // // inner-loop
    // for (int j = 1; j <= i; j++) {

    // System.out.print("*");
    // }
    // // spaces -2*(n-i)
    // // now we will print spaces with loop
    // for (int j = 1; j <= 2 * (n - i); j++) {
    // System.out.print(" ");
    // }

    // // then again stars -i
    // for (int j = 1; j <= i; j++) {
    // System.out.print("*");
    // }
    // System.out.println();
    // }

    // // Now we will print 2nd half
    // for (int i = n; i >= 1; i--) {
    // // uper ka code copy kr kai paste SAME KAAM

    // // to print stars in begnning -i
    // // inner-loop
    // for (int j = 1; j <= i; j++) {

    // System.out.print("*");
    // }

    // // spaces -2*(n-i)
    // // now we will print spaces with loop
    // for (int j = 1; j <= 2 * (n - i); j++) {
    // System.out.print(" ");
    // }

    // // then again stars -i
    // for (int j = 1; j <= i; j++) {
    // System.out.print("*");
    // }
    // System.out.println();

    // }

    // }

    // ! L8 Solid RHOMBUS
    // public static void solid_rhombus(int n) {
    // for (int i = 1; i <= n; i++) {

    // // spaces (track krna hai i ko)
    // for (int j = 1; j <= (n - i); j++) {
    // System.out.print(" ");
    // }

    // // stars (track j ko)
    // for (int j = 1; j <= n; j++) {
    // System.out.print("*");
    // }

    // System.out.println();
    // }
    // }

    // ! l9 Hollow Rhombus
    // public static void hollow_rhombus(int n) {
    // for (int i = 1; i <= n; i++) {

    // // spaces
    // for (int j = 1; j <= (n - i); j++) {
    // System.out.print(" ");
    // }

    // // hollow rectangle - stars (print stars)
    // // outer-loop

    // for (int j = 1; j <= n; j++) {
    // // cell - (i--> represent Row , j--> represent column)
    // // if cell on boundry print star otherwise empty

    // if (i == 1 || i == n || j == 1 || j == n) {
    // // boundry cells
    // System.out.print("*");
    // } else {
    // System.out.print(" ");
    // }
    // }
    // System.out.println();
    // }

    // }

    public static void diamond(int n) {
        // ist half
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd half

        // ist half
        for (int i = n; i >= 1; i--) {
            // spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // zero_one_triangle(5);
        // butterfly(5);
        // solid_rhombus(5);
        // hollow_rhombus(5);
        diamond(7);
    }
}