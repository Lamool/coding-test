class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long p_int = Long.parseLong(p);    // 문자열 p 정수로 변환
        
        for (int i = 0; i < t.length() - p.length() + 1; i++) {
            String t_sub = t.substring(i, i + p.length());      // p와 길이가 같게, 비교하려는 t 문자열 자른 후 대입
            
            if (Long.parseLong(t_sub) <= p_int) answer++;     // 자른 문자열이 p보다 작거나 같다면 answer 1 증가
        }
        
        return answer;
    }
}