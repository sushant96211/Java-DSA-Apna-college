
import java.util.Scanner;

public class upadateString {

    public static void update(String str, char ch) {
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                s += ch;
            } else {
                s += str.charAt(i);
            }

        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your string:");
        String str = sc.nextLine();
        System.out.print("enter charater:");
        char ch = sc.next().charAt(0);
        System.out.print("upadeted string :");
        update(str, ch);
    }
}
