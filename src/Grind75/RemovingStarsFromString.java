package Grind75;

import java.util.Stack;

public class RemovingStarsFromString {
    public static void main(String args[]) {
        System.out.println(removeStars("leet**cod*e"));
    }

    public static String removeStars(String s) {
        int i = 0;
        StringBuilder sb = new StringBuilder();
        char[] c = s.toCharArray();
        Stack<Character> st = new Stack();
        while (i < c.length) {
            if (i != 0 && c[i] == '*') {
                st.pop();
            } else {
                st.push(c[i]);
            }
            i++;
        }
        for (int j = 0; j < st.size(); j++) {
            sb.append(st.get(j));
        }
        return sb.toString();
    }
}
