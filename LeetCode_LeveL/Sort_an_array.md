# Sort an Array

### *Sorting the array in O(n logn) time complexity (using MergeSort or modified QuickSort)*

```
// using nested QuickSort -
class Solution {
    public int[] sortArray(int[] nums) {
        int[] arr = new int[100001];
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        int x = 0;
        for (int i : nums) {
            x = 50000 + i;
            arr[x]++;
            if (min > x)
                min = x;
            if (max < x)
                max = x;
        }
        int k = nums.length - 1, n = k + 1;
        for (int i = max; i >= min; i--) {
            if (arr[i] == 0)
                continue;
            int len = arr[i];
            while (len-- > 0)
                nums[k--] = i - 50000;
        }
        return nums;
    }
}
```


```
class Solution {
    public int[] sortArray(int[] nums) {
        int max = nums[0];
        int min = nums[0];

        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        int n = max - min;
        int[] arr = new int[n + 1];

        for (int num : nums) {
            arr[num - min]++;
        }

        int index = 0;

        for (int i = 0; i <= n; i++) {
            while (arr[i] > 0) {
                nums[index] = min;
                index++;
                arr[i]--;
            }

            min++;
        }

        return nums;
    }
}
```