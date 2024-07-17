package Arrays;

import java.util.ArrayList;
import java.util.List;

public class NumsDisappeared {

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        int[] hashArray = new int[nums.length];
        List<Integer> ans = new ArrayList<>();

        for (int n : nums) {
            hashArray[n - 1]++;
        }
        for (int i = 0; i < hashArray.length; i++) {
            if (hashArray[i] == 0) {
                ans.add(i + 1);
            }
        }
        return ans;

    }

    public static void main(String args[]) {

        findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1});
        //System.out.println(thirdMax_SetQueue(new int[]{3,1,2,4,2,2,4,2,5,8,6,9}));
    }
}
