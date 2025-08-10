class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        char[][] arr = new char[my_string.length() / m][m];
        int idx = 0;
        
        for (int i = 0; i < my_string.length() / m; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = my_string.charAt(idx++);
            }
        }
        
        for (int i = 0; i < my_string.length() / m; i++) {
            answer += arr[i][c-1];
        }
        
        return answer;
    }
}