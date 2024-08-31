package LinkedList;

public class PalindromeLinkedList {
    public static void main(String args[]) {
        ListNode head = new ListNode(1, new ListNode(0, new ListNode(1)));
        //System.out.println(isPalindrome(head));
        System.out.println(isPalindrome_Recursion(head));
    }



    public static boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode pre = null;
        while (slow != null) {
            ListNode temp = slow.next;
            slow.next = pre;
            pre = slow;
            slow = temp;
        }
        while (pre != null) {
            if (head.val != pre.val) return false;
            head = head.next;
            pre = pre.next;
        }
        return true;
    }
    static ListNode curr;
    public static boolean isPalindrome_Recursion(ListNode head) {
        curr = head;
        return isPalindrome_Recur(head);
    }

    public static boolean isPalindrome_Recur(ListNode head) {
        if(head==null)return true;

        boolean ans= isPalindrome_Recur(head.next)&& curr.val==head.val;
        curr= curr.next;
        return ans;
    }
}
