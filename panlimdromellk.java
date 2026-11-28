
public class panlimdromellk {

    public class ListNode {

        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

    }

    public ListNode rev(ListNode head) {
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

    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode j = rev(slow);
        ListNode i = head;
        while (j != null) {
            if (i.val != j.val) {
                return false;
            }
            i = i.next;
            j = j.next;
        }
        return true;
    }
}
{
    
}
