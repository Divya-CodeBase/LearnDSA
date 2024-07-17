package Arrays_Strings;

public class ReverseWordsInString {
    public static String reverseWords(String s) {
        String [] strArr= s.split("\\s+");
        StringBuilder sb= new StringBuilder();
        for(int i= strArr.length-1;i>=0;i--){
            sb.append(strArr[i]+" ");
        }
        return sb.toString().trim();
    }
    public static void main(String args[]) {
        System.out.println(reverseWords("Hello  a World"));
    }
}
