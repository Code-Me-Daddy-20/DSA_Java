import java.util.*;

public class MediumArrays {
	public static void main(String[] args) {
		int arr[] = { 2, 1, 5, 4, 3, 0, 0 };
		// Arrays.sort(arr);
		int n = arr.length;
		// int target = 14;
		// System.out.println(twoSum(arr, n, target));
		// System.out.println(Arrays.toString(sortZerOneTwo(arr, n)));
		// System.out.println(majorityElement(arr,n));
		// System.out.println(kandaneSubarray(arr, n));
		// System.out.println(buySellStock(arr, n));
		// System.out.println(LeaderElementtoRight(arr, n));
		// System.out.println(subarraywithsumK(arr, n, 4));
		// System.out.println(Arrays.toString(rearrangeArray(arr)));
		// System.out.println(Arrays.toString(nextPermutation(arr, n)));
		// System.out.println(longestConsecutive(arr));
	}

	// 1. Two Sum
	// static boolean twoSum(int a[] , int n, int k){
	// BruteForce ~ o(N^2)
	// int sum;
	// for(int i = 0; i < n; i++){
	// for (int j = i+1; j < n; j++) {
	// sum = a[i] + a[j];
	// if(sum == k) return new int[]{i , j};
	// sum = 0;
	// }
	// }
	// return new int[]{};

	// Using HashMap ~ O(n)
	// HashMap<Integer , Integer> hmp = new HashMap<>();
	// for (int i = 0; i < n; i++) {
	// int num1 = a[i];
	// int num2 = k - num1;
	// if(hmp.containsKey(num2)){
	// return true;
	// }
	// hmp.put(a[i] , i);
	// }
	// return false;

	// Using twopointer ~ O(n) + O(n log n)
	// Arrays.sort(a);
	// int left = 0, right = n - 1;
	// while(left < right) {
	// if(a[left]+a[right] == k)
	// return true;
	// else if(a[left]+a[right] < k)
	// left++;
	// else
	// right--;
	// }
	// return false;
	// }

	// 2. Sort array of [0s, 1s, 2s] without using inbuilt functions
	// static int[] sortZerOneTwo(int a[], int n) {
	// Better Approach ~ O(2n)
	// int n0 = 0; int n1 = 0; int n2 = 0;
	// for (int i = 0; i < n; i++) {
	// if(a[i] == 0)
	// n0++;
	// else if(a[i] == 1)
	// n1++;
	// else
	// n2++;
	// }
	// for (int i = 0; i < n; i++) {
	// if(i >= 0 && i < n0)
	// a[i] = 0;
	// else if(i >= n0 && i < n0+n1)
	// a[i] = 1;
	// else if(i >= n0+n1 && i < n0+n1+n2)
	// a[i] = 2;
	// }
	// return a;

	// Optimal Approach ~ O(n) [ Dutch National flag algorithm. ]
	// int low = 0; int mid = 0; int high = n-1;
	// while(mid <= high){
	// if(a[mid] == 0){
	// int temp = a[low];
	// a[low] = a[mid];
	// a[mid] = temp;
	// low++;
	// mid++;
	// }
	// else if(a[mid] == 1){
	// mid++;
	// }
	// else{
	// int temp = a[mid];
	// a[mid] = a[high];
	// a[high] = temp;
	// high--;
	// }
	// }
	// return a;
	// }

	// 3. Return number that appears more than n/2 times in an array
	// static int majorityElement(int v[],int n) {
	// Optimal solution ~ O(2n) [ Moore’s Voting Algorithm ]
	// int cnt = 0;
	// int el = 0;
	// for (int i = 0; i < n; i++) {
	// if (cnt == 0) {
	// cnt = 1;
	// el = v[i];
	// } else if (el == v[i])
	// cnt++;
	// else
	// cnt--;
	// }
	// int cnt1 = 0;
	// for (int i = 0; i < n; i++) {
	// if (v[i] == el)
	// cnt1++;
	// }

	// if (cnt1 > (n / 2))
	// return el;
	// return -1;
	// }

	// 4. Maximum subarray sum in array [ Kandane's Algorithm ]
	// static int kandaneSubarray(int a[] , int n){
	// Better Approach ~ O(n^2)
	// int maxSum = Integer.MIN_VALUE;
	// for (int i = 0; i < n; i++) {
	// int sum = 0;
	// for (int j = i; j < n; j++) {
	// sum += a[j];
	// if (maxSum < sum )
	// maxSum = sum;
	// }
	// }
	// return maxSum;
	// }

	// Optimal Approach ~ O(n)
	// int maxSum = Integer.MIN_VALUE;
	// int sum = 0;
	// int start = -1;
	// int aStart = -1, aEnd = -1;
	// for (int i = 0; i < n; i++) {
	// if(sum == 0) start = i;
	// sum+=a[i];
	// if (sum > maxSum){
	// aStart = start; aEnd = i;
	// maxSum = sum;
	// }
	// if (sum < 0)
	// sum = 0;
	// }
	// return maxSum;
	// }

	// 5. Buy and sell stock with max profit - O(n)
	// static int buySellStock(int a[] , int n){
	// int min = a[0]; int profit = 0; int buyDay = 0; int sellDay = 0;
	// for (int i = 1; i < n; i++) {
	// if(a[i] < min){
	// min = a[i];
	// buyDay = i+1;
	// }
	// if(a[i] - min > profit){
	// profit = a[i] - min;
	// sellDay = i+1;
	// }
	// }
	// System.out.println("Buy: "+buyDay+" - Sell: "+sellDay);
	// return profit;
	// }

	// 6. Leader elment to all the elements to the right sid1e of it
	// static ArrayList<Integer> LeaderElementtoRight( int a[], int n ){
	// ArrayList<Integer> list = new ArrayList<>();
	// int leader = a[n-1];
	// list.add(leader);
	// for (int i = n-2; i >= 0; i--) {
	// if(a[i] > leader){
	// leader = a[i];
	// list.add(leader);
	// }
	// }
	// return list;
	// }

	// 7. Find number of subarrays with sum K
	// static int subarraywithsumK(int a[], int n , int k){
	// Map<Integer , Integer> mp = new HashMap<>();
	// int preSum = 0; int cnt = 0;
	// mp.put(0,1);
	// for (int i = 0; i < n; i++) {
	// preSum += a[i];
	// int remove = preSum - k;
	// cnt += mp.getOrDefault(remove, 0);
	// mp.put(preSum, mp.getOrDefault(preSum, 0)+1);
	// }
	// return cnt;
	// }

	// 8. Reaarange arry elements by sign (having same no. of +ves and -ves)
	// static int[] rearrangebySign(int a[] , int n){
	// Brute Force ~
	// ArrayList<Integer> pos = new ArrayList<>();
	// ArrayList<Integer> neg = new ArrayList<>();

	// for (int i = 0; i < n; i++) {
	// if(a[i] > 0)
	// pos.add(a[i]);
	// else
	// neg.add(a[i]);
	// }

	// for (int i = 0; i < n/2; i++) {
	// a[2*i] = pos.get(i);
	// a[2*i+1] = neg.get(i);
	// }

	// return a;

	// Optimal Approach ~
	// int reArray[] = new int[n];
	// int pos = 0;
	// int neg = 1;
	// for (int i = 0; i < n; i++) {
	// if (a[i] > 0) {
	// reArray[pos] = a[i];
	// pos += 2;
	// } else {
	// reArray[neg] = a[i];
	// neg += 2;
	// }
	// }

	// return reArray;

	// (having different +ves and -ves)
	// if(a == null || n == 0){
	// return a;
	// }

	// ArrayList<Integer> pos = new ArrayList<>();
	// ArrayList<Integer> neg = new ArrayList<>();

	// for (int i = 0; i < n; i++) {
	// if(a[i] > 0)
	// pos.add(a[i]);
	// else
	// neg.add(a[i]);
	// }
	// System.out.println(pos);
	// System.out.println(neg);

	// int pv = 0; int nv = 0;
	// int newP = 0;
	// while (pv < pos.size() && nv < neg.size()) {
	// a[2*newP] = pos.get(pv++);
	// a[2*newP+1] = neg.get(nv++);
	// newP++;
	// }
	// return a;
	// }

	// 9. Next permutation
	// static int[] nextPermutation(int a[], int n) {
	// 	int index = -1;
	// 	for (int i = n - 2; i >= 0; i--) {
	// 		if (a[i] < a[i + 1]) {
	// 			index = i;
	// 			break;
	// 		}
	// 	}
	// 	if (index == -1) {
	// 		int start = 0;
	// 		int end = n - 1;
	// 		while (start < end) {
	// 			int temp = a[start];
	// 			a[start] = a[end];
	// 			a[end] = temp;
	// 			start++;
	// 			end--;
	// 		}
	// 		return a;
	// 	}

	// 	for (int i = n - 1; i >= index; i--) {
	// 		if (a[i] > a[index]) {
	// 			int temp = a[i];
	// 			a[i] = a[index];
	// 			a[index] = temp;

	// 			break;
	// 		}
	// 	}
	// 	int start = index + 1;
	// 	int end = n - 1;
	// 	while (start < end) {
	// 		int temp = a[start];
	// 		a[start] = a[end];
	// 		a[end] = temp;
	// 		start++;
	// 		end--;
	// 	}
	// 	return a;
	// }

	// 10. Longest consecutive sequence
	// static int longestConsecutive(int[] nums) {
    //     if(nums.length == 0)
    //     return 0;
    //     Set<Integer> hst = new HashSet<>();
    //     int lg = 1;
    //     for(int i = 0; i < nums.length ; i++)
    //         hst.add(nums[i]);
    //     for(int ele : hst){
    //         if(!hst.contains(ele-1)){
    //             int cnt = 1; int x = ele;
    //             while(hst.contains(x+1)){
    //                 x = x+1;
    //                 cnt++;
    //             }
    //             lg = Math.max(lg , cnt);
    //         }
    //     }
    //     return lg;
    // }

	

}
