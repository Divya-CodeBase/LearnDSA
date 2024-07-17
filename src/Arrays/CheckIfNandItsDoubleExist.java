package Arrays;

public class CheckIfNandItsDoubleExist {

    public static boolean validMountainArray(int[] arr) {
        int i = 0;
        if (arr.length < 3) {
            return false;
        }
        for (i = 0; i < arr.length; i++) {
            if (!(arr[i] > arr[i + 1])) {
                break;
            }
        }
        for (; i < arr.length; i++) {
            if (!(arr[i] < arr[i + 1])) {
                break;
            }
        }
        if (i == arr.length) {
            return false;
        }
        return true;
    }

    public static void main(String args[]) {


        System.out.println(validMountainArray(new int[]{2,1}));
    }
}
