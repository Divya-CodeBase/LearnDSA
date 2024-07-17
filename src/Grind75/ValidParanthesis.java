package Grind75;

import java.util.Stack;

public class ValidParanthesis {


    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '(' || c == '{' || c == '[') {
                    st.push(c);
                } else {
                    if (st.isEmpty()) {
                        return false;
                    }
                    char ch = st.pop();
                    if ((c == ')' && ch != '(') || (c == '}' && ch != '{') || (c == ']' && ch != '[')) {
                        return false;
                    }
                }
            }
        return st.empty();
    }

    public static void main(String args[]) {
        System.out.println(isValid("()"));
    }
}
