import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i != j) {
                    list.add(numbers[i] + numbers[j]);
                }
            }
        }
        
        Set<Integer> set = new HashSet<Integer>(list);
        List<Integer> newList = new ArrayList<Integer>(set);
        int[] answer = new int[newList.size()];
        
        for (int i = 0; i < newList.size(); i++) {
            answer[i] = newList.get(i);
        }
        
        Arrays.sort(answer);        
        
        return answer;
    }
}