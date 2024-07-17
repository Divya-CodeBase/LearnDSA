package Arrays_Strings;

public class PivotIndex {
    public static int pivotIndex(int[] nums) {

        int leftSum = 0, rightSum = 0;int total=0;
        int l = 0;
        int r = nums.length - 1;

       for(int i: nums){
           total+=i;
       }

       for(int i=0;i<nums.length;i++){
           rightSum= total-leftSum-nums[i];
           if(rightSum==leftSum){
               return i;
           }
           leftSum+=nums[i];
       }

        return -1;
    }

    public static void main(String args[]) {
        System.out.println(pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
    }
}
