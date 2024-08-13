package Grind75;

public class MaximumTwinSumofaLinkedList {
    public static void main(String args[]) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(8))));
        //deleteMiddle(head);
        pairSum(head);
    }

    public static int pairSum(ListNode head) {
        int res = Integer.MIN_VALUE;
        ListNode slow= head;
        ListNode fast= head;
        ListNode pre= null;ListNode temp= null;

        while(fast!= null&& fast.next!= null){
            fast = fast.next.next;
            temp = slow.next;
            slow.next= pre;
            pre= slow;
            slow= temp;

        }
        while(slow!= null){
            res= Math.max(res,  pre.val+slow.val);
            pre= pre.next;
            slow= slow.next;
        }


        return res;

    }
}
