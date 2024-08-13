package Grind75;

import java.util.LinkedList;
import java.util.Queue;

public class Dota2Senate {

    public static void main(String args[]) {
        System.out.println(predictPartyVictory("RDD"));
    }
    public static String predictPartyVictory(String senate) {
        int n = senate.length();
        Queue<Integer> D = new LinkedList<>(), R = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R') {
                R.add(i);
            } else {
                D.add(i);
            }
        }

        while (!R.isEmpty() && !D.isEmpty()) {
            if (R.peek() < D.peek()) {
                R.add(n++);
            } else {
                D.add(n++);
            }
            R.poll();
            D.poll();
        }

        return R.size() == 0 ? "Dire" : "Radiant";
    }

}
