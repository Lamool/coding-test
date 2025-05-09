class Solution {
    public String[] solution(String my_str, int n) {
        int length = my_str.length() % n == 0 ? my_str.length() / n : my_str.length() / n + 1;
        String[] answer = new String[length];
        int count = 0;
        int idx = 0;
        
        for (int i = 0; i < my_str.length(); i++) {
            if (answer[idx] == null) {
                answer[idx] = "" + my_str.charAt(i);
            } else {
                answer[idx] += my_str.charAt(i);
            }
            
            count++;
            
            if (count == n) {
                idx++;
                count = 0;
            }
        }
        
        return answer;
    }
}