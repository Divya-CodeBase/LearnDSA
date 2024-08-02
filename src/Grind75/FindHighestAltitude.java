package Grind75;

public class FindHighestAltitude {
    public static void main(String args[]) {
        System.out.println(largestAltitude(new int[]{-5,1,5,0,-7}));
    }

    public static int largestAltitude(int[] gain) {
        int inital= 0;int current=0;
        for(int i=0;i<gain.length;i++){
            inital +=gain[i];
            current= Math.max(current,inital);
        }
        return current;

    }
}
