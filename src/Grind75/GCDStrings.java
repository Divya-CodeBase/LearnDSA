package Grind75;

public class GCDStrings {
    public static String gcdOfStrings(String str1, String str2) {

        if(!(str1+str2).equals(str2+str1)){
            return "";
        }
        int gcd = gcd_string(str1.length(),str2.length());
        return str1.substring(0,gcd);

    }

    public static int gcd_string(int n, int m){
        if(n==0){
            return m;
        }
        return gcd_string(m%n,n);
    }
    public static void main(String args[]) {
       System.out.println(gcdOfStrings("AAAAAB","AAB"));


    }
}
