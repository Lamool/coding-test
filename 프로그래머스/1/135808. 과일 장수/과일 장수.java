import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        Integer[] score2 = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(score2, Collections.reverseOrder());
        
        for (int i = m - 1; i < score2.length; i += m) {
            answer += score2[i] * m;
        }
        
        return answer;
    }
}