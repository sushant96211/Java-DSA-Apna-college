
import java.util.Scanner;

public class naturalReverse {

    public static int print(int n) {
        if (n == 1) {
            System.out.println(1);
            return 1;
        }

        System.out.println(n);
        print(n - 1);
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of n:");
        int n = sc.nextInt();
        print(n);
    }

}
