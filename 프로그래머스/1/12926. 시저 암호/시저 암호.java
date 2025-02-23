class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 32) {
                answer += s.charAt(i);
            } else if (s.charAt(i) + n > 122) {
                answer += (char)(96 + ((s.charAt(i) + n) - 122));
            } else if (s.charAt(i) + n > 90 && s.charAt(i) < 91) {
                answer += (char)(64 + ((s.charAt(i) + n) - 90));
            } else {
                answer += (char)(s.charAt(i) + n);
            }
        }
        
        return answer;
    }
}