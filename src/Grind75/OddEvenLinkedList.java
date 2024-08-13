package Grind75;


public class OddEvenLinkedList {
    public static void main(String args[]) {
       // ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode head = new ListNode(1);
        //deleteMiddle(head);
        oddEvenList(head);
    }

    public static ListNode oddEvenList(ListNode head) {
        if(head== null){
            return null;
        }
        ListNode odd = head;
        ListNode even = head.next;

        ListNode evenHead = even;
        while (even != null && even.next != null) {

            odd.next = odd.next.next;
            odd = odd.next;

            even.next = even.next.next;
            even = even.next;

        }

        odd.next = evenHead;

        return head;
    }
}