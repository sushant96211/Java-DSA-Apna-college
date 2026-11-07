
import java.util.Scanner;

public class multiplicationMatrix {

    public static void mul(int arr[][], int arr1[][]) {
        int arr2[][] = new int[arr.length][arr1[0].length];
        if (arr[0].length != arr1.length) {
            System.out.println("multiplication not be possible");
            return;
        } else {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr1[0].length; j++) {
                    for (int j2 = 0; j2 < arr1.length; j2++) {
                        arr2[i][j] += arr[i][j2] * arr1[j2][j];
                    }

                }

            }

        }
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();

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
        System.out.print("Enter the size of Row2:");
        int a = sc.nextInt();
        System.out.print("Enter the size of column2:");
        int b = sc.nextInt();
        System.out.println("enter the element of 2 matrix");
        int arr2[][] = new int[a][b];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println("ans:");
        mul(arr, arr2);
    }
}
