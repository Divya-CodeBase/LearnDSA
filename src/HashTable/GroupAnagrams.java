package HashTable;

import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> mp= new HashMap<>();

        for(String a: strs){
            char[] chars = a.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);
            if(!mp.containsKey(sortedWord)){
                mp.put(sortedWord,new ArrayList<>());
            }
            mp.get(sortedWord).add(a);
        }
        return new ArrayList<>(mp.values());

    }
    public static void main(String args[]) {
        groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});
    }
}
