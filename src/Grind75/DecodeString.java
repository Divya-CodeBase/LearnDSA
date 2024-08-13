package Grind75;

import java.util.Stack;

public class DecodeString {
    public static void main(String args[]) {
        System.out.println(decodeString("3[a2[bc]]"));
    }

    public static String decodeString(String s) {

        Stack<Integer> sn = new Stack<Integer>();
        Stack<String> ss = new Stack<>();

        int index = 0;
        String res = "";
        while (index < s.length()) {
            if (Character.isDigit(s.charAt(index))) {
                int count = 0;
                while (Character.isDigit(s.charAt(index))) {
                    count = count * 10 + s.charAt(index) - '0';
                    index++;
                }
                sn.push(count);
            } else if (s.charAt(index) == '[') {
                ss.push(res);
                res="";
                index++;
            } else if (s.charAt(index) == ']') {
                StringBuilder sb= new StringBuilder(ss.pop());
                int count = sn.pop();
                for(int i=0;i<count;i++){
                    sb.append(res);
                }
                res=sb.toString();
                index++;
            } else {
                res += s.charAt(index);
                index++;
            }
        }

        return res;

    }
}
