
import java.util.Scanner;

public class nextGretest {

    public static void great(int arr[]) {
        int n = arr.length;
        int ans[] = new int[n];
        int nge = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            ans[i] = nge;
            nge = Math.max(nge, arr[i]);
        }
        for (int ele : ans) {
            System.out.print(ele + " ");
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
        System.out.print("res array:");
        great(marks);
    }

}
