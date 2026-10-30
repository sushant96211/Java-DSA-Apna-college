
import java.util.Scanner;

public class palindrome {

    public static boolean check(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 -i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word:");
        String name = sc.nextLine();
        System.out.println(check(name));

    }
}
