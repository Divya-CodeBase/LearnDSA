package Grind75;

public class MaxConsecutiveOnesIII {
    public static void main(String args[]) {
        System.out.println(findMaxConsecutiveOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0}, 2));
    }

    public static int findMaxConsecutiveOnes(int[] nums, int k) {

        int j = 0;
        int z = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                z++;
            }
            while (z > k) {
                if (nums[j] == 0) {
                    z--;
                }
                j++;
            }
            max = Math.max(max, i - j + 1);
        }
        return max;
    }
}