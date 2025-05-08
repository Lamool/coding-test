class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        
        int i, j = 0;
        char[] arr_my = my_string.toCharArray();
        char[] arr_over = overwrite_string.toCharArray();
        
        for (i = s; i < arr_over.length + s; i++) {
            arr_my[i] = arr_over[j];    
            j++;
        }
        
        String answer = new String(arr_my);
        
        return answer;
    }
}