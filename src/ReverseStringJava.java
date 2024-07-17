import java.util.*;

public class ReverseStringJava {

    public static void main(String[] args) {

        String s =  "Divya";
        System.out.println(reverseForChar(s));
        System.out.println(reversedefault(s));
        System.out.println(reversebytearr(s));
        reverseList(s);
        reverseStack(s);




    }
    public static String reversedefault(String s){
       StringBuilder sbdr = new StringBuilder(s);
       String output = sbdr.reverse().toString();
        return output;
    }
    public static String reversebytearr(String s){
        byte [] arr =s.getBytes();
        byte [] result =  new byte[arr.length];
        for(int i=0;i<arr.length;i++){
            result[i] = arr[arr.length-i-1];

        }
        return (new String(result));

    }

    public static void reverseList(String s){
        char [] arr =  s.toCharArray();
       List<Character> lt = new ArrayList<Character>();

       for(char a : arr){
           lt.add(a);
       }
        Collections.reverse(lt);
        Iterator it = lt.iterator();
        while(it.hasNext()){
            System.out.print(it.next());
        }
        System.out.println();
    }
    public static String reverseForChar(String s){
         char [] arr =s.toCharArray();
        String output = "";
        for(int i=0;i<arr.length;i++){
            output = arr[i]+output;
         }
        return output;
    }
    public static void reverseStack(String s){
        char [] arr =  s.toCharArray();
        Stack<Character> st = new Stack<Character>();

        for(char a: arr){
            st.push(a);
        }
        if(!st.isEmpty())
        for(char a: arr){
            System.out.print(st.pop());
        }
    }
}
