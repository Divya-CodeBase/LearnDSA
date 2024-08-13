package Grind75;

public class DeleteMiddleNodeofLinkedList {
    public static void main(String args[]) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        //deleteMiddle(head);
        deleteMiddle_Pointer(head);
    }

    public static ListNode deleteMiddle(ListNode head) {
        ListNode temp = head;
        int count =0;
        while(temp!=null){
            count++;
            temp= temp.next;
        }
        int mid= count/2;

        temp=head;
        for(int i=0;i<mid-1;i++){
            temp=temp.next;
        }

        temp.next= temp.next.next;
        return head;
    }

    public static ListNode deleteMiddle_Pointer(ListNode head) {
       if(head== null||head.next== null){
           return null;
       }
       ListNode slow= head;
       ListNode fast = head;
       ListNode prev= slow;

       while(fast!= null && fast.next!= null){
           prev= slow;
           slow= slow.next;
           fast= fast.next.next;
       }
       prev.next= slow.next;
       return head;
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

