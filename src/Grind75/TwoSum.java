package Grind75;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String args[]) {


        int[] arr1 = twoSumHash_(new int[]{2, 1, 2, 3, 6}, 9);
        for (int i : arr1) {
            System.out.println(i);
        }
    }

    public static int[] twoSumHash_(int[] nums, int target) {
        Map<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (mp.containsKey(target - nums[i])) {
                return new int[]{mp.get(target - nums[i]), i};
            }
            mp.put(nums[i], i);
        }
        return new int[]{};

    }
}
