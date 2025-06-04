import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int min = arr[0];
        int idx = 0;
        
        if (arr.length == 1) {
            int[] answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                idx = i;
            }
            list.add(arr[i]);
        }
        
        list.remove(idx);
                 
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
                    
        return answer;
    }
}