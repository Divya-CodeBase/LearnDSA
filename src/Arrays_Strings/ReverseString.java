package Arrays_Strings;

public class ReverseString {


    public static void reverseString(char[] s) {

        int l = 0;
        int r = s.length - 1;

        while (l < r) {
            char temp;
            temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
        System.out.println(s);

    }


    public static void main(String args[]) {

        //reverseString(new char[]{'H', 'a', 'n', 'n', 'a', 'h'});
        reverseString(new char[]{'h', 'e', 'l', 'o', 'm', 'i'});
    }
}
