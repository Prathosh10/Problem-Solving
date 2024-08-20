public class thirty5 {
    public static void main(String[]args) {
        int m = 5;
        int n = 5;

        int[][] arr = new int[m][n];
        int len = m * n;
        int value = 1;

        for (int i = n - 1; i >= 0; i--) {
            if (i % 2 == 0) {
                for (int j = m - 1;j >= 0; j--) {
                    arr[j][i] = value++;
                }
            } else {
                for (int j = 0; j < m; j++) {
                    arr[j][i] = value++;
                }
            }
        }

        // print
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
