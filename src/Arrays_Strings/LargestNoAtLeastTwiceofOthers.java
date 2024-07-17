package Arrays_Strings;

public class LargestNoAtLeastTwiceofOthers {
    public static int dominantIndex(int[] nums) {
        int largest =0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[largest]) {
                largest = i;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[largest] < 2 * nums[i]&& largest!=i) {
                return -1;
            }
        }
        return largest;
    }

    public static void main(String args[]) {

        System.out.println(dominantIndex(new int[]{0,0,1,2}));
    }
}
