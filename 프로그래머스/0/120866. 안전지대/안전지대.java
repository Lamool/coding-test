class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int length = board.length;
        
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 1) {
                    if ((i - 1 != -1) && (j - 1 != -1))
                        if (board[i - 1][j - 1] == 0)
                            board[i - 1][j - 1] = 2;
                        
                    if ((i - 1 != -1) && (j + 1 != length))
                        if (board[i - 1][j + 1] == 0)
                            board[i - 1][j + 1] = 2;
                        
                    if ((i + 1 != length) && (j - 1 != -1))
                        if (board[i + 1][j - 1] == 0)
                            board[i + 1][j - 1] = 2;
                        
                    if ((i + 1 != length) && (j + 1 != length))
                        if (board[i + 1][j + 1] == 0)
                            board[i + 1][j + 1] = 2;
                        
                    if (j - 1 != -1)
                        if (board[i][j - 1] == 0)
                            board[i][j - 1] = 2;
                    
                    if (j + 1 != length)
                        if (board[i][j + 1] == 0)
                            board[i][j + 1] = 2;
                        
                    if (i - 1 != -1)
                        if (board[i - 1][j] == 0)
                            board[i - 1][j] = 2;
                    
                    if (i + 1 != length)
                        if (board[i + 1][j] == 0)
                            board[i + 1][j] = 2;
                }
            }
        }
        
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 0) answer++;
            }
        }
        
        return answer;
    }
}