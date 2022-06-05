import java.util.Arrays;

class setmatrixzeroes {
    public static void main(String[] args) {
        setmatrixzeroes s = new setmatrixzeroes();
        int[][] matrix = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        s.setZeroes(matrix);
    }

    public void setZeroes(int[][] matrix) {
        int[] row = new int[matrix.length];
        int[] col = new int[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = -1;
                    col[j] = -1;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (row[i] == -1 || col[j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}