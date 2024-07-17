package Arrays;

public class FindNumberswithEvenNumberofDigits {
    public static int findNumbers(int[] nums) {
        int count = 0;
        int c = 0;
        for (int a : nums) {
            c = digitCount(a);
            if(c%2==0){
                count++;
            }
        }
        return count;
    }
    public static int digitCount(int n) {
        int digitcount = 0;
        while(n>0) {
            n = n / 10;
            digitcount++;
        }

        return digitcount;
    }

    public static void main(String args[]) {
        System.out.println(findNumbers(new int[]{12,345,2,6,7896}));
    }
}
