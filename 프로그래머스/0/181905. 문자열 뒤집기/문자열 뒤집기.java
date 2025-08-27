class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        char[] res = my_string.toCharArray();
        int j = e;
        
        for (int i = s; i <= e; i++) {
            res[i] = arr[j];
            j--;
        }
        
        answer = String.valueOf(res);
        
        return answer;
    }
}