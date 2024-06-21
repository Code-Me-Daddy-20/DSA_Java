import java.util.Arrays;

public class EasyArrays {
    public static void main(String[] args) {
        int[] arr = { -11, 1, 2, 31, 4, 52, -12, 1212, 1212 };

        // System.out.println("Largest element in the array is: " + BruteMaxElement(arr));
        // System.out.println("Largest element in the array is: " + RecMaxElement(arr,arr.length - 1));

        // System.out.println("Second largest element in the array: " + BetterSecMaxElement(arr));
        // System.out.println("Second largest element in the array: " + OptimalSecMaxElement(arr));

    }

    // 1. Largest element in an array
    // Brute Force ~
    public static int BruteMaxElement(int a[]) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    // Recursive approach ~
    static int recMax = Integer.MIN_VALUE;

    public static int RecMaxElement(int a[], int n) {
        if (n < 0)
            return recMax;
        else
            recMax = Math.max(a[n], recMax);

        return RecMaxElement(a, n - 1);
    }

    // 2. 2nd largest element in an array
    // Better Approach ~
    public static int BetterSecMaxElement(int a[]) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Max: " + max);
        int sMax = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > sMax && a[i] < max)
                sMax = a[i];
        }
        return sMax;
    }

    // Optimal Approach ~
    public static int OptimalSecMaxElement(int a[]) {
        int max = Integer.MIN_VALUE;
        int sMax = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                sMax = max;
                max = a[i];
            } else if (a[i] > sMax && a[i] != max)
                sMax = a[i];
        }
        return sMax;
    }
}
