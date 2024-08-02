package Grind75;

public class ContainerWithMostWater {
    public static void main(String args[]) {
        System.out.println(maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    public static int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int heights = Integer.MIN_VALUE;
        int width = 0;
        int capacity = Integer.MIN_VALUE;

        while (i < j) {
            heights = Math.min(height[i], height[j]);
            width = j-i;
            capacity = Math.max(capacity, heights * width);
            if (heights == height[i]) i++;
            else
                j--;

        }
        return capacity;
    }

}
