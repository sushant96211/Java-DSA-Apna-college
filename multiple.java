
import java.util.Scanner;

public class multiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do { 
            System.out.print("Enter your no:");
            int a = sc.nextInt();
            if (a%10==0) {
                break;
            }
            System.out.println("you enter no:"+a);
        } while (true);
        System.out.println("End of code.....!");
    }
    
}
