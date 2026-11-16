
import java.util.Scanner;

public class switchProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        char m;

        System.out.print("ENTER SIZE OF DATA: ");
        n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter data:");
        for (int j = 0; j < n; j++) {
            arr[j] = sc.nextInt();
        }

        System.out.print("ENTER choice: ");
        m = sc.next().charAt(0);

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        switch (m) {
            case '3':
                System.out.println("exit");
                break;

            case '0':
                System.out.println("the length of string: " + n);
                break;

            case '2':
                System.out.println("smallest no: " + min);
                break;

            case '1':
                System.out.println("largest no: " + max);
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}
