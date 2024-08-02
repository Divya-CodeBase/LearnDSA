package Grind75;

public class FindPivotIndex {
    public static void main(String args[]) {
        System.out.println(pivotIndex(new int[]{1,7,3,6,5,6}));
    }

    public static int pivotIndex(int[] nums) {
        int lsum = 0;
        int rsum = 0;
        int total = 0;
        for (int n : nums) {
            total += n;
        }

        for (int i = 0; i < nums.length; i++) {
            rsum = total - lsum - nums[i];
            if (rsum == lsum) {
                return i;
            }
            lsum += nums[i];
        }
        return -1;
    }
}
