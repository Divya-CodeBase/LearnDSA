package Grind75;

public class MaxConsecutiveOnesI {
    public static void main(String args[]) {
        System.out.println(findMaxConsecutiveOnes(new int[]{1,0,1,1,0,1}));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
       int i=0;int max= Integer.MIN_VALUE;int count=0;
       while(i<nums.length){
           if(nums[i]==1){
               count++;
           }
           else{
               count=0;
           }
           i++;
           max= Math.max(count,max);

        }
        return max;
    }
}
