import java.util.*;
public class naturalNo {
    public static void print(int n){
        if (n==1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your no:");
        int n = sc.nextInt();
        print(n);
    }
    
}
