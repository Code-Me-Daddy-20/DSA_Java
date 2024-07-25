import java.util.ArrayList;

public class union {
    public static void main(String[] args) {
        int nums1[] = {1,2,3,0,0,0};
        int m = nums1.length;
        int nums2[] = {2,5,6};
        int n = nums2.length;
        int i = 0;
        int j = 0;
        ArrayList<Integer> al = new ArrayList<>();
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                if (al.size() == 0 || al.get(al.size() - 1) != nums1[i]) {
                    al.add(nums1[i]);
                    i++;
                }
            } else {
                if (al.size() == 0 || al.get(al.size() - 1) != nums2[j]) {
                    al.add(nums2[j]);
                    j++;
                }
            }
        }
        while (i < m) {
            if (al.isEmpty() || al.get(al.size() - 1) != nums1[i]) {
                al.add(nums1[i]);
            }
            i++;
        }

        while (j < n) {
            if (al.isEmpty() || al.get(al.size() - 1) != nums2[j]) {
                al.add(nums2[j]);
            }
            j++;
        }
    }
}