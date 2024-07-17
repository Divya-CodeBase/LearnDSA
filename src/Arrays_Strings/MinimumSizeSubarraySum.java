package Arrays_Strings;

public class MinimumSizeSubarraySum {

    public static int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int minLen = Integer.MAX_VALUE;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum>=target){
                minLen= Math.min(minLen,i-l+1);
                sum-=nums[l++];
            }
        }
        return minLen== Integer.MAX_VALUE?0:minLen;
    }

    public static void main(String args[]) {

        System.out.println(minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
    }
}
