
import java.util.Scanner;

public class decTobin {
    public static void dec(int n){
        int a = n;
        int bin = 0;
        int pow = 0;
        while (n > 0) {
            int rem = n % 2;
            bin += rem * Math.pow(10, pow);
            pow++;
            n = n / 2;
        }
        System.out.println("Binary of "+a+" :"+bin);
        System.out.println("End of code....!");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no:");
        int a = sc.nextInt();
        dec(a);
    }
}
