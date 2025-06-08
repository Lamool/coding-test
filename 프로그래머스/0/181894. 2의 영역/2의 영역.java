class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        int two_count = 0;
        int start = -1;
        int finish = -1;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                if (start == -1) start = i;
                else finish = i;
                
                two_count++;
            }
        }
        
        if (two_count == 0) {
            answer = new int[] {-1};
        } else if (two_count == 1) {
            answer = new int[] {2};
        } else {
            answer = new int[finish - start + 1];
            int idx = 0;
            
            for (int i = start; i <= finish; i++) {
                answer[idx++] = arr[i];
            }
        }
        
        return answer;
    }
}