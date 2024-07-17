package Arrays;

public interface ReplaceElewithGreatestEleOnRight {
    public static int[] replaceElements(int[] arr) {
        int greatVal = 0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i + 1; j < arr.length ; j++) {
                greatVal = Math.max(greatVal, arr[j]);
            }
            arr[i] = greatVal;
            greatVal = 0;
        }
        arr[arr.length-1]=-1;
        return arr;


    }

    public static int[] replaceElementsFast(int[] arr) {


        int ans[] = new int[arr.length];

        if (arr.length == 0)
            return arr;

        int max = -1;

        for (int i = arr.length - 1; i >= 0; i--) {
            ans[i] = max;
            if (arr[i] > max)
                max = arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {4,6,1};
        //System.out.println(replaceElements(arr));
        System.out.println(replaceElementsFast(arr));

    }
}
