
import java.util.*;

public class selectionSort2 {

    public static void sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = Integer.MAX_VALUE;
            int mini = -1;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    mini = j;
                }

            }
            int temp = arr[i];
            arr[i] = arr[mini];
            arr[mini] = temp;
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
        sort(marks);
        for (Object ele : marks) {
            System.out.print(ele + " ");
        }
    }
}
