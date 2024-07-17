package Arrays_Strings;

public class DiagonalTraverse {
    public static int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int row = 0, column = 0;
        int[] result = new int[m * n];
        int index = 0;
        if (m == 0 || n == 0) return new int[0];
        boolean up = true;

        while (row < m && column < n) {
            if (up) {
                while (row > 0 && column < n - 1) {
                    result[index++] = mat[row][column];
                    row--;
                    column++;
                }
                result[index++] = mat[row][column];
                if(column == n-1){
                    row++;
                }
                else{
                    column++;
                }

            } else {
                while (column > 0 && row < m - 1) {
                    result[index++] = mat[row][column];
                    row++;
                    column--;
                }
                result[index++] = mat[row][column];
                if(row == m-1){
                    column++;
                }
                else{
                    row++;
                }
            }
            up=!up;
        }
        return result;
    }

    public static void main(String args[]) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println(findDiagonalOrder(a));
    }

}
