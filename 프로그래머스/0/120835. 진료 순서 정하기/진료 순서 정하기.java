import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        Integer[] emergency_copy = Arrays.stream(emergency).boxed().toArray(Integer[]::new);
        
        Arrays.sort(emergency_copy, Collections.reverseOrder());
        
        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < emergency.length; j++) {
                if (emergency_copy[j] == emergency[i]) {
                    answer[i] = j + 1;
                }
            }
        }
        
        return answer;
    }
}