
import java.util.Scanner;

public class evenOddBit {
    public static void chech(int n){
        int bit = 1;
        if ((bit & n) == 0) {
            System.out.println("no is even");
        } else {
            System.out.println("no is odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your number:");
        int num = sc.nextInt();
        chech(num);
    }
    
}
