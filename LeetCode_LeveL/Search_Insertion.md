# Search Insertion - LC

### *Return the index where the target should be placed*

```
class Solution {
    public int searchInsert(int[] nums, int target) {
    int start = 0, mid;
    int end = nums.length-1;

    while (start <= end) {
        mid = start + (end-start)/2;
        if (nums[mid] == target) return mid;
        else if (nums[mid] > target) end = mid-1;
        else start = mid+1;
    }

    return start;
    }
}
```

- Do binary search to get the target and return the index value
- if not found the return the length of the array, as the array is sorted and the target is not found then it must be placed at last.