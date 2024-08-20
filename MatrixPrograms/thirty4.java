public class thirty4 {
    public static void main(String[]args) {
        int m = 5;
        int n = 4;

        int[][] arr = new int[m][n];
        int len = m * n;
        int value = 1;

        for (int i = 0; i < n; i++) {
            if(i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    arr[j][i] = value;
                    value++;
                }
            } else {
                int val = m * (i + 1);
                for (int j = 0; j < m; j++) {
                    arr[j][i] = val;
                    value++;
                    val--;
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
