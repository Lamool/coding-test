class Solution {
    public String solution(String phone_number) {
        int length = phone_number.length();
        char[] arr = phone_number.toCharArray();
        
        for (int i = 0; i < length - 4; i++) {
            arr[i] = '*';
        }
        
        String answer = new String(arr);
        
        return answer;
    }
}