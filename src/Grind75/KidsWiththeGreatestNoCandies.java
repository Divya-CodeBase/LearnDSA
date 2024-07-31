package Grind75;

import java.util.ArrayList;
import java.util.List;

public class KidsWiththeGreatestNoCandies {

    public static void main(String args[]) {
        kidsWithCandies(new int[]{4, 2, 1, 1, 2}, 1);
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> resultArr = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i : candies) {
            max = Math.max(i, max);
        }
        for (int i : candies) {
            int extraCount = i + extraCandies;
            if (extraCount >= max) {
                resultArr.add(true);
            } else {
                resultArr.add(false);
            }
        }
        return resultArr;
    }

}
