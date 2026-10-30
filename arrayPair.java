import java.util.Scanner;

public class arrayPair {
    public static void pair(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("("+curr+arr[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter your size of sorted array:");
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
        pair(marks);
    }
}
