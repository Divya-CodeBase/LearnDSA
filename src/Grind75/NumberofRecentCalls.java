package Grind75;

import java.util.LinkedList;
import java.util.Queue;

public class NumberofRecentCalls {
    public static void main(String args[]) {
        RecentCounter obj = new RecentCounter();
        int param_1 = obj.ping(1);
        int param_2 = obj.ping(100);
        int param_3 = obj.ping(3001);
        int param_4 = obj.ping(3002);


    }
}

class RecentCounter {
    Queue<Integer> q;
    public RecentCounter() {

        q = new LinkedList<>();
    }
    public int ping(int t) {
        q.add(t);

        while (q.peek() < t - 3000) {
            q.poll();
        }
        return q.size();
    }
}



