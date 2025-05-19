class Solution {
    public String solution(String code) {
        String answer = "";
        char[] arr = code.toCharArray();
        int mode = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '1' && mode == 0) {
                mode = 1;
            } else if (arr[i] == '1' && mode == 1) {
                mode = 0;
            } else if (i % 2 == 0 && mode == 0) {
                answer += arr[i];
            } else if (i % 2 == 1 && mode == 1) {
                answer += arr[i];
            }
            
        }
        
        String str = new String(arr);
        
        if (answer == "") answer += "EMPTY";
        
        return answer;
    }
}