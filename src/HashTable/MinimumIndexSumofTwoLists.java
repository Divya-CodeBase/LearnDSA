package HashTable;

import java.util.*;

public class MinimumIndexSumofTwoLists {

    public static String[] findRestaurant(String[] list1, String[] list2) {
        List<String> result = new ArrayList<>();
        Map<String, Integer> mp1 = new HashMap<>();
        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i < list1.length; i++) {
            mp1.put(list1[i], i);
        }
        for (int i = 0; i < list2.length; i++) {
            if (mp1.containsKey(list2[i])) {
                int sum = i + mp1.get(list2[i]);
                if (sum < minLen) {
                    result.clear();
                    result.add(list2[i]);
                    minLen = sum;
                } else if (sum == minLen) {
                    result.add(list2[i]);
                }
            }
        }

        return result.toArray(new String[0]);
    }

    public static void main(String args[]) {
        System.out.println(findRestaurant(new String[]{"KFC"}, new String[]{"KFC"}));
    }
}
