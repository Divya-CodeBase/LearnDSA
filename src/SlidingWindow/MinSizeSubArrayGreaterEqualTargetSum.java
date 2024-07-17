package SlidingWindow;

public class MinSizeSubArrayGreaterEqualTargetSum {

    public static int minSubArray(int a[], int k) {
        int minSize = Integer.MAX_VALUE;
        int sum = 0;
        int start = 0;
        int end = 0;


            for (end = 0; end < a.length; end++) {
                sum += a[end];
                while (sum >= k) {
                    minSize = Math.min(minSize, end - start + 1);
                    sum -= a[start++];
                }
            }


        return minSize == Integer.MAX_VALUE ? 0 : minSize;
    }


    public static void main(String args[]) {
        System.out.println(minSubArray(new int[]{2, 3, 1, 2, 4, 3}, 7));
        System.out.println(minSubArray(new int[]{1, 4, 4,}, 4));
        System.out.println(minSubArray(new int[]{1, 1, 1, 1, 1, 1, 1, 1}, 11));

    }
}
