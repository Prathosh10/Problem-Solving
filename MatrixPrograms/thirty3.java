public class thirty3 {
    public static void main(String[]args) {
        int m = 4;
        int n = 5;

        int[][] arr = new int[m][n];
        int len = m * n;
        int value = 1;

        for (int i = 1; i <= m; i++) {
            if (i % 2 == 0) {
                int val = i * n;
                for (int j = 0; j < n; j++) {
                    arr[i - 1][j] = val;
                    val--;
                    value++;
                }
            } else {
                for  (int j = 0; j < n; j++) {
                    arr[i - 1][j] = value;
                    value++;
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