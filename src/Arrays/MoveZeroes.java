package Arrays;

public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int j = 0;
        for (int i:nums) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }
        System.out.println(nums);
    }

    public static void main(String args[]) {
        moveZeroes(new int[]{2,1,0,9,0,0,8});
    }
}
