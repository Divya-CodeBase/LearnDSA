package Grind75;

public class LongSubarrOf1AfterDeletingOneElement {
    public static void main(String args[]) {
        System.out.println(longestSubarray(new int[]{1,1,1}));
    }
    public static int longestSubarray(int[] nums) {
        int l=0;int z=0;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                z++;
            }
            while(z>1){
                if(nums[l]==0){
                    z--;
                }
                l++;
            }
            max= Math.max(max, i-l);
        }
return max;
    }
}
