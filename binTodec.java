
import java.util.Scanner;

public class binTodec {
    public static int bin(int n){
        int dec = 0;
        int pow = 0;
        while (n>0) {
            int lastDigit = n % 10;
            dec += lastDigit * Math.pow(2,pow);
            pow++;
            n = n / 10;
        }
        return dec;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the your binary no:");
        int a = sc.nextInt();
        System.out.println("decimal of " +a+":"+bin(a));
        System.out.println("End of code....!");
    }
}
