import java.util.Scanner;

public class clearRange {
    public static int clear(int n,int i,int j){
        int a = (~(0)<<(j+1));
        int b = (1<<i) - 1;
        int bit = a | b;
        return n & bit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your number:");
        int num = sc.nextInt();
        System.out.print("enter the key:");
        int key = sc.nextInt();
        System.out.print("enter the key:");
        int key2 = sc.nextInt();
        System.out.print(clear(num,key,key2));
    }
}