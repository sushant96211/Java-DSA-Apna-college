
import java.util.Scanner;

public class power2bit {
    public static boolean check(int n){
        return (n & (n - 1)) == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your no:");
        int a = sc.nextInt();
        System.out.println(check(a));
    }
}
