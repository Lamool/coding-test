class Solution {
    public int[] solution(String s) {
        int zeroCount = 0;
        int sLength = 0;
        int count = 0;      // 변환 횟수
        
        do {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 48) zeroCount++;     // 0이면 zeroCount 증가
            }

            s = s.replaceAll("0", "");  // 0 제거

            sLength = s.length();

            s = Integer.toBinaryString(sLength);    // 10진수 -> 2진수
            
            count++;
        } while(!s.equals("1"));
        
        int[] answer = {count, zeroCount}; 
                
        
        return answer;
    }
}