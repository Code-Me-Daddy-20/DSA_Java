import java.util.Arrays;

public class EasyArrays {
    public static void main(String[] args) {
        int[] arr = { -11, 0, 2, 0, 4, 52, 0, 1212, 1212 };
        int[] sortArr = { -3, -2, -1, 0 };
        int[] dupArr = { 1, 3, 3, 4, 4, 5, 5 };
        // System.out.println("Largest element in the array is: " + BruteMaxElement(arr));
        // System.out.println("Largest element in the array is: " + RecMaxElement(arr,arr.length - 1));

        // System.out.println("Second largest element in the array: " + BetterSecMaxElement(arr));
        // System.out.println("Second largest element in the array: " + OptimalSecMaxElement(arr));

        // System.out.println("Is the array sorted? : "+isSortedArray(sortArr));

        // System.out.println("Removed dupilicates: " + removeDuplicates(dupArr));

        // System.out.println("After Left rotate: " + Arrays.toString(leftRotateArray(arr)));

        // System.out.println("Rotate to left by d: "+ Arrays.toString(RotateeletoleftbyK(arr, arr.length, 5)));

        System.out.println("Moving Zeros to end: "+ Arrays.toString(moveZerostoEnd(arr, arr.length)));

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

    // 3. Check if array is sorted
    // Optimal Approach ~
    public static boolean isSortedArray(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i + 1] < a[i])
                return false;
        }
        return true;
    }

    // 4. Remove duplicates from a sorted array
    // Optimal Approach ~
    public static int removeDuplicates(int a[]) {
        int i = 0;
        for (int j = 1; j < a.length; j++) {
            if (a[j] != a[i]) {
                a[i + 1] = a[j];
                i++;
            }
        }
        return i + 1;
    }

    // 5. Left rotate an array by 1
    // Optimal Approach ~
    public static int[] leftRotateArray(int a[]) {
        int temp = a[0];
        System.out.println(temp);
        for (int i = 1; i < a.length; i++) {
            a[i - 1] = a[i];
            if (i == a.length - 1)
                a[i] = temp;
        }
        return a;
    }




    // 6. Rotate array to right by K 
    // Brute Force ~ 
    public static int[] RotatetorightbyK(int[] arr, int n, int k) {
        if (n == 0)
          return new int[0];
        
        if (k > n)
            k = k % n;
        int[] temp = new int[k];
        for (int i = n - k; i < n; i++) {
          temp[i - n + k] = arr[i];
        }
        for (int i = n - k - 1; i >= 0; i--) {
          arr[i + k] = arr[i];
        }
        for (int i = 0; i < k; i++) {
          arr[i] = temp[i];
        }
        return arr;
      }

      // Optimal Approach ~
      public static void Reverse(int[] arr, int start, int end) {
        while (start <= end) {
          int temp = arr[start];
          arr[start] = arr[end];
          arr[end] = temp;
          start++;
          end--;
        }
      }
      public static int[] RotateeletoleftbyK(int[] arr, int n, int k) {
        Reverse(arr, 0, k - 1);
        Reverse(arr, k , n - 1);
        Reverse(arr, 0, n - 1);

        return arr;
      }





      // 7. Move zeros to end
      // Optimal Approach ~
      public static int[] moveZerostoEnd(int []a, int n) {
        int j = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                j = i;
                break;
            }
        }
        if (j == -1) return a;


        for (int i = j + 1; i < n; i++) {
            if (a[i] != 0) {
                
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
                j++;
            }
        }
        return a;
    }
}
