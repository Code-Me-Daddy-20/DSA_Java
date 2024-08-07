import java.util.*;

public class MediumArrays{
	public static void main(String[] args) {
		int arr[] = {2,1,3,5,6};
		// Arrays.sort(arr);
		int n = arr.length;
		// int target = 14;
		// System.out.println(twoSum(arr, n, target));
		// System.out.println(Arrays.toString(sortZerOneTwo(arr, n)));
		// System.out.println(majorityElement(arr,n));
		// System.out.println(kandaneSubarray(arr, n));
		// System.out.println(buySellStock(arr, n));
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

		// 2. Sort array of [0s, 1s, 2s] without using inbuilt functions
		// static int[] sortZerOneTwo(int a[], int n) {
		// 	Better Approach ~ O(2n)
		// 	int n0 = 0; int n1 = 0; int n2 = 0;
		// 	for (int i = 0; i < n; i++) {
		// 		if(a[i] == 0)
		// 		n0++;
		// 		else if(a[i] == 1)
		// 		n1++;
		// 		else
		// 		n2++;
		// 	}	
		// 	for (int i = 0; i < n; i++) {
		// 		if(i >= 0 && i < n0)
		// 		a[i] = 0;
		// 		else if(i >= n0 && i < n0+n1)
		// 		a[i] = 1;
		// 		else if(i >= n0+n1 && i < n0+n1+n2)
		// 		a[i] = 2; 
		// 	}	
		// 	return a;

		// Optimal Approach ~ O(n) [ Dutch National flag algorithm. ]
		// 	int low = 0; int mid = 0; int high = n-1;
		// 	while(mid <= high){
		// 		if(a[mid] == 0){
		// 			int temp = a[low];
		// 			a[low] = a[mid];
		// 			a[mid] = temp;
		// 			low++;
		// 			mid++;
		// 		}
		// 		else if(a[mid] == 1){
		// 			mid++;
		// 		}
		// 		else{
		// 			int temp = a[mid];
		// 			a[mid] = a[high];
		// 			a[high] = temp;
		// 			high--;
		// 		}
		// 	}
		// 	return a;
		// }

		// 3. Return number that appears more than n/2 times in an array
		// static int majorityElement(int v[],int n) {
		// Optimal solution ~ O(2n) [ Moore’s Voting Algorithm ]
		// 	int cnt = 0;
		// 	int el = 0;
		// 	for (int i = 0; i < n; i++) {
		// 		if (cnt == 0) {
		// 			cnt = 1;
		// 			el = v[i];
		// 		} else if (el == v[i])
		// 			cnt++;
		// 		else
		// 			cnt--;
		// 	}
		// 	int cnt1 = 0;
		// 	for (int i = 0; i < n; i++) {
		// 		if (v[i] == el)
		// 			cnt1++;
		// 	}

		// 	if (cnt1 > (n / 2))
		// 		return el;
		// 	return -1;
		// }

		// 4. Maximum subarray sum in array [ Kandane's Algorithm ]
		// static int kandaneSubarray(int a[] , int n){
			// Better Approach ~ O(n^2)
		// 	int maxSum = Integer.MIN_VALUE;
		// 	for (int i = 0; i < n; i++) {
		// 		int sum = 0;
		// 		for (int j = i; j < n; j++) {
		// 			sum += a[j];
		// 			if (maxSum < sum )
		// 			maxSum = sum;
		// 		}
		// 	}
		// 	return maxSum;
		// }


			// Optimal Approach ~  O(n)
		// 	int maxSum = Integer.MIN_VALUE; 
		// 	int sum = 0; 
		// 	int start = -1; 
		// 	int aStart = -1, aEnd = -1;
		// 	for (int i = 0; i < n; i++) {
		// 		if(sum == 0) start = i;
		// 		sum+=a[i];
		// 		if (sum > maxSum){
		// 			aStart = start; aEnd = i;
		// 			maxSum = sum;
		// 		}
		// 		if (sum < 0)
		// 		sum = 0;
		// 	}
		// 	return maxSum;
		// }

		// 5. Buy and sell stock with max profit - O(n)
		// static int buySellStock(int a[] , int n){
		// 	int min = a[0]; int profit = 0; int buyDay = 0; int sellDay = 0;
		// 	for (int i = 1; i < n; i++) {
		// 		if(a[i] < min){
		// 			min = a[i];
		// 			buyDay = i+1;
		// 		}
		// 		if(a[i] - min > profit){
		// 			profit = a[i] - min;
		// 			sellDay = i+1;
		// 		}
		// 	}
		// 	System.out.println("Buy: "+buyDay+" - Sell: "+sellDay);
		// 	return profit;
		// }
}
  