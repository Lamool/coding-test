class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int count = 0;
        
        if (s.charAt(0) == 41) {    // 아스키코드 41 : )
            answer = false;         // 문자열 첫 시작이 )면 false return
            return answer;
        }
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 40) {    // 아스키코드 40 : (
                count++;
            } else {
                count--;
                
                if (count < 0) {
                    answer = false;
                    break;
                }
            }
        }
        
        if (count != 0) {
            answer = false;
        }

        return answer;
    }
}