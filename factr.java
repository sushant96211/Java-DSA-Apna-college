
import java.util.*;

public class factr {

    public static int fac(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fac = n * fac(n - 1);
        return fac;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your no:");
        int a = sc.nextInt();
        System.out.println("ans:" + fac(a));
    }

}
