package HashTable;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> st = new HashSet<>();
        for (int n : nums) {
            if (st.contains(n)) {
                return true;
            }
            st.add(n);
        }
        return false;
    }

    public static void main(String args[]) {
        System.out.println(containsDuplicate(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4, 0, 6, 0}));
    }
}
