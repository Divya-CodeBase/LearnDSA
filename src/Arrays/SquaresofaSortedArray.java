package Arrays;

public class SquaresofaSortedArray {

    public static int[] sortedSquares(int[] nums) {
        int[] sortedArray = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {

            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                sortedArray[i] = nums[left] * nums[left];
                left++;
            } else {
                sortedArray[i] = nums[right] * nums[right];
                right--;
            }
        }
        return sortedArray;
    }

    public static void main(String args[]) {
        System.out.println(sortedSquares(new int[]{-4, -1, 0, 3, 10}));
    }

}
