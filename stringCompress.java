
import java.util.Scanner;

public class stringCompress {

    public static void com(String str) {
        char arr[] = str.toCharArray();
        String s = "";
        int i = 0, j = 0;
        while (j < arr.length) {
            if (arr[i] == arr[j]) {
                j++;
            } else {
                s += arr[i];
                int l = j - i;
                if (l > 1) {
                    s += l;
                }
                i = j;
            }
        }
        s += arr[i];
        int l = j - i;
        if (l > 1) {
            s += l;
        }
        System.out.println("update String:" + s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your String:");
        String str = sc.nextLine();
        com(str);
    }
}
