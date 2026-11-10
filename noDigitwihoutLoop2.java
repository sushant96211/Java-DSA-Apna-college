
import java.util.Scanner;

public class noDigitwihoutLoop2 {

    public static void count(int num) {
        String str = "";
        str += num;
        System.out.print("the no digit in number:" + str.length());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your number:");
        int num = sc.nextInt();
        System.out.print("sunstring :");
        count(num);
    }
}
