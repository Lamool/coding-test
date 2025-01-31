class Solution {
    public int solution(String s) {
        int answer = 1;
        
        char strFirst = s.charAt(0);    // 문자열 첫 번째 글자를 담을 변수
        
        int xNum = 0;       // x 글자 수를 담을 변수
        int oNum = 0;       // x가 아닌 다른 글자 수를 담을 변수
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == strFirst) {
                xNum++;
            } else {
                oNum++;
            }
            
            if (xNum == oNum) {
                if (i + 1 < s.length()) {
                    s = s.substring(i + 1);
                    strFirst = s.charAt(0);
                    xNum = 0;
                    oNum = 0;
                    answer++;
                    i = -1;
                }
            }
        }
        
        return answer;
    }
}