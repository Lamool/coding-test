import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        char[] cbefore = before.toCharArray();
        char[] cafter = after.toCharArray();
        
        Arrays.sort(cbefore);
        Arrays.sort(cafter);
        
        for (int i = 0; i < cbefore.length; i++) {
            if (cbefore[i] != cafter[i]) {
                answer = 0;
                break;
            }
        }
        
        return answer;
    }
}