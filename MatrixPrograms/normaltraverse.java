public class normaltraverse {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

// print, get, put (same order)
        // normal(matrix);
        // vertical(matrix);
        rightToLeft(matrix);

    }

    private static void rightToLeft(int[][] matrix) {
        // print & get
        int m = matrix.length - 1;
        int n = matrix[0].length - 1;
        for (int i = m; i >= 0; i--) {
            for (int j = n; j >= 0; j--) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // put
        int[][] dup = new int[m + 1][n + 1];
        int value = 1;
        for (int i = m; i >= 0; i--) {
            for (int j = n; j >= 0; j--) {
                dup[i][j] = value;
                value++; 
            }
        }
        // print 
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(dup[i][j] + "  ");
            }
            System.out.println();
        }
        
    }

    private static void vertical(int[][] matrix) {
        // print
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }

        // put
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dup = new int[m][n];
        int value = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dup[j][i] = value;
                value++; 
            }
        }
        // print 
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(dup[i][j] + "  ");
            }
            System.out.println();
        }

    }

    private static void normal(int[][] matrix) { // horizontal traverse
        // print & get
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }

        // put
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dup = new int[m][n];
        int value = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dup[i][j] = value;
                value++; 
            }
        }
        // print 
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(dup[i][j] + "  ");
            }
            System.out.println();
        }
    }
}