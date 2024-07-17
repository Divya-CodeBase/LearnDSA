package HashTable;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int ans = 0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            ans = ans^nums[i];
        }
        return ans;

    }

    public static void main(String args[]) {
        System.out.println(singleNumber(new int[]{4,1,2,1,2}));
    }
}
