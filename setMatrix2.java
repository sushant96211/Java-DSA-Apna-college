
import java.util.Scanner;

public class setMatrix2 {

    public static void set(int arr[][]) {
        int m = arr.length;
        int n = arr[0].length;
        boolean zerorow = false;
        boolean zerocol = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0] == 0) {
                zerocol = true;
                break;
            }
        }
        for (int j = 0; j < arr[0].length; j++) {
            if (arr[0][j] == 0) {
                zerorow = true;
                break;
            }
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[0].length; j++) {
                if (arr[i][j] == 0) {
                    arr[0][j] = 0;
                    arr[i][0] = 0;
                }
            }
        }
        for (int j = 1; j < arr[0].length; j++) {
            if (arr[0][j] == 0) {
                for (int i = 1; i < arr.length; i++) {
                    arr[i][j] = 0;
                }
            }
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i][0] == 0) {
                for (int j = 1; j < arr[0].length; j++) {
                    arr[i][j] = 0;
                }
            }
        }
        if (zerorow == true) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[0][j] = 0;
            }
        }
        if (zerocol == true) {
            for (int i = 0; i < arr.length; i++) {
                arr[i][0] = 0;
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
