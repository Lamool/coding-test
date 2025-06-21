class Solution {
    public int solution(int order) {
        int answer = 0;
        String str = order + "";
        char[] arr = str.toCharArray();
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - '0' == 3) answer++;
            else if (arr[i] - '0' == 6) answer++;
            else if (arr[i] - '0' == 9) answer++;
        }
        
        return answer;
    }
}