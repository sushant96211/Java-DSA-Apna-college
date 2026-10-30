
import java.util.Scanner;

public class stringLargest {

    public static String large(String str[]) {
        String lg = str[0];
        for (int i = 1; i < str.length; i++) {
            if (str[i].compareTo(lg) > 0) {
                lg = str[i];
            }
        }
        return lg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your size of array:");
        int n = sc.nextInt();
        String[] marks = new String[n];
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.next();
        }
        System.out.print("Array:{");
        for (int i = 0; i < marks.length; i++) {
            if (i > 0 && i < n) {
                System.out.print(",");
            }
            System.out.print(marks[i]);
        }
        System.out.println("}");
        System.out.print("The largest string:" + large(marks));
        System.out.println();
        System.out.println("End of code......!");

    }
}
