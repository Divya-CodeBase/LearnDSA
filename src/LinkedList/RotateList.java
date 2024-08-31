package LinkedList;

public class RotateList {
    public static void main(String args[]) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next.next.next = new ListNode(8);



        // System.out.println(reverseList(head));
        System.out.println(rotateLeft(head,2));

    }

    public static ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null||k==0)return head;

        ListNode temp= head;
        ListNode tail= temp;int size=0;

        while(temp!= null){
            if(temp.next==null){
                tail= temp;
            }
            size++;
            temp= temp.next;
        }
        temp= head;
        k = k%size;
        if(k==0){
            return head;
        }
        for(int i=0;i<size-k-1;i++){
            temp= temp.next;
        }
        ListNode result= temp.next;
        temp.next= null;
        tail.next= head;
        return result;


    }
    public static ListNode rotateLeft(ListNode head, int k) {
        if(head==null||head.next==null||k==0)return head;

        ListNode temp= head;
        ListNode tail= temp;int size=0;

        while(temp!= null){
            if(temp.next==null){
                tail= temp;
            }
            size++;
            temp= temp.next;
        }
        temp= head;
        k = k%size;
        if(k==0){
            return head;
        }

       while(k!=0){
           head= head.next;
           temp.next= null;
           tail.next= temp;
           tail= temp;
           temp=head;
           k--;

       }
        return head;


    }
}
