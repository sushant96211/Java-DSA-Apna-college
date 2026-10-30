
import java.util.Scanner;

public class fibonaci {

    public static int term(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fn = term(n - 1) + term(n - 2);
        return fn;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your no:");
        int a = sc.nextInt();
        System.out.println("ans:" + term(a));
    }

}
