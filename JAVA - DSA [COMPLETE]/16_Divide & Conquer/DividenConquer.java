public class DividenConquer {

    // yha pai print array naam ka function bna rakha hai
    // todo array mai loop lagaya hai jis mai elements ko print krvatai hai
    // public static void printArr(int arr[]) {
    // for (int i = 0; i < arr.length; i++) {
    // System.out.print(arr[i] + " ");
    // }
    // System.out.println();
    // }

    // todo we will make a Recursive function here(isi kai andr elements ko sort
    // krai gai)
    // ! L3 Merge sort code
    // public static void mergeSort(int arr[], int si, int ei) {
    // if (si >= ei) {
    // return;
    // }
    // // kaam (mid nikalai gai)
    // int mid = si + (ei - si) / 2; // or (si+ei)/2
    // mergeSort(arr, si, mid); // call left part
    // mergeSort(arr, mid + 1, ei); // call right
    // merge(arr, si, mid, ei);

    // }

    // public static void merge(int arr[], int si, int mid, int ei) {
    // // maan loo ... left(0,3 jata hai )=4 elements lft mai rt(4,6) =3
    // // ei-si+1------ 6-0+1=7 ka array
    // int temp[] = new int[ei - si + 1];
    // int i = si; // iterator for left part
    // int j = mid + 1; // iterator for rt part
    // int k = 0; // / for temp arr

    // while (i <= mid && j <= ei) {
    // if (arr[i] < arr[j]) {
    // temp[k] = arr[i];
    // i++;

    // } else {
    // temp[k] = arr[j];
    // j++;
    // }
    // k++;
    // }

    // // left part
    // while (i <= mid) {
    // temp[k++] = arr[i++];
    // }

    // // right part
    // while (j <= ei) {
    // temp[k++] = arr[j++];
    // }

    // // copy temp to original arr
    // for (k = 0, i = si; k < temp.length; k++, i++) {
    // arr[i] = temp[k];
    // }
    // }

    // ! L5 Quick Sort Code
    // public static void quicksort(int arr[], int si, int ei) {
    // if (si >= ei) {
    // return;
    // }

    // // last element (pivot index)
    // int pIdx = partition(arr, si, ei);
    // quicksort(arr, si, pIdx - 1); // left
    // quicksort(arr, pIdx, ei); // right
    // }

    // public static int partition(int arr[], int si, int ei) {
    // int pivot = arr[ei];
    // int i = si - 1; // to make place for elements smaller than pivot

    // for (int j = si; j < ei; j++) {
    // if (arr[j] <= pivot) {
    // i++;
    // // swap
    // int temp = arr[j];
    // arr[j] = arr[i];
    // arr[i] = temp;
    // }
    // }

    // i++;
    // int temp = pivot;
    // arr[ei] = arr[i];
    // arr[i] = temp;
    // return i;
    // }

    // ! SORTED & ROTATED ARRAY Lecture 8 code ... ./. numbers into 2 parts then
    // search lf rt
    public static int search(int arr[], int tar, int si, int ei) {

        // kaam
        int mid = si + (ei - si) / 2; // (si+ei)/2

        // case FOUND
        if (arr[mid] == tar) {
            return mid;
        }

        // mid on L1
        if (arr[si] <= arr[mid]) {
            // case a : left
            if (arr[si] <= tar && tar <= arr[mid]) {
                return search(arr, tar, si, mid - 1);
            } else {
                // case b : right
                return search(arr, tar, mid + 1, ei);
            }
        }

        // mid on L2
        else {
            // case c: right
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return search(arr, tar, mid + 1, ei);
            } else {
                // case d : left
                return search(arr, tar, si, mid - 1);
            }
        }
    }

    // main function kai andr already array ko define kr kai rakha hai
    public static void main(String[] args) {
        // int arr[] = { 6, 3, 9, 5, 2, 8, -2 };
        // mergeSort(arr, 0, arr.length - 1);

        // quicksort(arr, 0, arr.length - 1);
        // printArr(arr);

        int arr[] = { 4, 5, 6, 7, 0, 1, 2 }; // for L 8
        int target = 0; // output -> 4
        int tarIdx = search(arr, target, 0, arr.length - 1);
        System.out.println(tarIdx);
    }
}
