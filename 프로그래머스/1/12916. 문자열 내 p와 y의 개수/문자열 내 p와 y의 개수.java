class Solution {
    boolean solution(String s) {
        boolean answer = true;
        s = s.toLowerCase();
        char[] arr = s.toCharArray();
        int p = 0;
        int y = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'p') p++;
            else if (arr[i] == 'y') y++;
        }
        
        if (p != y) answer = false;
        
        return answer;
    }
}