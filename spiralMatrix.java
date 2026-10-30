
import java.util.Scanner;

public class spiralMatrix {

    public static void spiral(int arr[][]) {
        int r = 0;
        int c = 0;
        int rd = arr.length - 1;
        int cd = arr[0].length - 1;
        while (r <= rd && c <= cd) {
            for (int i = c; i <= cd; i++) {
                System.out.print(arr[r][i] + " ");
            }
            for (int j = r + 1; j <= rd; j++) {
                System.out.print(arr[j][cd] + " ");
            }
            for (int i = cd - 1; i >= c; i--) {
                if (r == rd) {
                    break;
                }
                System.out.print(arr[rd][i] + " ");
                if (c == cd) {
                    break;
                }
            }
            for (int j = rd - 1; j >= r + 1; j--) {
                System.out.print(arr[j][c] + " ");
            }
            r++;
            c++;
            rd--;
            cd--;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("file no:19");
        System.out.print("Enter the size of your row:");
        int m = sc.nextInt();
        System.out.print("Enter the size of your columns:");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        System.out.println("Enter the element of array:");
        for (int j = 0; j < m; j++) {
            for (int k = 0; k < n; k++) {
                arr[j][k] = sc.nextInt();
            }
        }
        System.out.print("Array:");
        for (int j = 0; j < m; j++) {
            if (j > 0) {
                System.out.print("      ");
            }
            for (int k = 0; k < n; k++) {
                System.out.print(arr[j][k] + " ");
            }
            System.out.println();
        }
        System.out.print("spiral:{");
        spiral(arr);
        System.out.print("}");
    }
}
