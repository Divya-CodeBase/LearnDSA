package SlidingWindow;

public class SubArrayWithGivenSum {
    public static int[] minSubArray(int a[], int target) {
        boolean flag=false;
        int[] b = new int[2];
        int start = 0;
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            if (sum >= target) {
                while (sum > target && start < i) {
                    sum -= a[start++];
                }
                if (sum == target) {
                    b[0] = start + 1;
                    b[1] = i + 1;
                    flag=true;
                }
            }
        }
        if(flag==false){
            b[0]=-1;
        }

        return b;
    }


    public static void main(String args[]) {
        //int c[]= minSubArray(new int[]{1, 4, 0, 0, 3, 10, 5}, 7);
        int c[]= minSubArray(new int[]{1, 4, 3, 10, 5}, 0);
        for(int i:c){
            System.out.println(i);
        }
    }
}
