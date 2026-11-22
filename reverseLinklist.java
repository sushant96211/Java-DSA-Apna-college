
import java.util.Scanner;

public class reverseLinklist {

    static Scanner sc = new Scanner(System.in);

    static class Node {

        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static void take(Node s) {
        System.out.print("Enter the value: ");
        int n = sc.nextInt();
        s.val = n;
    }

    public static void display(Node t) {
        Node temp = t;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    public static Node out() {
        System.out.print("Enter the no of nodes: ");
        int n = sc.nextInt();

        Node temp1 = new Node(0);
        Node temp = temp1;

        for (int i = 1; i <= n; i++) {
            Node xi = new Node(0);
            take(xi);

            temp.next = xi;
            temp = temp.next;
        }

        return temp1.next;
    }

    public static Node rev(Node head) {
        Node curr = head;
        Node prev = null;
        Node Next = null;

        while (curr != null) {
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }

        return prev;
    }

    public static void main(String[] args) {
        Node x = out();
        Node y = rev(x);

        display(y);
    }
}
