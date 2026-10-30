import java.util.Scanner;

public class getbit {

    public static int get(int n, int i) {
        int bit = 1 << i;
        if ((n & bit) == 0) {
            return 0;
        }
        return 1;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your number:");
        int num = sc.nextInt();
        System.out.print("enter the key:");
        int key = sc.nextInt();
       System.out.print(get(num,key));
    }
}
