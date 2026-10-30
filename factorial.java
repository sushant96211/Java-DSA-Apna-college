
import java.util.Scanner;

public class factorial {
    public static int fac(int n){
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your no:");
        int a = sc.nextInt();
        System.out.println("factorial of "+a+":"+fac(a));
        
    }
    
}
