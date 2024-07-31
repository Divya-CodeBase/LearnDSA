package Grind75;

public class ReverseOnlyWordsInString {
    public static void main(String args[]) {
        System.out.println(reverseWords("This is a ,biyed -jfd-djha*  bfadif"));
    }
    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String modified = s.replaceAll("[^A-Za-z0-9 ]", "");
        String[] sh=modified.split("\\s+");
        for (int i = sh.length -1; i >= 0; i--) {
            sb.append(sh[i] + " ");
        }
        return sb.toString().trim();
    }
}
