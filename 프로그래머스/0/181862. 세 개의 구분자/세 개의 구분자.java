import java.util.ArrayList;

class Solution {
    public String[] solution(String myStr) {
        String[] str = myStr.split("a|b|c");
        ArrayList<String> list = new ArrayList<>();
        
        for (int i = 0; i < str.length; i++) {
            if (!str[i].equals("")) {
                list.add(str[i]);
            }
        }
        
        String[] answer = new String[list.size()];
        
        if (list.size() > 0) {
            answer = new String[list.size()];
            for (int i = 0; i < answer.length; i++) {
                answer[i] = list.get(i);
            }
        } else {
            answer = new String[1];
            answer[0] = "EMPTY";
        }
        
        return answer;
    }
}