
import java.util.Scanner;

public class peakmountain {

    public static int check(int arr[]) {
        int n = arr.length;
        int lo = 1, hi = n - 2;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1]) {
                lo = mid + 1;
            } else if (arr[mid] < arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                hi = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lenth of  sorted array:");
        int n = sc.nextInt();
        int mark[] = new int[n];
        for (int i = 0; i < mark.length; i++) {
            mark[i] = sc.nextInt();
        }
        System.out.println("the peak element is :" + check(mark));
    }

}
