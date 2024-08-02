package Grind75;

import java.util.*;

public class StringCompression {
    public static void main(String args[]) {
        //System.out.println(compress(new char[]{'a', 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c','c'}));
        //System.out.println(compress(new char[]{'a'}));
        //System.out.println(compress_Alternate(new char[]{'a'}));
        System.out.println(compress_Alternate(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'}));

    }

    //Approach to get character and count
    public static int compress(char[] chars) {

        List<Character> lt = new ArrayList<>();
        Map<Character, Integer> mp = new HashMap<>();
        for (char c : chars) {
            if (mp.containsKey(c)) {
                mp.put(c, mp.get(c) + 1);
            } else {
                mp.put(c, 1);
            }
        }
        List<Character> c = new ArrayList<>(mp.keySet());
        List<Integer> ci = new ArrayList<>(mp.values());
        for (int i = 0; i < c.size(); i++) {
            lt.add(c.get(i));
            String s = String.valueOf(ci.get(i));
            char ab[] = s.toCharArray();
            for (int j = 0; j < ab.length; j++) {
                lt.add(ab[j]);
            }
        }
        return lt.size();
    }

    //Alternate two pointer approach

    public static int compress_Alternate(char[] chars) {
        int ans = 0; // keep track of current position in compressed array

        // iterate through input array using i pointer
        for (int i = 0; i < chars.length;) {
            final char letter = chars[i]; // current character being compressed
            int count = 0; // count of consecutive occurrences of letter

            // count consecutive occurrences of letter in input array
            while (i < chars.length && chars[i] == letter) {
                ++count;
                ++i;
            }

            // write letter to compressed array
            chars[ans++] = letter;

            // if count is greater than 1, write count as string to compressed array
            if (count > 1) {
                // convert count to string and iterate over each character in string
                for (final char c : String.valueOf(count).toCharArray()) {
                    chars[ans++] = c;
                }
            }
        }

        // return length of compressed array
        return ans;

    }
}
