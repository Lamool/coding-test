import java.util.ArrayList;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < numbers.length; i++) {
            list.add(numbers[i]);
        }
        
        if (direction.equals("right")) {
            list.add(0, numbers[numbers.length - 1]);
            list.remove(list.size() - 1);
        } else {
            list.add(numbers[0]);
            list.remove(0);
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}