class Solution {
    public long solution(int n) {
        long answer = 0;
        
        if (n == 1) return 1;
        else if (n == 2) return 2;
        
        long one = 1;
        long two = 2;
        
        for (int i = 3; i <= n; i++) {
            answer = (one + two) % 1234567;
            one = two;
            two = answer;
        }
        
        return answer;
    }
}