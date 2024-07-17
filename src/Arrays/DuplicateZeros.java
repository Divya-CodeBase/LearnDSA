package Arrays;

public class DuplicateZeros {
    public static void duplicateZeros(int[] arr) {
        int [] tm= arr.clone();
        int n= arr.length;
        int index =  0;
        for(int i =0;index<n;i++){
            arr[index++]= tm[i];
        if(tm[i]==0&& index!=n){
            arr[index++]=0;
        }
        }
        System.out.println(arr);
    }
    public static void main(String args[]) {
        duplicateZeros(new int[]{1,0,2,3,0,4,5,0});
    }
}
