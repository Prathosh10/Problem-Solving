class Solution {
    public int numRookCaptures(char[][] board) {
        int indexR1 = 0;
        int indexR2 = 0;
        int m = board.length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 'R') {
                    indexR1 = i;
                    indexR2 = j;

                    break;
                }
            }
        }

        int count = 0;
        int i = indexR1 - 1, j = indexR2;
        while (i >= 0) {
            if (board[i][j] == 'p') {
                count++;
                break;
            } else if (board[i][j] == 'B') {
                break;
            }
            i--;
        }

        i = indexR1 + 1; j = indexR2;
        while (i < m) {
            if (board[i][j] == 'p') {
                count++;
                break;
            } else if (board[i][j] == 'B') {
                break;
            }
            i++;
        }

        i = indexR1; j = indexR2 + 1;
        while (j < m) {
            if (board[i][j] == 'p') {
                count++;
                break;
            } else if (board[i][j] == 'B') {
                break;
            }
            j++;
        }

        i = indexR1; j = indexR2 - 1;
        while (j >= 0) {
            if (board[i][j] == 'p') {
                count++;
                break;
            } else if (board[i][j] == 'B') {
                break;
            }
            j--;
        }

        return count;
    }
}
