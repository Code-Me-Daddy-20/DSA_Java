import java.util.Arrays;

public class Revision {
    public static void main(String[] args) {

        // Sorting -

        int a[] = { 10, 4, 2, 9, 8, 6, 2, 5 };
        int n = a.length;

        // 1. Selection sort - O(n^2)
        // for( int i = 0 ; i < n ; i++){
        // int minPos = i;
        // for( int j = i+1 ; j < n ; j++){
        // if(a[j] < a[minPos])
        // minPos = j;
        // }
        // int temp = a[i];
        // a[i] = a [minPos];
        // a[minPos] = temp;
        // }
        // System.out.println(Arrays.toString(a));

        // 2. Bubble Sort
        // for (int i = n-1; i >= 0; i--) {
        //     for (int j = 0; j < i; j++) {
        //         if (a[j] > a[j+1]) {
        //             int temp = a[j];
        //             a[j] = a[j+1];
        //             a[j+1] = temp;
        //         }
        //     }
        // }
        // System.out.println(Arrays.toString(a));

        // 3. Insertion Sort
        // for(int i=0; i<n; i++){
        //     int j=i;
        //     while(j>0 && a[j-1]>a[j]){
        //         int temp = a[j];
        //         a[j] = a[j-1];
        //         a[j-1] = temp;
        //         j--;
        //     }
        // }
        // System.out.println(Arrays.toString(a));

        // 
    }
}