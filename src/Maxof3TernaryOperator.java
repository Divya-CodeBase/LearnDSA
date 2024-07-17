public class Maxof3TernaryOperator {

    public static void main(String[] args){

        int a=2, b=8,c=6,result;

        result =((a>b)?(a>c)?a:c:(b>c)?b:c);
        System.out.println(result);

    }
}
