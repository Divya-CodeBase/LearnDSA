package Arrays_Strings;

public class RotateArray {

    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        if (k < 0) {
            k += nums.length;
        }

        reverse(nums, 0, nums.length - k - 1);
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
        System.out.println(nums);

    }

    public static void reverse(int nums[], int i, int j) {
        while (j > i) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }


    public static void main(String args[]) {

        rotate(new int[]{2, 3, 1, 2, 4, 3}, 3);
    }
}
