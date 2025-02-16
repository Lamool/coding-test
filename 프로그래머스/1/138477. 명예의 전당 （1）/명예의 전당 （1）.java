import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < score.length; i++) {
            if (i < k) {
                list.add(score[i]);

                Collections.sort(list, Collections.reverseOrder());     // 리스트 내림차순 정렬

                answer[i] = list.get(list.size() - 1);
            } else {
                for (int j = 0; j < list.size(); j++) {
                    if (list.get(j) <= score[i]) {
                        list.add(j, score[i]);
                        list.remove(list.size() - 1);
                        break;
                    }
                }
                answer[i] = list.get(list.size() - 1);
            }
        }
        
        return answer;
    }
}