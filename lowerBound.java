
import java.util.Scanner;

public class lowerBound {

    public static void check(int arr[], int target) {
        int n = arr.length;
        int lo = 0;
        int hi = n - 1;
        int lb = n;
        while (lo <= hi) {
            int mid = (lo + (hi - lo) / 2);
            if (arr[mid] >= target) {
                lb = Math.min(mid, lb);
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        System.out.println("index of lower of " + target + ":" + lb);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lenth of  sorted array:");
        int n = sc.nextInt();
        int mark[] = new int[n];
        for (int i = 0; i < mark.length; i++) {
            mark[i] = sc.nextInt();
        }
        System.out.print("enter your target:");
        int tar = sc.nextInt();
        check(mark, tar);
    }

}
