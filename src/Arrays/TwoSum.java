package Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if ((nums[i]+nums[j])==target){
                   return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
    public static int[] twoSumHash(int[] nums, int target) {

        Map<Integer,Integer> mp= new HashMap<>();

        for(int i=0;i<=nums.length;i++){
            if(mp.containsKey(target-nums[i])){
                return new int[]{mp.get(target-nums[i]),i};
            }
            mp.put(nums[i],i);
        }
        return new int[]{};

    }
    public static void main(String args[]) {

        int []arr=twoSum(new int[]{2,1,2,3,6},9);
        int []arr1=twoSumHash(new int[]{2,1,2,3,6},9);
        for(int i:arr){
            System.out.println(i);
        }
        for(int i:arr1){
            System.out.println(i);
        }
    }
    public static int[] twoSumHash_(int[] nums, int target) {
        Map<Integer,Integer> mp= new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(target-nums[i])){
                return new int[]{mp.get(target-nums[i]),i};
            }
            mp.put(nums[i],i);
        }
        return new int[]{};

    }
}
