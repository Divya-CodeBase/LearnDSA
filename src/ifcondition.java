import java.util.Scanner;

public class ifcondition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        if (k == 0) {
            System.out.println("hello");
        } else if (k == 1) {

            System.out.println("divya");
            if (10 < 12) {
                System.out.println("madhavan");
            }
        } else {
            System.out.println("out");
        }
    }
}
