package Arrays_Strings;

public class ReverseWordsinStringIII {
    public static String reverseWords(String s) {
        String[] str = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            char[] chr = str[i].toCharArray();
            String reverseWord = "";
            for (int j = chr.length - 1; j >= 0; j--) {
                reverseWord =  reverseWord+chr[j];
            }
            sb.append(reverseWord + " ");
        }

        return sb.toString().trim();
    }

    public static void main(String args[]) {
        System.out.println(reverseWords("Hello's a World"));
    }
}
