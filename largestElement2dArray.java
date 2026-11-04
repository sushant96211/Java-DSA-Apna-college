
import java.util.Scanner;

public class largestElement2dArray {

    public static int largest(int arr[][]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                max = Math.max(max, arr[i][j]);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Row:");
        int n = sc.nextInt();
        System.out.print("Enter the size of column:");
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("largest element in array:" + largest(arr));
    }
}
