public class twenty5 {
    public static void main(String[] args) {
        int m = 4;
        int n = 4;

        int[][] dup = new int[m][n];
        
        int row = 0, col = 0;
        int value = 1;
        int len = m * n;
        for (int i = 0; i < len; i++) {
            dup[row][col] =value;
            value++;

            if ((row + col) % 2 == 0) {
                if (col == n - 1) {
                    row++;
                } else if (row == 0) {
                    col++;
                } else {
                    row--; 
                    col++;
                }
            } else {
                if (row == m - 1) { // always first
                    col++;
                }else if (col == 0) {
                    row++;
                } else {
                    row++;
                    col--;
                }
            }
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
/*
 * 3 condition for even 
 * 3 condition for odd
 * col 1st, col last, diagonal
 * row 1st, row last, diagonal
 * 3 clock wise direction, 3 anti clock direction
 * check overlap conditions, after give condition order
 * 
 */
