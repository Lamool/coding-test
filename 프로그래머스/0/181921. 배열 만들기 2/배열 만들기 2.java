import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<>();
        String str = "";
        int tr = 0;
        
        for (int i = l; i <= r; i++) {
            str = l + "";
            char[] arr = str.toCharArray();
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] != '5' && arr[j] != '0') {
                    tr = 0;
                    break;
                }
                tr = 1;
            }
            if (tr == 1) list.add(l);
            tr = 0;
            l++;
        }
        
        if (list.size() == 0) list.add(-1);
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}