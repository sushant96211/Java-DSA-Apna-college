import java.util.Scanner;

public class nCr{
    public static int fac(int n){
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }
    public static int bin(int n,int r){
        int a = fac(n);
        int b = fac(r);
        int c = fac(n - r);
        return a/(b*c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your no n:");
        int a = sc.nextInt();
          System.out.print("Enter your no r:");
          int b = sc.nextInt();
        System.out.println("Ans:"+bin(a, b));
        System.out.println("End of code....!");
    }
    
}