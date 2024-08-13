package Grind75;

public class ReverseLinkedList {
    public static void main(String args[]) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        //deleteMiddle(head);
        reverseList(head);
    }

    public static ListNode reverseList(ListNode head) {

        ListNode front = null;
        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {
            front = curr.next;
            curr.next = prev;
            prev = curr;
            curr = front;
        }
        head = prev;
        return head;


    }
}
