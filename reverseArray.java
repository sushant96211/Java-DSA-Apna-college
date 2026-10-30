import java.util.Scanner;

public class reverseArray {
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
		System.out.print("Array:{");
		for (int i = marks.length -1; i >= 0; i--) {
			if (i < marks.length - 1 && i >= 0) {
				System.out.print(",");
			}
			System.out.print(marks[i]);
		}
		System.out.println("}");
		System.out.println("End of code......!");
    }
}
