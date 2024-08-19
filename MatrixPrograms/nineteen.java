public class nineteen {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int m = matrix.length;
        int n = matrix[0].length;

        // corner positions
        int[] pos = {15, 14, 13, 12, 8, 4, 0, 1, 2, 3, 7, 11};

        int[][] dup = new int[m][n];
        int value = 1;

        for (int i = 0; i < pos.length; i++) {
            int row = pos[i] / m;
            int col = pos[i] % n;

            dup[row][col] = value;
            value++;
        }

        // print 
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(dup[i][j] + " ");
            }
            System.out.println();
        }
    }
}
