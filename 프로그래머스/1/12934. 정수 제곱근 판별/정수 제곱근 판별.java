class Solution {
    public long solution(long n) {
        long answer = 0;
        double square_root = 0;
        
        square_root = Math.sqrt(n);
        
        if (square_root == (long)square_root) {
            answer = (long)square_root + 1;
            answer *= answer;
        } else {
            answer = -1;
        }
        
        return answer;
    }
}