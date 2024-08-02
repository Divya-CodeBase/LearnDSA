package Grind75;

public class MoveZeroes {
    public static void main(String args[]) {
        moveZeroes(new int[]{1, 2, 0,0,8,0, 4});
    }
    public static int[] moveZeroes(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[j++]=nums[i];
            }
        }

        for(;j<nums.length;j++){
            nums[j]=0;
        }
        return nums;
    }

}
