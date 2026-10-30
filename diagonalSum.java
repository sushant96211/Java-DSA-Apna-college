//TO PRINT SUM OF DIGONAL
import java.util.*;

public class diagonalSum {
	
	public static int sum(int[][] matrix) {
		int sum = 0;
		for (int i = 0; i < matrix.length; i++) {
			sum += matrix[i][i];
			if (i != matrix.length - 1 - i) {
				sum += matrix[i][matrix.length - 1 - i];
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("file no:20");
		System.out.print("Enter the size of your square matrix:");
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		System.out.println("Enter the element of array:");
		for (int j = 0; j < n; j++) {
			for (int k = 0; k < n; k++) {
				arr[j][k] = sc.nextInt();
			}
		}
		System.out.print("Array:");
		for (int j = 0; j < n; j++) {
			if (j > 0) {
				System.out.print("      ");
			}
			for (int k = 0; k < n; k++) {
				System.out.print(arr[j][k] + " ");
			}
			System.out.println();
		}
		System.out.print("dignoal sum of matrix:" + sum(arr));
	}
}