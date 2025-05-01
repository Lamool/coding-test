class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int ha = 0;
        String str = x + "";
        char[] arr = str.toCharArray();
        
        for (int i = 0; i < arr.length; i++) {
            ha += arr[i] - '0';
        }
        
        if (x % ha != 0) answer = false;
        
        return answer;
    }
}