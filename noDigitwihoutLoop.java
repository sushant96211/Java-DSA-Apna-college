
import java.util.Scanner;

public class noDigitwihoutLoop {

    public static void count(int num) {
        String str = "";
        str = Integer.toString(num);
        System.out.println("total no of digit:" + str.length());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your number:");
        int num = sc.nextInt();
        System.out.print("sunstring :");
        count(num);
    }
}
