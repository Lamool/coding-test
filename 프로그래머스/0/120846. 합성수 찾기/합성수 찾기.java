class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        
        if (n < 4) return answer;
        else {
            for (int i = 4; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) count++;
                }
                if (count >= 3) {
                    answer++;
                    count = 0;
                }
            }
        }
        
        return answer;
    }
}