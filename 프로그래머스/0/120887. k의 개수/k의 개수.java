class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for (int a = i; a <= j; a++) {
            String str = a + "";
            
            while (true) {
                int idx = str.indexOf(k + "");
                if (idx > -1) {
                    answer++;
                    str = str.substring(idx + 1);
                } else {
                    break;
                }
            }
        }
        
        return answer;
    }
}