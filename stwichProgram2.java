
import java.util.Scanner;

public class stwichProgram2 {

    static void pr(String str1, String str2, char n) {

        int a = str1.length();
        int b = str2.length();

        String c = str1 + str2;

        int y = str1.compareTo(str2);

        Scanner sc = new Scanner(System.in);

        switch (n) {

            case '0':
                System.out.println("exit");
                break;

            case '1':
                System.out.println("the length of string: " + a + " and " + b);
                break;

            case '2':
                System.out.println(c);
                break;

            case '3':
                if (y == 0) {
                    System.out.println("same");
                } else {
                    System.out.println("not same");
                }
                break;

            case '4':
                int m;
                char ch;

                System.out.print("choose string: ");
                m = sc.nextInt();

                System.out.print("choose char: ");
                ch = sc.next().charAt(0);

                if (m == 1) {
                    System.out.println(str1.indexOf(ch));
                } else {
                    System.out.println(str2.indexOf(ch));
                }
                break;

            default:
                System.out.println("Invalid choice");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter your first string: ");
        String str1 = sc.nextLine();

        System.out.print("enter your second string: ");
        String str2 = sc.nextLine();

        System.out.print("enter the value of n: ");
        char n = sc.next().charAt(0);

        pr(str1, str2, n);

        sc.close();
    }
}
