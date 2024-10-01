class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        boolean[] res = new boolean[4];
        int n = mat.length;

        for (int i = 0; i < 4; i++) {
            res[i] = true;
        }

        // check 4 rotations;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (target[i][j] != mat[i][j]) res[0] = false;
                if (target[i][j] != mat[j][n - i - 1]) res[1] = false;
                if (target[i][j] != mat[n - i - 1][n - j - 1]) res[2] = false;
                if (target[i][j] != mat[n - j - 1][i]) res[3] = false;
            }
        }

        return (res[0] || res[1] || res[2] || res[3]);
    }
}

// directions


