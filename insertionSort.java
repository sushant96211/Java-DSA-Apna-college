import java.util.Scanner;

public class insertionSort {

    public static void sort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while ( prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
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
