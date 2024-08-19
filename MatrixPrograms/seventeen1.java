public class seventeen1 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        // int m = matrix.length;
        // int n = matrix[0].length;

        int m = 3;
        int n = 3;

        int[][] dup = new int[m][n];
        int value = 1;

        int rS = 0, cS = 0, rE = m - 1, cE = n - 1;
        while (rS <= rE && cS <= cE) {
            for (int i = cS; i <= cE; i++) {
                dup[rS][i] = value;
                value++;
            }
            rS++;

            for (int i = rS; i <= rE; i++) {
                dup[i][cE] = value;
                value++;
            }
            cE--;

            for (int i = cE; i >= cS; i--) {
                dup[rE][i] = value;
                value++;
            }
            rE--;

            for (int i = rE; i >= rS; i--) {
                dup[i][cS] = value;
                value++;
            }
            cS++;
            // break;
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
