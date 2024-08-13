package LinkedList;

public class DesignDoublyLinkedList {

    private static class Node{
        int val;
        Node next,prev;
        public Node(int val){
            this.val = val;
        }
    }

    Node head = null;
    Node tail = null;
    int current_size = 0;

    public DesignDoublyLinkedList() {
        head = null;
    }

    public int get(int index) {
        if(index < 0 || index >= current_size)
            return -1;

        Node temp = head;
        for(int i=0; i<index&&temp!= null; i++){
            temp = temp.next;
        }
        return temp.val;
    }

    private Node getNodeAtIndex(int index) {
        if(index < 0 || index >= current_size)
            return null;

        Node temp = head;
        for(int i=0; i<index; i++){
            temp = temp.next;
        }
        return temp;
    }

    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        if (head != null) {
            head.prev = newNode;
        }
        if(current_size == 0)
            tail = head;
        current_size++;
    }

    public void addAtTail(int val) {
        if(current_size == 0)
            addAtHead(val);
        else {
            Node newNode= new Node(val);
            tail.next = newNode;
            newNode.prev= tail;
            tail = tail.next;
            current_size++;
        }
    }

    public void addAtIndex(int index, int val) {
        if (index == 0) {
            addAtHead(val);
            return;
        }
        Node prev = getNodeAtIndex(index - 1);
        if (prev == null) {
            return;
        }
        Node cur = new Node(val);
        Node next = prev.next;
        cur.prev = prev;
        cur.next = next;
        prev.next = cur;
        if (next != null) {
            next.prev = cur;
        }
    }

    public void deleteAtIndex(int index) {
        Node cur = getNodeAtIndex(index);
        if (cur == null) {
            return;
        }
        Node prev = cur.prev;
        Node next = cur.next;
        if (prev != null) {
            prev.next = next;
        } else {
            // modify head when deleting the first node.
            head = next;
        }
        if (next != null) {
            next.prev = prev;
        }
    }

}
