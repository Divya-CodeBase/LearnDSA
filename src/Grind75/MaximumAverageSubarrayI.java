package Grind75;

public class MaximumAverageSubarrayI {
    public static void main(String args[]) {

        System.out.println(findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4));

    }

    public static double findMaxAverage(int[] nums, int k) {

        int i = 0;
        int j = i + k;
        int sum = 0;
        double average = 0;

        for (int a = 0; a < k; a++) {
            sum += nums[a];
        }

        average = (double) sum / k;
        while (j < nums.length) {
            sum -= nums[i];
            sum += nums[j];
            i++;
            j++;
            average = Math.max( (double)sum / k, average);
        }

        return average;


    }
}
