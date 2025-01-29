class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int max = arr[0];
        int count = 1;
        
        // 가장 큰 수 찾기
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (max * count % arr[i] != 0) {
                i = -1;
                count++;
                continue;
            }
        }
        
        answer = max * count;
        
        return answer;
    }
}