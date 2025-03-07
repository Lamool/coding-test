import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < attendance.length; i++) {
            if (attendance[i]) {
                list.add(rank[i]);
            }
        }
        
        int[] arr = new int[list.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
        Arrays.sort(arr);
        
        int[] abc = new int[3];
        int idx = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < rank.length; j++) {
                if (arr[idx] == rank[j]) {
                    abc[i] = j;
                    break;
                }
            }
            idx++;
        }
        
        answer = 10000 * abc[0] + 100 * abc[1] + abc[2];
        
        return answer;
    }
}