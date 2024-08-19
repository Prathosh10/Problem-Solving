public class eight {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

        // put
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dup = new int[m][n];
        int value = 1;
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                dup[j][i] = value;
                value++; 
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
