import java.util.Arrays;
import java.util.HashMap;

public class MediumArrays{
	public static void main(String[] args) {
		int arr[] = {2,2,1,1,0,0,1,0,1};
		int n = arr.length;
		// int target = 14;
		// System.out.println(twoSum(arr, n, target));
		System.out.println(Arrays.toString(sortZerOneTwo(arr, n)));
	}

	// 1. Two Sum
	// static boolean twoSum(int a[] , int n, int k){
		// BruteForce ~ o(N^2)
		// int sum;
		// for(int i = 0; i < n; i++){
		// 	for (int j = i+1; j < n; j++) {
		// 		sum = a[i] + a[j];
		// 		if(sum == k) return new int[]{i , j};
		// 		sum = 0;
		// 	}
		// }
		// return new int[]{};

		// Using HashMap ~ O(n)
		// HashMap<Integer , Integer> hmp = new HashMap<>();
		// for (int i = 0; i < n; i++) {
		// 	int num1 = a[i];
		// 	int num2 = k - num1;
		// 	if(hmp.containsKey(num2)){
		// 		return true;
		// 	}
		// 	hmp.put(a[i] , i);
		// }
		// return false;

		// Using twopointer ~ O(n) + O(n log n)
		// Arrays.sort(a);
		// int left = 0, right = n - 1;
		// while(left < right) {
		// 	if(a[left]+a[right] == k)
		// 	return true;
		// 	else if(a[left]+a[right] < k)
		// 	left++;
		// 	else
		// 	right--;
		// }
		// return false;
		// }

		// 2. Sort array without using inbuilt functions
		static int[] sortZerOneTwo(int a[], int n) {
			// Better Approach ~ O(2n)
			// int n0 = 0; int n1 = 0; int n2 = 0;
			// for (int i = 0; i < n; i++) {
			// 	if(a[i] == 0)
			// 	n0++;
			// 	else if(a[i] == 1)
			// 	n1++;
			// 	else
			// 	n2++;
			// }	
			// for (int i = 0; i < n; i++) {
			// 	if(i >= 0 && i < n0)
			// 	a[i] = 0;
			// 	else if(i >= n0 && i < n0+n1)
			// 	a[i] = 1;
			// 	else if(i >= n0+n1 && i < n0+n1+n2)
			// 	a[i] = 2; 
			// }	
			// return a;

			// Optimal Approach ~ O(n)
			int low = 0; int mid = 0; int high = n-1;
			while(mid <= high){
				if(a[mid] == 0){
					int temp = a[low];
					a[low] = a[mid];
					a[mid] = temp;
					low++;
					mid++;
				}
				else if(a[mid] == 1){
					mid++;
				}
				else{
					int temp = a[mid];
					a[mid] = a[high];
					a[high] = temp;
					high--;
				}
			}
			return a;

		}
}