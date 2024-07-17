package Arrays;

public class ValidMountainArray {
    static Boolean isMountainArray(int arr[]) {
        if (arr.length < 3) return false;
        int l = 0;
        int r = arr.length - 1;
        while (l + 1 < arr.length - 1 && arr[l] < arr[l + 1]) {
            l++;
        }
        while (r - 1 > 0 && arr[r] < arr[r - 1]){
            r--;
        }
        return l == r;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 5, 4, 3, 2, 1};
        System.out.println(isMountainArray(arr));

    }
}
