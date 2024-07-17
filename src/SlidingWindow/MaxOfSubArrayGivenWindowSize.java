package SlidingWindow;

public class MaxOfSubArrayGivenWindowSize {

    public static int maxOfSubArray(int a[], int k) {
        int maxSum = 0;
        int sum = 0;
        if (a.length > k) {
            for (int i = 0; i < k; i++) {
                sum += a[i];
            }

            for (int i = k; i < a.length; i++) {
                sum += a[i] - a[i - k];
                maxSum = Math.max(sum, maxSum);
            }

        } else if(a.length == k){
            for (int i = 0; i < k; i++) {
                maxSum += a[i];
            }
        }

        return maxSum;
    }

    public static void main(String args[]) {
       System.out.println(maxOfSubArray(new int[]{2, 1, 5, 1, 3, 2}, 3));
        System.out.println(maxOfSubArray(new int[]{}, 3));
        System.out.println(maxOfSubArray(new int[]{1, 2}, 2));

    }
}
