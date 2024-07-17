import java.util.*;

public class forLoopcondition {

    public static void findDuplicates(String a){

        char [] c= a.toCharArray();
        Map<Character,Integer> mp= new HashMap<>();

        for(int i=0;i<c.length;i++){
            if(mp.containsKey(c[i])){
                mp.put(c[i],mp.get(c[i])+1);
            }
            else{
                mp.put(c[i],1);
            }
        }
        for(char ab: mp.keySet()){
            System.out.println( ab+"   "+mp.get(ab));
        }
    }

public static void main(String args[]){
    findDuplicates("ggggabbaaaacdeedf");

}












}
