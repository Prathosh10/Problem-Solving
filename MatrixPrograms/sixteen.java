public class sixteen {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

        // put
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dup = new int[m][n];
        int value = 1;

        for (int row = m - 1; row >= 0; row--) {
            int col = n - 1, row1 = row;
            while (row1 < m && col >= 0) {
                dup[row1][col] = value;
                value++;
                col--;
                row1++;
            }
        }

        for (int col = n - 2; col >= 0; col--) {
            int col1 = col, row = 0;
            while (row < m && col1 >= 0) {
                dup[row][col1] = value;
                value++;
                col1--;
                row++;
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
