
import java.util.Scanner;

public class setMatrix {

    public static void set(int arr[][]) {
        int m = arr.length;
        int n = arr[0].length;
        boolean row[] = new boolean[m];
        boolean col[] = new boolean[n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (row[i] == true) {
                for (int j = 0; j < arr[0].length; j++) {
                    arr[i][j] = 0;
                }
            }

        }
        for (int j = 0; j < arr[0].length; j++) {
            if (col[j] == true) {
                for (int i = 0; i < arr.length; i++) {
                    arr[i][j] = 0;
                }
            }

        }
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
        set(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
