import java.util.ArrayList;

class Solution {
    public String[] solution(String[] picture, int k) {
        ArrayList<String> list = new ArrayList<>();
        
        for (int i = 0; i < picture.length; i++) {
            for (int j = 0; j < k; j++) {
                String str = "";
                
                for (int l = 0; l < picture[i].length(); l++) {
                    for (int m = 0; m < k; m++) {
                        str += picture[i].charAt(l);
                    }
                }
                
                list.add(str);
            }
        }
        
        String[] answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}