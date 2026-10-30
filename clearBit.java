import java.util.Scanner;

public class clearBit {

    public static int clear(int n, int i) {
        int bitmask = ~(1 << i);
        return n & bitmask;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your number:");
        int num = sc.nextInt();
        System.out.print("enter the key:");
        int key = sc.nextInt();
       System.out.print(clear(num,key));
    }
}

