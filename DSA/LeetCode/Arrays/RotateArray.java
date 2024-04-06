package Arrays;

import java.util.Arrays;

public class RotateArray {
    public void rotate(int[][] matrix) {
        int len = matrix.length;
        // Transpose the matrix
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // Inverse the matrix
        for (int i = 0; i < len; i++) {
            int k = len - 1;
            for (int j = 0; j < len / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][k];
                matrix[i][k] = temp;
                k--;
            }
        }


        System.out.println(Arrays.deepToString(matrix));

    }
}