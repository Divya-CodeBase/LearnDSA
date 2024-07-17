package HashTable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FirstUniqueCharacterinaString {


    public static int firstUniqChar(String s) {
        char[] ch = s.toCharArray();
        Map<Character, Integer> mp = new HashMap<>();
        for (char c : ch) {
                mp.put(c, mp.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (mp.get(a) == 1) {
                return i; // Found the first unique character
            }
        }
        return -1;

    }

    public static int firstUniqChar_IntArray(String s) {
        char[] ch = s.toCharArray();

        int [] charArr= new int[128];
        for (int i = 0; i < ch.length; i++) {
            char c = ch[i];
            // char c cũng là index của nó ;
            int index = (int) c;
            charArr[index]++;
        }
        for(int i=0;i<ch.length;i++){
            char c =ch[i];
            int index =(int)c;
            if(charArr[index]==1){
                return i;
            }
        }
        return -1;



    }

    public static void main(String args[]) {
        System.out.println(firstUniqChar("loveleetcode"));
        System.out.println(firstUniqChar_IntArray("loveleetcode"));
    }
}
