package Grind75;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MaxNoOfKSumPairs {
    public static void main(String args[]) {
        //System.out.println(maxOperations(new int[]{1, 2, 3, 4}, 5));
        //System.out.println(maxOperations_BruteForce(new int[]{4, 4, 1, 3, 1, 3, 2, 2, 5, 5, 1, 5, 2, 1, 2, 3, 5, 4}, 2));
        System.out.println(maxOperations_SortedTwoPointer(new int[]{4, 4, 1, 3, 1, 3, 2, 2, 5, 5, 1, 5, 2, 1, 2, 3, 5, 4}, 2));

    }

    //Brute force
    public static int maxOperations_BruteForce(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == -1) continue;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == -1) continue;
                if (nums[i] + nums[j] == k) {
                    count++;
                    nums[i] = -1;
                    nums[j] = -1;
                    break;
                }
            }
        }
        return count;
    }

    //Sort array and two pointer
    public static int maxOperations_SortedTwoPointer(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;
        int count = 0;
        while (i < j) {
            int sum = nums[i] + nums[j];
            if (sum == k) {
                count++;
                i++;
                j--;
            } else if (sum > k) j--;
            else i++;
        }
        return count;
    }

    public static int maxOperations_Map(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int res = k - nums[i];
            if (mp.containsKey(res)) {
                count++;
                if (mp.get(res) == 1) mp.remove(res, mp.get(res));
                else mp.put(res, mp.get(res) - 1);
            } else {
                mp.put(nums[i], mp.getOrDefault(nums[i],0)+1);
            }

        }
        return count;
    }

}
