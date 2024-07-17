package Arrays_Strings;

public class ImplementstrStr {

    public static int strStr(String haystack, String needle) {

        if(haystack.indexOf(needle)>-1){
            return haystack.indexOf(needle);
        }
        return -1;

    }
    public static void main(String args[]) {
        System.out.println(strStr("leetcode", "leeto"));
    }
}
