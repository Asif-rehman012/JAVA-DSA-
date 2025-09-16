public class ClassroomBT {

    // ! L3 BackTracking Arrays
    // public static void changeArr(int arr[], int i, int val) {
    // // base case
    // if (i == arr.length) {
    // printArr(arr);
    // return;
    // }
    // // recursion
    // arr[i] = val;
    // changeArr(arr, i + 1, val + 1);
    // arr[i] = arr[i] - 2;
    // }

    // public static void printArr(int arr[]) {
    // for (int i = 0; i < arr.length; i++) {
    // System.out.print(arr[i] + " ");
    // }
    // System.out.println();
    // }

    // !L5 Find Subsets
    // public static void findSubsets(String str, String ans, int i) {
    // // base case
    // if (i == str.length()) {
    // if (ans.length() == 0) {
    // System.out.println("null");
    // } else {
    // System.out.println(ans);
    // }

    // return;

    // }

    // // recursion
    // // Yes choice
    // findSubsets(str, ans + str.charAt(i), i + 1);
    // // No Choice
    // findSubsets(str, ans, i + 1);
    // }

    // !L7 Find Permutations Code
    // public static void findPermutations(String str, String ans) {
    // // base case
    // if (str.length() == 0) {
    // System.out.println(ans);
    // return;
    // }

    // // recursion case-- O(n*n!)
    // for (int i = 0; i < str.length(); i++) {
    // char curr = str.charAt(i);
    // // "abcde" => "ab" +"de" = "abde"
    // String Newstr = str.substring(0, i) + str.substring(i + 1);
    // findPermutations(Newstr, ans + curr);
    // }
    // }

    // ! L8 N Queens all way
    // public static boolean isSafe(char board[][], int row, int col) {
    // // vertical UP
    // for (int i = row - 1; i >= 0; i--) {
    // if (board[i][col] == 'Q') {
    // return false;
    // }
    // }

    // // diagonal left up
    // for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
    // if (board[i][j] == 'Q') {
    // return false;

    // }
    // }

    // // diagonal right up
    // for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
    // if (board[i][j] == 'Q') {
    // return false;
    // }
    // }

    // return true;
    // }

    // // parameters
    // public static void nQueens(char board[][], int row) {
    // // now we will use for loop in order to place queen in coloum cells
    // // base
    // if (row == board.length) {
    // printBoard(board); // instead of printing hmm count++ krai gai
    // // count++;
    // return;
    // }
    // // column loop lgaya
    // for (int j = 0; j < board.length; j++) {
    // if (isSafe(board, row, j)) {
    // board[row][j] = 'Q'; // row pai queen bitha di
    // nQueens(board, row + 1); // function call ..agli Row ko call lga di
    // board[row][j] = 'X'; // backtracking step --- X shows cell is empty

    // }
    // }
    // }

    // public static void printBoard(char board[][]) {
    // System.out.println("------- chess board -------");
    // for (int i = 0; i < board.length; i++) {
    // for (int j = 0; j < board.length; j++) {
    // System.out.print(board[i][j] + " ");
    // }
    // System.out.println();
    // }
    // }

    // static int count = 0;

    // ! L13 GRID WAYS CODE
    // public static int gridways(int i, int j, int n, int m) {
    // // base case
    // if (i == n - 1 && j == m - 1) { // cond. for last cell
    // return 1;

    // } else if (i == n || j == n) {
    // return 0; // boundary cross cond.
    // }

    // int w1 = gridways(i + 1, j, n, m);
    // int w2 = gridways(i, j + 1, n, m);
    // return w1 + w2;
    // }

    // Check if placing digit at (row, col) is valid
    public static boolean isSafe(int[][] sudoku, int row, int col, int digit) {
        // Check column
        for (int i = 0; i < 9; i++) {
            if (sudoku[i][col] == digit) {
                return false;
            }
        }

        // Check row
        for (int j = 0; j < 9; j++) {
            if (sudoku[row][j] == digit) {
                return false;
            }
        }

        // Check 3x3 grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }

        return true;
    }

    // Sudoku solver using backtracking
    public static boolean sudokuSolver(int[][] sudoku, int row, int col) {
        // ✅ Correct base case: All rows completed
        if (row == 9) {
            return true;
        }

        // Move to next cell
        int nextRow = row, nextCol = col + 1;
        if (nextCol == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }

        // Skip already filled cells
        if (sudoku[row][col] != 0) {
            return sudokuSolver(sudoku, nextRow, nextCol);
        }

        // Try placing digits 1-9
        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit;

                if (sudokuSolver(sudoku, nextRow, nextCol)) {
                    return true;
                }

                sudoku[row][col] = 0; // backtrack
            }
        }

        return false; // no valid digit found
    }

    // Print the Sudoku grid
    public static void printSudoku(int[][] sudoku) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // int arr[] = new int[5];
        // changeArr(arr, 0, 1);
        // printArr(arr);

        // lecture 7
        // String str = "abc";
        // findSubsets(str, "", 0);
        // findPermutations(str, "");

        // lecture 8
        // int n = 4;
        // char board[][] = new char[n][n];
        // // intilializa
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // board[i][j] = 'X';
        // }
        // }
        // nQueens(board, 0); // call fun
        // System.out.println("total ways to solve n queens = " + count);

        // L13 grid ways
        // int n = 3, m = 3;
        // System.out.println(gridways(0, 0, n, m));

        // L16 Sudoku

        int[][] sudoku = {
                { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
                { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                { 0, 0, 3, 0, 0, 0, 0, 6, 0 },
                { 1, 0, 5, 0, 6, 0, 0, 2, 0 },
                { 0, 6, 0, 2, 0, 0, 0, 0, 0 },
                { 0, 2, 0, 0, 0, 0, 6, 0, 3 },
                { 0, 0, 0, 5, 0, 3, 0, 0, 0 },
                { 0, 0, 0, 0, 7, 0, 5, 0, 0 },
                { 8, 2, 7, 0, 0, 9, 0, 1, 3 }
        };

        if (sudokuSolver(sudoku, 0, 0)) {
            System.out.println("Solution exists:");
            printSudoku(sudoku);
        } else {
            System.out.println("Solution does not exist");
        }
    }
}