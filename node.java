
import java.util.Scanner;

public class node {

    node head;
    node tail;
    int size = 0;
    int val;
    node next;

    node(int val) {
        this.val = val;
    }

    void insertAtEnd(int val) {
        node temp = new node(val);
        if (head == null) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    public static int print() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the a value : ");
        int n = sc.nextInt();
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of linklist:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            node xi = new node(1);
            xi.insertAtEnd(print());
        }
    }
}
