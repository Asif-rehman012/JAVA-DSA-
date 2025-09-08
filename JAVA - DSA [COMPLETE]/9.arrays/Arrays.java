
public class Arrays {
    // public static void main(String[] args) {
    // int marks[] = new int[50];
    // {
    // marks[0] = 56;
    // marks[1] = 45;
    // marks[2] = 86;
    // marks[3] = 96;
    // marks[4] = 56;
    // marks[5] = 56;
    // marks[6] = 56;
    // marks[7] = 56;
    // marks[8] = 56;
    // }

    // System.out.println("Print the marks of 2nd student : " + marks[2] + "/100");
    // }

    // ! L4 Arrays as function

    // public static void update(int marks[], int nonChangable) {
    // nonChangable = 10;
    // for (int i = 2; i < marks.length; i++) {
    // marks[i] = marks[i] + 1;
    // }
    // }

    // public static void main(String[] args) {
    // int marks[] = { 97, 98, 99 };
    // int nonChangable = 5;
    // update(marks, nonChangable);
    // System.out.println(nonChangable);

    // // print our marks
    // for (int i = 0; i < marks.length; i++) {
    // System.out.println(marks[i] + " ");
    // }

    // System.out.println();

    // }

    // ! L5 Linear Search
    // public static int LinearSearch(int numbers[], int key) {
    // for (int i = 0; i < numbers.length; i++) {
    // if (numbers[i] == key) {
    // return i;
    // }
    // }
    // return -1;
    // }

    // public static void main(String[] args) {
    // int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
    // int key = 10;

    // int index = LinearSearch(numbers, key);
    // if (index == -1) {
    // System.out.println("NOT Found");
    // } else {
    // System.out.println("key is at index : " + index);
    // }
    // }

    // !L6 Largest in Array
    // public static int getLargest(int numbers[]) {
    // int largest = Integer.MIN_VALUE; // -infinity

    // // we can check smallest number too
    // // 1.make smallest variable
    // // 2. intiliaze with Interger.max_value
    // // 3. if agar hmara smallest greter ho number[i] sai
    // // then update it with smallest= no.[i]
    // int smallest = Integer.MAX_VALUE; // intialize with + infinity

    // for (int i = 0; i < numbers.length; i++) {
    // if (largest < numbers[i]) {
    // largest = numbers[i];
    // }

    // if (smallest > numbers[i]) {
    // smallest = numbers[i];

    // }
    // }
    // System.out.println("smallest mumber is : " + smallest);

    // return largest;

    // }

    // !L8 Binary search code

    // public static int binarySearch(int numbers[], int key) {
    // int start = 0, end = numbers.length - 1;
    // while (start <= end)

    // {
    // int mid = (start + end) / 2;

    // // comparisons
    // if (numbers[mid] == key) {
    // return mid;
    // }
    // if (numbers[mid] < key) {
    // start = mid + 1;
    // } else {
    // end = mid - 1;
    // }
    // }
    // return -1;
    // }

    // ! L9 Reverse an Array
    // public static void reverse(int numbers[]) {
    // // lets make start and end variable as first ..
    // int first = 0, last = numbers.length - 1;

    // while (first < last) {
    // // swap
    // int temp = numbers[last];
    // numbers[last] = numbers[first];
    // numbers[first] = temp;

    // // first ek index agai bdai ga last pechai ayai ga
    // first++;
    // last--;
    // }
    // }

    // public static void main(String[] args) {
    // int numbers[] = { 8, 21, 31, 61, 55 };
    // // System.out.println("largest value is : " + getLargest(numbers));
    // // int key = 8;

    // // System.out.println("index for key is : " + binarySearch(numbers, key));
    // reverse(numbers); // function ko call fir print values
    // for (int i = 0; i < numbers.length; i++) {
    // System.out.print(numbers[i] + " ");
    // }
    // System.out.println();
    // }

    // ! 10 Pairs in an Array
    // public static void printpairs(int numbers[]) {
    // for (int i = 0; i < numbers.length; i++) {
    // int curr = numbers[i]; // 2,4,6,8,10 pairs curr mai store hotai hai
    // for (int j = i + 1; j < numbers.length; j++) {
    // System.out.print("(" + curr + "," + numbers[j] + ")");
    // }
    // System.out.println();
    // }

    // }

    // ! L-11 Print Sub-Array (BRUTE- FORCE)
    // public static void printSubarrays(int numbers[]) {
    // int ts = 0;
    // for (int i = 0; i < numbers.length; i++) {
    // int start = i;
    // for (int j = i; j < numbers.length; j++) {
    // int end = j;
    // int sum = 0;
    // for (int k = start; k <= end; k++) {
    // System.out.print(numbers[k] + " ");

    // sum += numbers[k];
    // }
    // // System.out.println("sum = " + sum);

    // ts++;
    // System.out.println();
    // }

    // System.out.println();

    // }
    // System.out.print("total sub arrays = " + ts);
    // }

    // ! L12 Max-subarray sum-i (BRUTE FORCE)

    // public static void maxSubarraySum(int numbers[]) {
    // // lets initialize currsum variable with 0
    // int currsum = 0;
    // int maxSum = Integer.MIN_VALUE;

    // for (int i = 0; i < numbers.length; i++) {
    // int start = i;
    // for (int j = i; j < numbers.length; j++) {
    // int end = j;

    // for (int k = start; k <= end; k++) { // print
    // // subarray sum
    // currsum += numbers[k];

    // }
    // System.out.println("sum = " + currsum);

    // if (maxSum < currsum) {
    // maxSum = currsum;
    // }

    // }
    // }

    // System.out.println("max sum = " + maxSum);

    // }

    // ! L13-subarray sum -ii (PRIFIX SUM )
    // public static void maxSubarraySumprefix(int numbers[]) {
    // // lets initialize currsum variable with 0
    // int currsum = 0;
    // int maxSum = Integer.MIN_VALUE;
    // // prefix sum bnayai gai...prefix size number.l hoga
    // int prefix[] = new int[numbers.length];

    // prefix[0] = numbers[0];
    // // calculate prefx array
    // for (int i = 1; i < prefix.length; i++) {
    // prefix[i] = prefix[i - 1] + numbers[i];
    // }

    // // start aur end vhe rakhna hai
    // // calculation loop htana hai
    // for (int i = 0; i < numbers.length; i++) {
    // int start = i;
    // for (int j = i; j < numbers.length; j++) {
    // int end = j;
    // currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

    // if (maxSum < currsum) {
    // maxSum = currsum;
    // }

    // }
    // }

    // System.out.println("max sum = " + maxSum);

    // }

    // ! L14-subarray sum -iii(Kadanes algo)
    // public static void Kadanes(int numbers[]) {
    // // we need 2 variables in it
    // int ms = Integer.MIN_VALUE;
    // int cs = 0;

    // for (int i = 0; i < numbers.length; i++) {
    // cs = cs + numbers[i];
    // // -ve sai bahtr hai zero bna doo
    // if (cs < 0) {
    // cs = 0;
    // }

    // // cs aur ms mai sai joi b maximum hoga usai ma mai dal doo
    // ms = Math.max(cs, ms);

    // }

    // System.out.println(" our maximum subarray sum is : " + ms);
    // }

    // public static void main(String[] args) {

    // int numbers[] = { 4, 2, 0, 6, 3, 2, 5};
    // // printpairs(numbers);

    // // printSubarrays(numbers);
    // // maxSubarraySum(numbers);
    // // maxSubarraySumprefix(numbers);
    // // Kadanes(numbers);
    // }
    // }

    // ! L16 TRAPPING RAIN-WATER CODE

    // public static int trappedRainwater(int height[]) {
    // int n = height.length;
    // // calculate left max boundary - array
    // // har kisi kai liyai left max boundry nikali

    // int leftMax[] = new int[n];
    // // kyuki uss kai left mai kuch nhi hai i.e = 0
    // leftMax[0] = height[0];
    // for (int i = 1; i < n; i++) {
    // // current height hogi leftmax i-1
    // leftMax[i] = Math.max(height[i], leftMax[i - 1]);
    // }
    // // calculate right max boundary - array
    // int rightMax[] = new int[n];
    // rightMax[n - 1] = height[n - 1];
    // for (int i = n - 2; i >= 0; i--) {
    // rightMax[i] = Math.max(height[i], rightMax[i + 1]);
    // }

    // int trappedWater = 0;
    // // loop
    // for (int i = 0; i < n; i++) {
    // // water level nikal di
    // // waterLevel = min(leftmax bound, rightmax bound)
    // int waterLevel = Math.min(leftMax[i], rightMax[i]);

    // // total trapped water nikal diya
    // // trapped water = waterLevel - height [i]
    // trappedWater += waterLevel - height[i];

    // }

    // return trappedWater;

    // }

    // public static void main(String[] args) {

    // int height[] = { 4, 2, 0, 6, 3, 2, 5 };
    // System.out.println(trappedRainwater(height));

    // }
    // }

    // ! L17 Best time to buy and sell stocks

    public static int buyAndSellStocks(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) { // profit
                int profit = prices[i] - buyPrice; // todays profit
                maxProfit = Math.max(maxProfit, profit); // max of all 7 days

            } else {
                buyPrice = prices[i];
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };

        System.out.println(buyAndSellStocks(prices));

    }
}