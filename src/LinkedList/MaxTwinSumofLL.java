package LinkedList;

public class MaxTwinSumofLL {
    public static void main(String args[]) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(11);
        head.next.next.next.next.next.next.next = new ListNode(8);

        System.out.println(pairSum(head));
    }

    public static int pairSum(ListNode head) {

        if(head==null)return 0;

        ListNode fast= head;
        ListNode slow= head;
        ListNode pre= null;
        ListNode temp= null;

        while(fast!= null&& fast.next!= null){
            fast= fast.next.next;
            temp=slow.next;
            slow.next= pre;
            pre= slow;
            slow= temp;
        }
        int res=0;
        while(slow!= null){
            res= Math.max(res,pre.val+slow.val);
            pre= pre.next;
            slow=slow.next;
        }
        return res;


    }
}
