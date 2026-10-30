
import java.util.Scanner;

public class linearSearch {
    public static int search(int arr[],int key){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
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
        System.out.print("Enter your key:");
        int a = sc.nextInt();
        System.out.println("index of key:"+search(mark, a));
        System.out.println("End of code....!");
    }
}
