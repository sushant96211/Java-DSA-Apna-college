
import java.util.Scanner;

public class reverse_Array {

    public static void rev(int arr[]) {
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your size of array:");
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
        rev(marks);
        System.out.print(" Reverse Array:{");
        for (int i = 0; i < marks.length; i++) {
            if (i > 0 && i < n) {
                System.out.print(",");
            }
            System.out.print(marks[i]);
        }
        System.out.println("}");
    }
}
