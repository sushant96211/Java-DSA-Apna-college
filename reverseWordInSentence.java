
import java.util.Scanner;

public class reverseWordInSentence {

    public static void rev(StringBuilder str, int i, int j) {
        while (i <= j) {
            char temp = str.charAt(i);
            str.setCharAt(i, str.charAt(j));
            str.setCharAt(j, temp);
            i++;
            j--;
        }
    }

    public static void uo(String str) {
        StringBuilder sb = new StringBuilder(str);
        int n = sb.length();
        int i = 0, j = 0;
        while (j < n) {
            if (sb.charAt(j) != ' ') {
                j++;
            } else {
                rev(sb, i, j - 1);
                i = j + 1;
                j = i;
            }
        }
        rev(sb, i, j - 1);
        System.out.println("update String:" + sb);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your string:");
        String str = sc.nextLine();
        uo(str);
    }
}
