class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int num = 0;
        int rest = 0;
        
        while (true) {
            num = n / a * b;
            answer += n / a * b;
            rest = n % a;
            n = num + rest;
                        
            if (n < a) break;
        }
        
        return answer;
    }
}