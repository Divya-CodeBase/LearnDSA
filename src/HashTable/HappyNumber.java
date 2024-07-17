package HashTable;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public static boolean isHappy(int n) {

        Set<Integer> st = new HashSet<>();
        while (true) {
            int result=0;
            while (n != 0) {
                int temp=n%10;
                result+=temp*temp;
                n = n / 10;
            }
            if (result == 1) {
                return true;
            }
            n = result;
            if (st.contains(n)) return false;
            st.add(n);
        }
    }


    public static void main(String args[]) {
        System.out.println(isHappy(19));


    }
}
