
import java.util.*;

public class firstandLastpos {

    public static int[] check(int arr[], int target) {
        int n = arr.length;
        int fp = -1, lo = 0, hi = n - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] == target) {
                if (mid > 0 && arr[mid - 1] == arr[mid]) {
                    hi = mid - 1;
                } else {
                    fp = mid;
                    break;
                }
            } else if (target < arr[mid]) {
                hi = mid - 1;
            } else if (target > arr[mid]) {
                lo = mid + 1;
            }
        }

        int lp = -1;
        lo = 0;
        hi = n - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] == target) {
                if (mid + 1 < n && arr[mid + 1] == arr[mid]) {
                    lo = mid + 1;
                } else {
                    lp = mid;
                    break;
                }
            } else if (target < arr[mid]) {
                hi = mid - 1;
            } else if (target > arr[mid]) {
                lo = mid + 1;
            }
        }
        int ans[] = new int[2];
        ans[0] = fp;
        ans[1] = lp;
        return ans;
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
        System.out.println("first and last position of target element:" + Arrays.toString(check(mark, tar)));
    }

}
