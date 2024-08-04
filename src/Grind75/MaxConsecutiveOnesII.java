package Grind75;

public class MaxConsecutiveOnesII {
    public static void main(String args[]) {
        System.out.println(findMaxConsecutiveOnes(new int[]{1,0,1,1,0,1}));
        System.out.println(findMaxConsecutiveOnes_a(new int[]{1,0,1,1,0,1}));

    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int l=0;int r=0;int max= Integer.MIN_VALUE;int z=0;
        while(r<nums.length){
            if(nums[r]==1){
                r++;
                max= Math.max(max,r-l);
            }
            else{
                z++;
                while(z>1){
                    if(nums[l]==0){
                        z--;
                        l++;
                    }
                    else{
                        l++;
                    }
                }
                r++;
            }
        }
        return max;

    }
    public static int findMaxConsecutiveOnes_a(int[] nums) {
        int j = 0;
        int z = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                z++;
            }
            while (z > 1) {
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
