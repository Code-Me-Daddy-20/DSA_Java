
# Plus One - LC

### *Increment the arrays (as numbers) by 1*

```
class Solution {
    public int[] plusOne(int[] digits) {
        for( int i = digits.length - 1 ; i >= 0 ; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            else
                digits[i] = 0;
        }
        digits = new int [digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
```

- Check if the element is less than 9 from right to left (for n --> 0) . 
If true increment by 1
- If the element is 9 then make it 0 and move towards left and check again.
- If all the elements are 9 then make a new array of length (n + 1) and then make the first element as 1.
