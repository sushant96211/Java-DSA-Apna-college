
import java.util.*;

public class validAnagram {

    public static boolean check(String str1, String str2) {
        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();
        if (str1.length() != str2.length()) {
            return false;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i = 0; i < arr2.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
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
    }
}
