package Grind75;

public class IsSubsequence {

    public static void main(String args[]) {

        System.out.println(isSubsequence("a", "b"));

    }

    public static boolean isSubsequence(String s, String t) {
        if (s.length() == 0 ) {
            return true;
        }
        int j = 0;
        int i = 0;
        char sc[] = s.toCharArray();
        char tc[] = t.toCharArray();

        while (i < tc.length) {
            if (sc[j] == tc[i]) {
                j++;
            }
            i++;
            if (j == sc.length) {
                return true;
            }
        }

        return false;
    }
}
