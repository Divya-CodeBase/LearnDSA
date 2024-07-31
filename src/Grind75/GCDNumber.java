package Grind75;

public class GCDNumber {
    public static void main(String args[]) {

        System.out.println(gcd(15,10));
        System.out.println(gcd_Number(15,10));



    }
    public static int gcd_Number(int a, int b) {
        if (a == 0)
            return b;

        return gcd_Number(b % a, a);
    }

    public static int gcd(int a,int b){
        while(a!=0){
            int temp= a;
            a= a%b;
            b=temp;
        }
        return b;
    }
}
