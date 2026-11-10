
import java.util.Scanner;

public class mostOccurence {

    public static void most(String str) {
        int freq[] = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int n = (int) ch - 97;
            freq[n]++;
        }
        int maxfreq = -1;
        for (int i = 0; i < freq.length; i++) {
            maxfreq = Math.max(maxfreq, freq[i]);
        }
        for (int i = 0; i < freq.length; i++) {
            if (maxfreq == freq[i]) {
                System.out.print((char) (i + 97));
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your string:");
        String str = sc.nextLine();
        System.out.print("the most occurrence word in a string : ");
        most(str);
    }
}
