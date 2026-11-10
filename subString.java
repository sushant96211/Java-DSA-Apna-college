
import java.util.Scanner;

public class subString {

    public static void pr(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                System.out.print(str.substring(i, j) + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your string:");
        String str = sc.nextLine();
        System.out.print("sunstring :");
        pr(str);
    }

}
