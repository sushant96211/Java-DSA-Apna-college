
import java.util.Scanner;

public class sort_012 {

    public static void sort(int arr[]) {
        int low = 0, mid = 0, hi = arr.length - 1;
        while (mid <= hi) {
            if (arr[mid] == 0) {
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                int temp = arr[mid];
                arr[mid] = arr[hi];
                arr[hi] = temp;
                hi--;
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your size of array:");
        int n = sc.nextInt();
        int[] marks = new int[n];
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }
        System.out.print("Array:{");
        for (int i = 0; i < marks.length; i++) {
            if (i > 0 && i < n) {
                System.out.print(",");
            }
            System.out.print(marks[i]);
        }
        System.out.println("}");
        sort(marks);
        System.out.print("sorted Array:{");
        for (int i = 0; i < marks.length; i++) {
            if (i > 0 && i < n) {
                System.out.print(",");
            }
            System.out.print(marks[i]);
        }
        System.out.println("}");
    }

}
