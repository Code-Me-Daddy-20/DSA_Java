import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int nums1[] = {1,2,3,0,0,0};
        int m = 3;
        int nums2[] = {2,5,6};
        int n = 3;
        System.out.println(Arrays.toString(merge(nums1, m, nums2, n)));
    }
    static public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int index = 0;
        int newArr[] = new int [m+n];
            while(i < m && j < n){
                if (nums1[i] <= nums2[j]){
                    newArr[index++] = nums1[i];
                    i++;
                }
                else{
                    newArr[index++] = nums2[j];
                    j++;
                }
            }
            while(i < n){
                newArr[index++] = nums1[i];
                i++;
            }
            while(j < m){
                newArr[index++] = nums2[j];
                j++;
            }
            return newArr;
        }
    }