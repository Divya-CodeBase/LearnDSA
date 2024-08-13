package Grind75;

import java.util.Stack;

public class AsteroidCollision {
    public static void main(String args[]) {
        asteroidCollision(new int[]{1,-2,-2,-2});

    }

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {
            if (st.isEmpty() || asteroids[i] > 0) {
                st.push(asteroids[i]);
            } else {
                while (true) {
                    int peek = st.peek();
                    if (peek < 0) {
                        st.push(asteroids[i]);
                        break;
                    } else if (peek == -(asteroids[i])) {
                        st.pop();
                        break;
                    } else if (peek > -asteroids[i]) {
                        break;
                    } else {
                        st.pop();
                        if (st.isEmpty()) {
                            st.push(asteroids[i]);
                            break;
                        }
                    }
                }
            }
        }
        int[] a = new int[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            a[i] = st.pop();
        }
        return a;
    }
}