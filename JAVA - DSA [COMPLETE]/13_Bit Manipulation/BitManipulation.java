
public class BitManipulation {

    // ! L10 odd or even
    // public static void oddorEven(int n) {
    // int bitMask = 1;
    // // todo :: code & kai sath 1 lai ga jisai bitmask boltai hai
    // if ((n & bitMask) == 0) {
    // // print even
    // System.out.println("even num");

    // } else {
    // System.out.println("odd");
    // }
    // }
    // ! L11 Get ith bit
    // public static int getIthBit(int n, int i) {
    // int bitMask = 1 << i;
    // if ((n & bitMask) == 0) {
    // return 0;
    // } else {
    // return 1;
    // }

    // }

    // // ! L12 Set ith bit
    // public static int setIthBit(int n, int i) {
    // int bitMask = 1 << i;
    // return n | bitMask;
    // }

    // // ! L13 Clear ith Bit
    // public static int ClearIthBit(int n, int i) {
    // int bitMask = ~(1 << i);
    // return n & bitMask;
    // }

    // // ! L14 Update ith bit
    // public static int UpdateIthBit(int n, int i, int newBit) {
    // n = ClearIthBit(n, i);
    // int BitMask = newBit << i;
    // return n | BitMask;
    // }

    // public static int clearIBits(int n, int i) {
    // int bitMask = (~0) << i;
    // return n & bitMask;
    // }

    // ! L16 clear range of bits
    // public static int clearIBits(int n, int i, int j) {
    // int a = ((~0) << (j + 1));
    // int b = (1 << i) - 1;
    // int bitMask = a | b;
    // return n & bitMask;
    // }

    // ! L17 Count set bits in a number
    // public static boolean isPowerOfTwo(int n) {
    // return (n & (n - 1)) == 0;
    // }

    // ! L18 Q:- Count set bits in a number (GOOGLE , AMAZON)

    // public static int CountSetBits(int n) {
    // int Count = 0;
    // while (n > 0) {
    // // har bar loop mai hmm LSB ko compare krtai hai
    // // if n&1 not equal to zero then increase count
    // if ((n & 1) != 0) { // check our LSB
    // Count++;

    // }
    // n = n >> 1;
    // }

    // return Count;
    // }

    // !L 19 Fast Exponentiation Code
    // todo Iss mai hmai a^n ko calculate krna hai like 5^5
    public static int fastExpo(int a, int n) {
        int ans = 1; // ans variable define kiya

        while (n > 0) {
            if ((n & 1) != 0) { // check LSB
                // if lsb gives non zero value mulriply by power
                ans = ans * a;
            }

            a = a * a;
            n = n >> 1;
        }

        return ans;

    }

    public static void main(String[] args) {
        // System.out.println(5 & 6);
        // System.out.println(5 | 6);
        // System.out.println(5 ^ 6);
        // System.out.println(~5);

        // oddorEven(3);
        // oddorEven(11);
        // oddorEven(14);

        // System.out.println(getIthBit(10, 3));
        // System.out.println(setIthBit(5, 4));
        // System.out.println(setIthBit(10, 2));

        // System.out.println(UpdateIthBit(10, 2, 1));
        // System.out.println(clearIBits(15, 2));
        // System.out.println(clearIBits(15, 2, 8));
        // System.out.println(isPowerOfTwo(16));

        // ! L18 onward calls
        // System.out.println(CountSetBits(16));
        System.out.println(fastExpo(5, 3));
    }
}
