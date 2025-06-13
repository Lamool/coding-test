import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        int i;
        
        for (i = 0; i < arr.length; i++) {
            if (flag[i] == true) {
                for (count = 0; count < arr[i] * 2; count++) {
                    list.add(arr[i]);
                }
            } else {
                for (count = 0; count < arr[i]; count++) {
                    list.remove(list.size() - 1);
                }
            }
        }
        
        int[] answer = new int[list.size()];
        for (i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}