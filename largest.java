import java.util.Scanner;

public class largest {
    public static int get(int arr[]){
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lenth of array:");
        int n = sc.nextInt();
        int mark[] = new int[n];
        for (int i = 0; i < mark.length; i++) {
            mark[i] = sc.nextInt();
        }
        System.out.print("Array:{");
        for (int i = 0; i < mark.length; i++) {
            if (i > 0 && i < mark.length ) {
                System.out.print(",");  
            }
            System.out.print(mark[i]);
        }
        System.out.println("}");
        System.out.println("largest value is:"+get(mark));
        System.out.println("End of code....!");
    }
}
