package HashTable;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (mp.containsKey(nums[i])) {
                if (Math.abs(mp.get(nums[i]) - i) <= k) {
                    return true;
                }
            }
            mp.put(nums[i], i);
        }
        return false;

    }

    public static void main(String args[]) {
        System.out.println(containsNearbyDuplicate(new int[]{1,0,1,1}, 1));
    }
}
