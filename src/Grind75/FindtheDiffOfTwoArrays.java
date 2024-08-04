package Grind75;

import java.util.*;

public class FindtheDiffOfTwoArrays {
    public static void main(String args[]) {
        System.out.println(findDifference(new int[]{-80,-15,-81,-28,-61,63,14,-45,-35,-10}, new int[]{-1,-40,-44,41,10,-43,69,10,2}));
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();

        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        ans.add(new ArrayList<>());

        for (int i : nums1) {
            s1.add(i);
        }

        for (int i : nums2) {
            s2.add(i);
        }

        for (int i : s1) {
            if (!s2.contains(i)) {
                ans.get(0).add(i);
            }
        }

        for (int i : s2) {
            if (!s1.contains(i)) {
                ans.get(1).add(i);
            }
        }

        return ans;
    }
}
