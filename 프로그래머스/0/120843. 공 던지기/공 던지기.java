class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int idx = 0;
        
        if (k == 1) answer = 1;
        else {
            for (int i = 0; i < k; i++) {
                answer = numbers[idx];
                
                idx += 2;
                if (idx > numbers.length) idx = 1;
                else if (idx == numbers.length) idx = 0;
            }
        }
        
        return answer;
    }
}