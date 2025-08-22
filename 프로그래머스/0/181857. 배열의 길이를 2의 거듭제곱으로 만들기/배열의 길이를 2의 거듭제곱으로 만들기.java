import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        int length = arr.length;                // 배열의 길이를 구한다
        
        //if (length < 2) return arr;
        
        int[] squareOf2 = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < squareOf2.length; i++) {
            if (squareOf2[i] == length) {
                return arr;
            } else if (squareOf2[i] > length) {
                for (int element : arr) {
                    list.add(element);
                }
                
                while (squareOf2[i] > list.size()) {
                    list.add(0);
                }
                
                break;
            }
        }
        
        int[] answer = new int[list.size()];
        for (int j = 0; j < answer.length; j++) {
            answer[j] = list.get(j);
        }
        
        return answer;
    }
}