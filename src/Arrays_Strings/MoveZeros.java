package Arrays_Strings;

public class MoveZeros {
    public static void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }
        for(;j<nums.length;j++){
            nums[j]=0;
        }
        System.out.println(nums);
    }

    public static void main(String args[]) {
        moveZeroes(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4,0,6,0});
    }
}
