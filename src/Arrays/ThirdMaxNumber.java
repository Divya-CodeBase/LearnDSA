package Arrays;

import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Set;

public class ThirdMaxNumber {
    public static int thirdMax(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        for (int n : nums) {
            if (n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            }
            if (n < max1 && n > max2) {
                max3 = max2;
                max2 = n;
            }
            if (n<max2) {
                max2 = max1;
                max3 = n;
            }
        }
        return max3==Integer.MIN_VALUE?max1:max3;
    }
    public static int thirdMax_SetQueue(int[] nums) {

        Set<Integer> st= new HashSet<>();
        for(int n:nums){
            st.add(n);
        }

        PriorityQueue<Integer>pq= new PriorityQueue<>();
       for(int n: st){
           pq.add(n);
           if(pq.size()>3)pq.poll();
       }
        if(pq.size()==2)pq.poll();

        return pq.peek();




    }

    public static void main(String args[]) {

        System.out.println(thirdMax(new int[]{1,2}));
        //System.out.println(thirdMax_SetQueue(new int[]{3,1,2,4,2,2,4,2,5,8,6,9}));
    }

}
