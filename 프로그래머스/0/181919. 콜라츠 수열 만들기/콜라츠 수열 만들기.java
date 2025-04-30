import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        int i;
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(n);
        
        while (n != 1) {
            if (n % 2 == 0) n /= 2;
            else if (n % 2 == 1) n = 3 * n + 1;
            list.add(n);
        }
        
        int[] answer = new int[list.size()];
        for (i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}