
class NumMatrix {
    int[][] bit;
    int[][] matrix;
    int m, n;

    public NumMatrix(int[][] matrix) {
        this.m = matrix.length;
        this.n = matrix[0].length;

        this.matrix = new int[m][n];
        this.bit = new int[m + 1][n + 1];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                update(i, j, matrix[i][j]);
            }
        }
    }

    public void update(int row, int col, int val) {
        int diff = val - matrix[row][col];

        matrix[row][col] = val;

        for (int i = row + 1; i <= m; i += i & -i) {
            for (int j = col + 1; j <= n; j += j & -j) {
                bit[i][j] += diff;
            }
        }
    }

    public int sumRegion(int row1, int col1,
                         int row2, int col2) {

        return prefixSum(row2, col2)
             - prefixSum(row1 - 1, col2)
             - prefixSum(row2, col1 - 1)
             + prefixSum(row1 - 1, col1 - 1);
    }

    private int prefixSum(int row, int col) {
        int sum = 0;

        for (int i = row + 1; i > 0; i -= i & -i) {
            for (int j = col + 1; j > 0; j -= j & -j) {
                sum += bit[i][j];
            }
        }

        return sum;
    }
}
