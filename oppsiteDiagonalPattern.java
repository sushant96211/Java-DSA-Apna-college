
import java.util.Scanner;

public class oppsiteDiagonalPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value n:");
        int n = sc.nextInt();
        for (int j = n; j > 0; j--) {
            int i = 0;
            while (i <= j) {
                System.out.print(" ");
                i++;
            }
            System.out.println("*");
        }
    }
}
