import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        
        Queue<String> que1 = new LinkedList<String>();
        Queue<String> que2 = new LinkedList<String>();
        
        for(int i = 0; i < cards1.length; i++) {
			que1.offer(cards1[i]);
		}
        
        for(int i = 0; i < cards2.length; i++) {
			que2.offer(cards2[i]);
		}
        
        for (int i = 0; i < goal.length; i++) {
            if (goal[i].equals(que1.peek())) {
                que1.remove();
            } else if (goal[i].equals(que2.peek())) {
                que2.remove();
            } else {
                answer = "No";
                break;
            }
        }
        
        return answer;
    }
}