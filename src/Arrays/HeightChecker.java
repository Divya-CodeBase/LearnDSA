package Arrays;

public class HeightChecker {


    public static int heightChecker(int[] height) {
        int temp = 0;
        int count = 0;
        int[] heights = height.clone();

        for (int i = 0; i < heights.length; i++) {
            for (int j = i + 1; j < heights.length; j++) {
                if (heights[i] > heights[j]) {
                    temp = heights[i];
                    heights[i] = heights[j];
                    heights[j] = temp;
                }
            }
        }
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != height[i]) {
                count++;
            }
        }
        return count;
    }

    public static int heightCheckerHash(int[] heights) {
        int temp = 1;
        int count = 0;
        int[] hashCount = new int[101];

        for (int height : heights) {
            hashCount[height]++;
        }
        for (int height : heights) {
            while (hashCount[height] == 0)
                temp++;
            if (height != temp) {
                count++;
            }
            --hashCount[temp];

        }

        return count;
    }

    public static void main(String args[]) {

        //System.out.println(heightChecker(new int[]{1, 1, 4, 2, 1, 3}));
        System.out.println(heightCheckerHash(new int[]{1, 1, 4, 2, 1, 3}));
    }
}
