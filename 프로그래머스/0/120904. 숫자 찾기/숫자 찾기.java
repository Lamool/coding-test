class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String str = num + "";
        
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if ((int)arr[i] - 48 == k) {
                answer = i + 1;
                break;
            }
        }
        if (answer == 0) answer = -1;
        
        return answer;
    }
}