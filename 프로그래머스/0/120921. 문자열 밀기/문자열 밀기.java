class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        
        boolean tf = false;
        
        String str = A;
        String str2 = "";
        
        if (!A.equals(B)) {
            for (int i = 0; i < A.length(); i++) {
                str2 = str.charAt(str.length() - 1) + "";

                for (int j = 0; j < str.length() - 1; j++) {
                    str2 += str.charAt(j);
                }

                answer++;
                str = str2;

                if (str2.equals(B)) {
                    tf = true;
                    break;
                }
            }
        } else {
            tf = true;
        }
        
        if (!tf) answer = -1;
        
        return answer;
    }
}