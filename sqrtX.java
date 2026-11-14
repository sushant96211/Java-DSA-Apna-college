
import java.util.Scanner;

public class sqrtX {

    public static int ans(int x) {
        int arr[] = new int[x];
        int n = arr.length;
        int lo = 0, hi = n - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (mid == x / mid) {
                return mid;
            } else if (mid > x / mid) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your number:");
        int n = sc.nextInt();
        System.out.println("sqrt of " + n + " : " + ans(n));
    }

}
