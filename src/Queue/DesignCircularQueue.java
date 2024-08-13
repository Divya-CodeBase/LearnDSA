package Queue;

import java.util.ArrayList;
import java.util.List;

class MyCircularQueue {
    int[] a;
    int head = 0;
    int tail = 0;
    int k = 0;

    public MyCircularQueue(int k) {
        this.k = k;
        a = new int[k];

    }

    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        a[(head + tail) % k] = value;
        tail++;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        tail--;
        head = head + 1 % k;
        return true;


    }

    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return a[head];

    }

    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        return a[(head + tail - 1) % k];
    }

    public boolean isEmpty() {
        return tail == 0;
    }

    public boolean isFull() {
        return tail == k;

    }
}


public class DesignCircularQueue {
    public static void main(String args[]) {

        MyCircularQueue myCircularQueue = new MyCircularQueue(3);
        myCircularQueue.enQueue(1); // return True
        myCircularQueue.enQueue(2); // return True
        myCircularQueue.enQueue(3); // return True
        myCircularQueue.enQueue(4); // return False
        myCircularQueue.Rear();     // return 3
        myCircularQueue.isFull();   // return True
        myCircularQueue.deQueue();  // return True
        myCircularQueue.enQueue(4); // return True
        myCircularQueue.deQueue();  // return True
        myCircularQueue.enQueue(5); // return True
        myCircularQueue.Rear();     // return 4
    }
}
