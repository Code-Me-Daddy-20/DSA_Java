import java.util.Arrays;
import java.util.HashMap;

public class MediumArrays{
	public static void main(String[] args) {
		int arr[] = {2,6,5,8,11};
		int n = arr.length;
		int target = 14;
		System.out.println(twoSum(arr, n, target));
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
	}
}