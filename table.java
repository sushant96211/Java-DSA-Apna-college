
import java.util.Scanner;

public class table {

    public static void main(String[] args) {
        System.out.print("ente the value of n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(n + "x" + i + "=" + n * i);

        }
    }

}
