
import java.util.Scanner;

public class selectionsort {

    public static void sort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int mn = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[mn] > arr[j]) {
                    mn = j;
                }
            }
            int temp = arr[mn];
            arr[mn] = arr[i];
            arr[i] = temp;
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
        sort(marks);
        System.out.print("Array:{");
        for (int i = 0; i < marks.length; i++) {
            if (i > 0 && i < n) {
                System.out.print(",");
            }

            System.out.print(marks[i]);
        }
        System.out.println("}");
        System.out.println("End of code......!");
    }
}
