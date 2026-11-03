
import java.util.Scanner;

public class mergeTwosortArray {

    public static void merge(int[] nums1, int[] nums2) {
        int i = nums1.length - 1;
        int j = nums2.length - 1;
        int arr[] = new int[i + j + 2];
        int k = arr.length - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] >= nums2[j]) {
                arr[k] = nums1[i];
                k--;
                i--;
            } else {
                arr[k] = nums2[j];
                k--;
                j--;
            }
        }
        while (j >= 0) {
            arr[k] = nums2[j];
            j--;
            k--;
        }
        while (i >= 0) {
            arr[k] = nums1[i];
            i--;
            k--;
        }
        System.out.print(" Merge Array:{");
        for (int a = 0; a < arr.length; a++) {
            if (a > 0 && a < arr.length) {
                System.out.print(",");
            }

            System.out.print(arr[a]);
        }
        System.out.println("}");
        System.out.println("End of code......!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your size of 1 sorted array:");
        int n = sc.nextInt();
        int[] marks = new int[n];
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }
        System.out.print("Enter your size of 2 sorted array:");
        int n2 = sc.nextInt();
        int[] mark = new int[n2];
        for (int i = 0; i < mark.length; i++) {
            mark[i] = sc.nextInt();
        }
        merge(marks, mark);
    }
}
