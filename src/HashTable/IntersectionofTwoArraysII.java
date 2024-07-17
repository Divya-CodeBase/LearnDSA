package HashTable;

import java.util.*;

public class IntersectionofTwoArraysII {

    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer>lt= new ArrayList<>();
        int [] a= new int[1000];int count =0;
        for(int n: nums1){
            a[n]++;
        }

        for(int i=0;i<nums2.length;i++){
            if(a[nums2[i]]>0){
                lt.add(nums2[i]);
                a[nums2[i]]--;
            }
        }

        int[] arr = new int[lt.size()];
        for(int i=0;i<lt.size();i++){
            arr[i]= lt.get(i);
        }

        return arr;

    }
    public static void main(String args[]) {
         System.out.println(intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2}));
        //System.out.println(intersection_type2(new int[]{1, 2, 2, 1}, new int[]{2, 2}));
        //System.out.println(intersect(new int[]{4, 7, 9, 7, 6, 7}, new int[]{5, 0, 0, 6, 1, 6, 2, 2, 4}));
//        System.out.println(intersection_type4(new int[]{4, 7, 9, 7, 6, 7}, new int[]{5, 0, 0, 6, 1, 6, 2, 2, 4}));

    }

}
