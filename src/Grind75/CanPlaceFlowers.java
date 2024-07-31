package Grind75;

public class CanPlaceFlowers {
    public static void main(String args[]) {
        System.out.println(canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;

        for (int i = 0; i < flowerbed.length; i++) {

            int prev = ((i == 0) || flowerbed[i - 1] == 0) ? 0 : 1;
            int next = ((i == flowerbed.length - 1) || flowerbed[i + 1] == 0) ? 0 : 1;

            if (prev == 0 && next == 0 && flowerbed[i] == 0) {
                flowerbed[i] = 1;
                count++;
            }

            if (count >= n) {
                return true;
            }
        }
        return false;

    }
}
