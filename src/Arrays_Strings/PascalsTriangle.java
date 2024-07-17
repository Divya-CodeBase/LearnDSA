package Arrays_Strings;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    //Pascal triangle formula nCr= n!/r!(n-r)!

    //Type 1: to find particular value with row and column give
    public static int generateType1(int row, int column) {
        int result = 1;
        for (int i = 1; i <= column; i++) {
            result = result * (row - i+1);
            //result = result / (i + 1);
            result = result / (i );
        }
        return result;
    }

    //Type 2: to find row with given row number
    public static List<Integer> generateType2(int row) {
        List<Integer> res = new ArrayList<>();
        int result = 1;
        for (int i = 0; i <= row; i++) {
            res.add(result);
            result = result * (row - i);
            result = result / (i + 1);
        }
        return res;
    }

    //Type 2: To find entire triangle with given number of rows
    public static List<List<Integer>> generateType3(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            ans.add(generateType2(i));
        }
        return ans;
    }

    public static void main(String args[]) {

        System.out.println(generateType1(4, 2));
       // System.out.println(generateType2(30));
       // System.out.println(generateType_(4));

       // System.out.println(generateType3(4));
    }

    public static List<Integer> generateType_(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        res.add(1);
        long prev = 1;
        for (int k = 1; k <= rowIndex; k++) {
            long next_val = prev * (rowIndex - k + 1) / k;
            res.add((int) next_val);
            prev = next_val;
        }
        return res;
    }
}