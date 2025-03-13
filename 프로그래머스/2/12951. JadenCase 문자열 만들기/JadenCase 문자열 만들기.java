class Solution {
    public String solution(String s) {
        String answer = "";
        
        s = s.toLowerCase();    // 소문자로 변환
        
        StringBuilder sb = new StringBuilder(s);
        
        for (int i = 0; i < sb.length(); i++) {
            if (i == 0 && (sb.charAt(i) >= 97 && sb.charAt(i) <= 122)) {  // 0번째 인덱스이고 소문자이면
                sb.setCharAt(i, (char)(sb.charAt(i) - 32));
            }
            
            if ((sb.charAt(i) == 32) && ((i + 1) != sb.length()) && (sb.charAt(i + 1) != 32) && (sb.charAt(i + 1) >= 97 && sb.charAt(i + 1) <= 122)) {  // 지금 글자가 공백이고 // 지금 글자가 마지막 글자가 아니면서 // 다음 글자가 공백이 아니면서 // 다음 글자가 소문자이면
                sb.setCharAt(i + 1, (char)(sb.charAt(i + 1) - 32));      // 대문자로 변환
            }
        }
        answer = sb.toString();
        
        return answer;
    }
}