public class thirty6 {
    public static void main(String[]args) {
        int m = 4;
        int n = 4;

        int[][] arr = new int[m][n];
        int len = m * n;
        int value = 1;

        for (int i = 0; i < m; i++) {
            if (i % 2 == 0) {
                for (int j = n - 1; j >= 0; j--) {
                    arr[i][j] = value++;
                }
            } else {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = value++;
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
