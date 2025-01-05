import java.util.ArrayList;

class Solution {
    public String[] solution(String[] str_list) {
        String str = "";
        int idx = -1;
        ArrayList<String> list = new ArrayList<String>();
        
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l") || str_list[i].equals("r")) {
                idx = i;
                str = str_list[i];
                break;
            }
        }
        
        if (idx == -1) {
            String[] answer1 = {};
            return answer1;
        }
        
        if (str.equals("l")) {
            for (int i = 0; i < idx; i++) {
                list.add(str_list[i]);
            }
        } else if (str.equals("r")){
            for (int i = idx + 1; i < str_list.length; i++) {
                list.add(str_list[i]);
            }
        }
        
        String[] answer = new String[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}