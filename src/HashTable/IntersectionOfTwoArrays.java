package HashTable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOfTwoArrays {
    //Type1: Brute force
    public static List<Integer> intersection(int[] nums1, int[] nums2) {
        List<Integer> lt = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j] && !lt.contains(nums1[i])) {
                    lt.add(nums1[i]);
                }
            }
        }
        return lt;
    }

    //Type2: while loop
    public static List<Integer> intersection_type2(int[] nums1, int[] nums2) {
        List<Integer> lt = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j] && !lt.contains(nums1[i])) {
                lt.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                i++;
            }
        }
        return lt;
    }

    //Type3 Using set
    public static int[] intersection_type3(int[] nums1, int[] nums2) {
        List<Integer> lt = new ArrayList<>();
        Set<Integer> st = new HashSet<>();
        for (int n : nums1) {
            st.add(n);
        }
        for (int n : nums2) {
            if (st.contains(n) && !lt.contains(n)) lt.add(n);
        }
        int[] res = new int[lt.size()];
        for (int j1 = 0; j1 < lt.size(); j1++) {
            res[j1] = lt.get(j1);
        }

        return res;

    }

    //type4 Integer hash
    public static int[] intersection_type4(int[] nums1, int[] nums2) {

        int[] countArray = new int[1001];
        ArrayList<Integer> resList = new ArrayList<Integer>();
        for (int num1 : nums1) countArray[num1] = 1;
        for (int num2 : nums2) if (countArray[num2] == 1) countArray[num2] = 2;
        for (int i = 0; i < countArray.length; i++) {
            if (countArray[i] == 2) {
                resList.add(i);
            }
        }

        // Convert the ArrayList to an array for the return value
        int[] res = new int[resList.size()];
        for (int i = 0; i < resList.size(); i++) {
            res[i] = resList.get(i);
        }
        return res;
    }


    public static void main(String args[]) {
        // System.out.println(intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2}));
        //System.out.println(intersection_type2(new int[]{1, 2, 2, 1}, new int[]{2, 2}));
        System.out.println(intersection_type3(new int[]{4, 7, 9, 7, 6, 7}, new int[]{5, 0, 0, 6, 1, 6, 2, 2, 4}));
//        System.out.println(intersection_type4(new int[]{4, 7, 9, 7, 6, 7}, new int[]{5, 0, 0, 6, 1, 6, 2, 2, 4}));

    }
}
