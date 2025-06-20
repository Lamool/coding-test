class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = n + "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            answer += ch - '0';
        }
        
        return answer;
    }
}