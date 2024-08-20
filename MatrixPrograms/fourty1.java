public class fourty1 {
    public static void main(String[]args) {
        int m = 4;
        int n = 5;

        int[][] arr = new int[m][n];
        int len = m * n;
        int value = 1;
        boolean flag = true;
        for (int i = m - 1; i >= 0; i--) {
            if (flag) {
                for (int j = n - 1;j >= 0; j--) {
                    arr[i][j] = value++;
                }
                
                flag = false;
            } else {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = value++;
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
