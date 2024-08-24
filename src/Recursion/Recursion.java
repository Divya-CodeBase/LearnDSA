package Recursion;


public class Recursion {
    public static void main(String args[]) {
       ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        System.out.println(swapPairs(list1));
    }

    public static ListNode swapPairs(ListNode head) {
        if ((head == null)||(head.next == null))
            return head;
        ListNode n = head.next;
        head.next = swapPairs(head.next.next);
        n.next = head;
        return n;



    }
}
