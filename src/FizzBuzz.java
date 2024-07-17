import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz {


    public static List<String> fizzBuzz(int n) {
        List<String> lst = new ArrayList<String>();
        if (!(n <= 0)) {
            for (int i = 1; i <= n; i++) {

                if ((i % 5 == 0) && (i % 3 == 0)) {
                    lst.add("FizzBuzz");
                } else if (i % 5 == 0) {
                    lst.add("Buzz");
                } else if (i % 3 == 0) {
                    lst.add("Fizz");
                } else {
                    lst.add(Integer.toString(i));
                }
            }
        } else {
            System.out.println("Invalid input");
        }

        return lst;
    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(fizzBuzz(i));
    }

}
