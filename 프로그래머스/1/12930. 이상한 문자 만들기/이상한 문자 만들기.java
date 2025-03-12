class Solution {
    public String solution(String s) {
        String answer = "";
        boolean evenNumber = true;      // 짝수 여부
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 32) {      // 공백인 경우 // 32 : 공백
                answer += s.charAt(i);
                evenNumber = true;
            } else if (evenNumber == true) {
                // answer += s.charAt(i).toUpperCase();    // 이거 에러
                answer += s.toUpperCase().charAt(i);       // 대문자로
                evenNumber = false;
            } else {
                answer += s.toLowerCase().charAt(i);       // 소문자로
                evenNumber = true;
            }
        }        
        
        return answer;
    }
}