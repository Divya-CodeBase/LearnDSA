package HashTable;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) return false;

        Map<Character, Character> mp = new HashMap<>();
        char ori[] = s.toCharArray();
        char rep[] = t.toCharArray();
        for (int i = 0; i < s.length(); i++) {

            if (!mp.containsKey(ori[i]))
                if (!mp.containsValue(rep[i]))
                    mp.put(ori[i], rep[i]);
                else return false;
            else {
                char oriChar = mp.get(ori[i]);
                if (oriChar != rep[i]) return false;
            }
        }

        return true;
    }

    public static void main(String args[]) {
        System.out.println(isIsomorphic("egg", "add"));
    }


}
