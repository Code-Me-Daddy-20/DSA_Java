# Closest to Zero 

### *Return closest number to zero , postive if possible*


```
class Solution {
    public int findClosestNumber(int[] nums) {
        int closetoZero = 999999999;
        for( int e : nums){
            if( Math.abs(e) < Math.abs(closetoZero) || e == Math.abs(closetoZero))
                closetoZero = e;
        } 
        return closetoZero;
    }
}
```


- Take a variable with maximum limit.
- Loop through the array and check if the absolute value of the current element is less than the absolute value of the variable.( for the closest element to zero (+ve or -ve)) OR if current element is equal to absolute value of variable ( only for +ve case).
- Return the value.
