import java.util.Scanner;

public class setBit {

    public static int set(int n, int i) {
        int bit = 1 << i;
        return n | bit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your no:");
        int n = sc.nextInt();
        System.out.print("enter your key:");
        int key = sc.nextInt();
        System.out.println(set(n, key));
    }
}
