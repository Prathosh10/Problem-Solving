public class thirty9 {
    public static void main(String[]args) {
        int m = 4;
        int n = 5;

        int[][] arr = new int[m][n];
        int len = m * n;
        int value = 1;
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            if (flag) {
                for (int j = m - 1;j >= 0; j--) {
                    arr[j][i] = value++;
                }
                
                flag = false;
            } else {
                for (int j = 0; j < m; j++) {
                    arr[j][i] = value++;
                }
                flag = true;
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
