package Arrays;

public class RemoveDupFromSortedArray {

    public static int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[j++] = nums[i];
            }
        }

        nums[j++]=nums[nums.length-1];
        return j;

    }

    public static void main(String args[]) {


        System.out.println(removeDuplicates(new int[]{1, 2, 2, 3, 3, 4}));
    }
}
