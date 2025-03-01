class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int length = priorities.length;
        int max = priorities[0];
        int idx = -1;
        
        // 우선순위 최댓값 구하기
        for (int i = 1; i < length; i++) {
            if (priorities[i] > max)
                max = priorities[i];
        }
        
        for (int i = 0; i < length; i++) {
            if (priorities[i] == max) {
                answer++;
                
                if (i == location) {
                    return answer;
                }
                
                idx = i;
            }
        }
        
        for (int i = max - 1; i > 0; i--) {
            if (answer == length) break;
            int standard = idx + 1;
            
            for (int j = standard; j < length; j++) {
                if (priorities[j] == i) {
                    answer++;

                    if (j == location) {
                        return answer;
                    }

                    idx = j;
                }
            }
            
            for (int j = 0; j < standard; j++) {
                if (priorities[j] == i) {
                    answer++;

                    if (j == location) {
                        return answer;
                    }

                    idx = j;
                }
            }
        }
        
        return answer;
    }
}