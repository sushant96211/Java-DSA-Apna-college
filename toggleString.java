
import java.util.*;

public class toggleString {

    public static void up(String str) {
        StringBuilder sb = new StringBuilder(str);
        int n = sb.length();
        for (int i = 0; i < n; i++) {
            char ch = sb.charAt(i);
            int a = (int) ch;
            if (a >= 65 && a <= 90) {
                a += 32;
                ch = (char) a;
                sb.setCharAt(i, ch);
            } else {
                if (a >= 97 && a <= 122) {
                    a -= 32;
                    ch = (char) a;
                    sb.setCharAt(i, ch);
                }

            }
        }
        System.out.print("update string:" + sb);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your string:");
        String str = sc.nextLine();
        up(str);
    }
}
