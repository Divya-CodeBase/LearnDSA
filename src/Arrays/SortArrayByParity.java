package Arrays;

public class SortArrayByParity {


    public static int[] sortArrayByParity(int[] nums) {
        int e = 0;
        int odd = nums.length - 1;
        int a[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                a[e++] = nums[i];
            } else {
                a[odd--] = nums[i];
            }
        }
        return a;
    }


    public static void main(String args[]) {

        System.out.println(sortArrayByParity(new int[]{3, 1, 2, 4}));
    }

}
