package Grind75;

import java.util.Arrays;

public class ProductofArrayExceptSelf {
    public static void main(String args[]) {
        productExceptSelf(new int[]{1, 2, 3, 4});
        //productExceptSelf_BruteForce(new int[]{1, 2, 3, 4});
        //productExceptSelf_Division(new int[]{1, 2, 3, 4});
        //productExceptSelf_Optimized(new int[]{1, 2, 3, 4});
    }

    //Brute Force
    public static int[] productExceptSelf_BruteForce(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        Arrays.fill(ans, 1);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                ;
                ans[i] *= nums[j];
            }
        }
        return ans;
    }

    //Left Right product approach
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        int left[] = new int[n];
        int right[] = new int[n];

        left[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }
        right[n - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }
        for (int i = 0; i < nums.length; i++) {
            ans[i] = left[i] * right[i];
        }
        return ans;
    }

    //Division approach
    public static int[] productExceptSelf_Division(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        int product = 1;

        for (int i : nums) {
            product *= i;
        }

        for (int i = 0; i < nums.length; i++) {
            ans[i] = product / nums[i];

        }

        return ans;
    }

    public static int[] productExceptSelf_Optimized(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        int p = 1;
        for (int i = 0; i < nums.length; i++) {
            ans[i] = p;
            p *= nums[i];
        }
        p = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            ans[i] *= p;
            p *= nums[i];
        }
        return ans;
    }

}

