package Arrays;

import java.util.Map;
import java.util.TreeMap;

public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0 && i >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];

            } else {
                nums1[k--] = nums2[j--];

            }
        }

        while(i>=0){
            nums1[k--]=nums1[i--];
        }
        while(j>=0){
            nums1[k--]=nums2[j--];
        }

        System.out.println(nums1);
    }


    public static void main(String args[]) {
        // merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);
        //merge(new int[]{1}, 1, new int[]{}, 0);
        merge(new int[]{0}, 0, new int[]{1}, 1);
    }
}
