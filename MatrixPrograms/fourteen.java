public class fourteen {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

        // put
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dup = new int[m][n];
        int value = 1;

        for (int row = 0; row < m; row++) {
            int col = n - 1, row1 = row;
            while (row1 >= 0 && col >= 0) {
                dup[col][row1] = value;
                value++;
                col--;
                row1--;
            }
        }

        for (int col = n - 2; col >= 0; col--) {
            int row = m - 1, col1 = col;
            while (row >= 0 && col1 >= 0) {
                dup[col1][row] = value;
                value++;
                col1--;
                row--;
            }
        }

        // print 
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(dup[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
// 12 -> invert 14
