
public class BasicSorting {

    // ! L1 Bubble sort code(2 nested loops hai -- On2--- worst time complexity)
    // public static void bubbleSort(int arr[]) {
    // for (int turn = 0; turn < arr.length - 1; turn++) {
    // for (int j = 0; j < arr.length - 1 - turn; j++) {
    // if (arr[j] > arr[j + 1]) {
    // // Swap 2 adjacent elements
    // int temp = arr[j];
    // arr[j] = arr[j + 1];
    // arr[j + 1] = temp;
    // }
    // }
    // }
    // }

    // // ek aur function bnayai gai print kai liyai
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();

    }

    // ! L8 selection sort code
    public static void selectionsort(int arr[]) {
        // outer loop turns calculate krai ga
        for (int i = 0; i < arr.length - 1; i++) { // turns count ki
            int minPos = i; // min pos ko cur pos ko man liya
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }

            // swap(min ko cur pos kai sath swap kr diya)
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }

    }

    // ! Insertion Sort code
    public static void InsertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            // finding out the correct position to insert
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // insertion kr dai gai
            arr[prev + 1] = curr;
        }
    }

    // ! L10 Counting Sort code
    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2, 99, 6 };
        // bubbleSort(arr); // arr pass kr diya
        // selectionsort(arr); // isko uper run kro nechai print
        // InsertionSort(arr);
        countingSort(arr);
        printArr(arr); // arr ko print kr diya

    }

}
