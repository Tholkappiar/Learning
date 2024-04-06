package Arrays;

import java.util.Arrays;

public class MatrixZeros {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 0}, {1, 2, 3}};
        boolean[][] boo = new boolean[arr.length][arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    boo[i][j] = true;
                }
            }
        }

        for (int i = 0; i < boo.length; i++) {
            for (int j = 0; j < boo[i].length; j++) {
                if (boo[i][j]) {
                    colFill(arr, j);
                    Arrays.fill(arr[i], 0);
                    break;
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }

    public static void colFill(int[][] arr, int j) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][j] = 0;
        }
    }

}
