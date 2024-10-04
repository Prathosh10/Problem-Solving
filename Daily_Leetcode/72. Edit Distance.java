class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int[][] dp = new int[m][n];
        return minOperation(word1, word2, word1.length() - 1, word2.length() - 1, dp);
    }

    private int minOperation(String word1, String word2, int index1, int index2, int[][] dp) {
        if (index1 < 0) {
            return index2 + 1;
        }

        if (index2 < 0) {
            return index1 + 1;
        }

        if (dp[index1][index2] > 0) {
            return dp[index1][index2];
        }

        if (word1.charAt(index1) == word2.charAt(index2)) {
            dp[index1][index2] = minOperation(word1, word2, index1 - 1, index2 - 1, dp);
            return dp[index1][index2];
        }

        int insert = minOperation(word1, word2, index1, index2 - 1, dp);
        int delete = minOperation(word1, word2, index1 - 1, index2, dp);
        int replace = minOperation(word1, word2, index1 - 1, index2 - 1, dp);

        dp[index1][index2] = 1 + Math.min(insert, Math.min(delete, replace));

        return dp[index1][index2];
    }
}
