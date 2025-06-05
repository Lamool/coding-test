class Solution {
    public String solution(String s) {
        String answer = "";
        char[] arr = s.toCharArray();
        int length = arr.length / 2;
        
        if (arr.length % 2 == 0) {
            answer += arr[length - 1];
            answer += arr[length];
        } else {
            answer += arr[length];
        }
        
        return answer;
    }
}