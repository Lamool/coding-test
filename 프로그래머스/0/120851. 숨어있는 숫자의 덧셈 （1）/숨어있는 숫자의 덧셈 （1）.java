class Solution {
    public int solution(String my_string) {
        int answer = 0;
        char[] arr = my_string.toCharArray();
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= '0' && arr[i] <= '9') {
                answer += arr[i] - '0';
            }
        }
        
        return answer;
    }
}