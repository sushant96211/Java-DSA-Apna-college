import java.util.Scanner;

public class sortArray {
    public static boolean check(int arr[],int i){
        if (i==arr.length - 1) {
            return true;
        }
        if(arr[i]>+arr[i+1]){
            return false;
        }
        return check(arr, i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter your size of sorted array:");
		int n = sc.nextInt();
        System.out.println("enter your element:");
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
        System.out.println(check(marks, 0));
    }
}
