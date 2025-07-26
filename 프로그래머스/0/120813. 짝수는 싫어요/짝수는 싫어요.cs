using System;

public class Solution {
    public int[] solution(int n) {
        int length = n % 2 == 0 ? n / 2 : n / 2 + 1;
        int[] answer = new int[length];
        int idx = 0;
        
        for (int i = 1; i <= n; i += 2) {
            answer[idx] = i;
            idx++;
        }
        
        return answer;
    }
}