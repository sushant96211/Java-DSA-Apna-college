import java.util.*;
public class countBit {

    public static int cu(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no:");
        int n = sc.nextInt();
        System.out.print("the no of bit:"+cu(n));

    }

}
