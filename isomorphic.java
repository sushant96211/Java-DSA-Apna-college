
import java.util.Scanner;

public class isomorphic {

    public static boolean check(String str1, String str2) {
        int arr[] = new int[128];
        for (int i = 0; i < str2.length(); i++) {
            char ch = str1.charAt(i);
            char dh = str2.charAt(i);
            int n = (int) ch;
            if (arr[n] == '\0') {
                arr[n] = dh;

            } else {
                if (arr[n] != dh) {
                    return false;
                }
            }

        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = '\0';
        }
        for (int i = 0; i < str2.length(); i++) {
            char ch = str1.charAt(i);
            char dh = str2.charAt(i);
            int n = (int) dh;
            if (arr[n] == '\0') {
                arr[n] = ch;

            } else {
                if (arr[n] != ch) {
                    return false;
                }
            }

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your first string:");
        String str1 = sc.nextLine();
        System.out.print("enter your second string:");
        String str2 = sc.nextLine();
        System.out.println(check(str1, str2));
        check(str1, str2);
    }
}
