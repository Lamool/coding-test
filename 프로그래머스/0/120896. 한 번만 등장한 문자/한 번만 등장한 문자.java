import java.util.Arrays;

class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray();
        
        Arrays.sort(arr);
        
        s = "";
        for (int i = 0; i < arr.length; i++) {
            s += arr[i];
        }
        
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                s = s.replaceAll((s.charAt(i) + ""), "");                
                i = -1;
            }
        }
        
        return s;
    }
}