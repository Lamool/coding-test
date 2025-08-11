class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int idx = 0;
        int length = myString.length();
        
        for (int i = 0; i < length; i++) {
            idx = myString.indexOf(pat);
            
            if (idx != -1) {
                myString = myString.substring(idx + 1);
                idx = -1;
                answer++;
            }
        }
        
        return answer;
    }
}