package Grind75;

public class IncreasingTripletSubsequence {

    public static void main(String args[]) {
        System.out.println(increasingTriplet(new int[]{1,5,3,4}));
        //System.out.println(increasingTriplet_Alternate(new int[]{1, 5, 2, 3}));
    }

    public static boolean increasingTriplet(int[] nums) {

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int n : nums) {
            if (n < first && n < second) {
                first = n;
            }
            if (n > first && n < second) {
                second = n;
            }
            if (n > first && n > second) {
                return true;
            }
        }

        return false;
    }

    public static boolean increasingTriplet_Alternate(int[] nums) {

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int n : nums) {
            if (n <= first) {
                first = n;
            } else if (n <= second) {
                second = n;
            } else
                return true;
        }


        return false;
    }

    }
