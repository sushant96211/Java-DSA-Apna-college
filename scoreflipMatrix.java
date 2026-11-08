
import java.util.Scanner;

public class scoreflipMatrix {

    public static void flip(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0] == 0) {
                for (int j = 0; j < arr[0].length; j++) {
                    if (arr[i][j] == 0) {
                        arr[i][j] = 1;
                    } else {
                        arr[i][j] = 0;
                    }
                }
            }
        }
        for (int j = 1; j < arr[0].length; j++) {
            int zero = 0;
            int one = 0;
            for (int k = 0; k < arr.length; k++) {
                if (arr[k][j] == 0) {
                    zero++;
                } else {
                    one++;
                }
            }
            if (one < zero) {
                for (int k2 = 0; k2 < arr.length; k2++) {
                    if (arr[k2][j] == 0) {
                        arr[k2][j] = 1;
                    } else {
                        arr[k2][j] = 0;
                    }
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
        flip(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
