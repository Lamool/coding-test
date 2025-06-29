import java.util.ArrayList;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String str = "";
        char[] arr = my_string.toCharArray();
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 48 && arr[i] <= 57) {
                if (i != 0 && arr[i - 1] >= 48 && arr[i - 1] <= 57) {
                    str = list.get(list.size() - 1) + "" + (arr[i] - '0');
                    list.remove(list.size() - 1);
                    list.add(Integer.parseInt(str));
                } else {
                    list.add(arr[i] - '0');
                }
            }
        }
        
        for (int i = 0; i < list.size(); i++) {
            answer += list.get(i);
        }
        
        return answer;
    }
}