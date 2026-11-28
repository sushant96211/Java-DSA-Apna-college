
public class reverseList {

    public class ListNode {

        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode Next = head;
        while (curr != null) {
            Next = Next.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }
        return prev;
    }
}
