class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int[] arr = new int[citations.length];
        
        for (int i = 0; i < citations.length; i++) {
            for (int j = 0; j < citations.length; j++) {
                if (citations[i] <= citations[j]) {
                    arr[i]++;
                }
            }
        }
        
        for (int i = 0; i < citations.length; i++) {
            if (citations[i] <= arr[i]) {
                if (citations[i] > answer) {
                    answer = citations[i];
                }
            } else {
                if (arr[i] > answer) {
                    answer = arr[i];
                }
            }
        }
        
        return answer;
    }
}