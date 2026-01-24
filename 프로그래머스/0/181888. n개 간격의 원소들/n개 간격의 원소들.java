import java.util.ArrayList;

class Solution {
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> al = new ArrayList<>();
        int i = 0;
        
        while (num_list.length - 1 >= i) {
            al.add(num_list[i]);
            i += n;
        }
        
        int[] answer = new int[al.size()];
        for (i = 0; i < al.size(); i++) {
            answer[i] = al.get(i);
        }
        
        return answer;
    }
}