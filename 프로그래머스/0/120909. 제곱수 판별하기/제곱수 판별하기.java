import java.lang.Math;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        double square = Math.sqrt(n);
        if (square == (int)square) answer = 1;
        else answer = 2;
        
        return answer;
    }
}