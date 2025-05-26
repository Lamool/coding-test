class Solution {
    public int solution(int num) {
        int answer = 0;
        int count = 0;
        long number = num;  // 오버 플로우로 인해 long형으로 바꿔준 것
        
        while (number != 1) {
            if (count > 500) {
                answer = -1;
                break;
            }
            
            if (number % 2 == 0) number /= 2;
            else number = number * 3 + 1;
            
            answer++;
            count++;
        }
        
        return answer;
    }
}