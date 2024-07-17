package Arrays;

public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxLen = Integer.MIN_VALUE;
        int count = 0;
        for (int n : nums) {
            if (n == 1) {
                count++;
            } else {
                count = 0;
            }
           maxLen= Math.max(count,maxLen);

        }

        return maxLen;
    }


    public static void main(String args[]) {
        System.out.println(findMaxConsecutiveOnes(new int []{1,1,0,1,1,1}));
    }

}
