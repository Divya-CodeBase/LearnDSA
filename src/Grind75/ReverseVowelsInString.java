package Grind75;

import java.util.Stack;

public class ReverseVowelsInString {
    public static void main(String args[]) {
        //System.out.println(reverseVowels("leetcode"));
        System.out.println(reverseVowels_CharArray("leetcode"));
    }

    public static String reverseVowels(String s) {
        StringBuilder result = new StringBuilder();
        Stack sc = new Stack<>();
        for (char i : s.toCharArray()) {
            if (isVowel(i))
                sc.push(i);
        }
        for (char i : s.toCharArray()) {
            if (isVowel(i)) {
                result.append(sc.pop());
            } else {
                result.append(i);
            }
        }
        return result.toString();
    }

    public static boolean isVowel(char c) {

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
            return true;
        else
            return false;
    }

    public static String reverseVowels_CharArray(String s) {

        String vowel = "aeiouAEIOU";
        char[] cs = s.toCharArray();
        int i = 0, j = cs.length - 1;
        while (i < j) {
            while (i < j && vowel.indexOf(cs[i]) == -1) {
                i++;
            }
            while (i < j && vowel.indexOf(cs[j]) == -1) {
                j--;
            }
            char temp = cs[i];
            cs[i] = cs[j];
            cs[j] = temp;
            i++;j--;
        }
        return String.valueOf(cs);
    }
}
