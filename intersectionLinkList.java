
import java.util.Scanner;

public class intersectionLinkList {

    public static class ListNode {

        int val;
        ListNode next;
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        int lenA = 0;
        while (tempA != null) {
            tempA = tempA.next;
            lenA++;
        }
        ListNode tempB = headB;
        int lenB = 0;
        while (tempB != null) {
            tempB = tempB.next;
            lenB++;
        }
        tempA = headA;
        tempB = headB;
        if (lenA > lenB) {
            for (int i = 1; i <= lenA - lenB; i++) {
                tempA = tempA.next;
            }
        } else {
            for (int i = 1; i <= lenB - lenA; i++) {
                tempB = tempB.next;
            }
        }
        while (tempA != tempB) {
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return tempA;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListNode dump = new ListNode();
        ListNode temp = dump;
        System.out.print("Enter the lenth of LinkList1:");
        int n = sc.nextInt();
        int i = 0;
        System.out.println("Enter the value:");
        while (i < n) {
            ListNode temp1 = new ListNode();
            int a = sc.nextInt();
            temp1.val = a;
            temp.next = temp1;
            temp = temp.next;
            i++;
        }

        ListNode dump2 = new ListNode();
        ListNode temp2 = dump2;
        System.out.print("Enter the lenth of LinkList1:");
        int n1 = sc.nextInt();
        int j = 0;
        System.out.println("Enter the value:");
        while (j < n1) {
            ListNode temp1 = new ListNode();
            int a = sc.nextInt();
            temp1.val = a;
            temp2.next = temp1;
            temp2 = temp2.next;
            j++;
        }
        ListNode s = getIntersectionNode(dump.next, dump2.next);
        if (s != null) {
            System.out.println("Intersection val: " + s.val);
        } else {
            System.out.println("No intersection found");
        }
    }
}
