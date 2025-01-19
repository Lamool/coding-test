class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] divisorNum = new int[number];
        
        for (int i = 1; i <= number; i++) {
            int div = 0;
            
            for (int j = 1; j <= (int)Math.sqrt(i); j++) {
                if (i % j == 0) {
                    if (Math.pow(j, 2) == i) {
                        divisorNum[i - 1]++;
                    } else {
                        divisorNum[i - 1] += 2;
                    }
                }
            }
            
            if (divisorNum[i - 1] > limit) divisorNum[i - 1] = power;
        }
        
        for (int i = 0; i < divisorNum.length; i++) {
            answer += divisorNum[i];
        }
        
        return answer;
    }
}