
import java.util.*;

public class Node1 {

    int val;
    Node1 next;

    public static void take(Node1 s) {
        System.out.print("Enter the value:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        s.val = n;
    }

    public static void display(Node1 t) {
        Node1 temp = t;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no node:");
        int n = sc.nextInt();
        Node1 temp1 = new Node1();
        Node1 temp = temp1;
        for (int i = 1; i <= n; i++) {
            Node1 xi = new Node1();
            take(xi);
            temp.next = xi;
            temp = temp.next;
        }
        temp = temp1.next;
        display(temp);
    }
}
