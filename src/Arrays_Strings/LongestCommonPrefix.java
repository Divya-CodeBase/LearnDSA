package Arrays_Strings;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String prefix = strs[0];
        for (String str : strs) {
            while (str.indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }

        }
        return prefix;

    }

    public static void main(String args[]) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }
}
