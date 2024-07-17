package HashTable;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        char[] a = new char[1001];
if(s.length()!=t.length())return false;
        for (char b : s.toCharArray()) {
            a[(int) b]++;
        }
        for (char b : t.toCharArray()) {
            if (a[(int) b] == 0) return false;
        }
        return true;
    }

    public static void main(String args[]) {
        System.out.println(isAnagram("aacc", "ccac"));
    }
}
