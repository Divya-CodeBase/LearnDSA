package Arrays_Strings;

public class TwoSumII_InputArrSorted {
    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int l = 0;int r= numbers.length-1;
        while (l < r) {
                if (numbers[l] + numbers[r] == target&&l!=r) {
                    result[0] = l+1;
                    result[1] = r+1;
                    return result;
                }
                else if(numbers[l]+numbers[r]>target){
                    r--;
                }
                else{
                    l++;
                }

        }

        return null;
    }

    public static void main(String args[]) {

        System.out.println(twoSum(new int[]{5,25,75}, 100));
    }
}
