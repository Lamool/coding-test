class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int min = -1;
        int k = 0;
        
        for (int i = 0; i < queries.length; i++) {
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (j == queries[i][0]) {
                    k = queries[i][2];
                }
                
                if (min < 0 && k < arr[j]) min = arr[j];
                else if (k < arr[j] && arr[j] <= min) min = arr[j];
            }
            answer[i] = min;
            min = -1;
        }
        
        return answer;
    }
}