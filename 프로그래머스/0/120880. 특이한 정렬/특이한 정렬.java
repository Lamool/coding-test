import java.util.Arrays;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int length = numlist.length;
        int num = 0;
        
        int[] answer = new int[length];
        int[] arr2 = new int[length];
        
        for (int i = 0; i < length; i++) {
            num = numlist[i] - n;
            
            if (num < 0) {
                arr2[i] = num * (-1);
            } else {
                arr2[i] = num;
            }
        }
        
        Arrays.sort(arr2);
        
        for (int i = 0; i < length; i++) {
            num = numlist[i] - n;
            
            for (int j = 0; j < length; j++) {
                if (num == arr2[j]) {
                    answer[j] = num + n;
                    break;
                } else if ((num * (-1)) == arr2[j]) {
                    if (answer[j] == 0)
                        answer[j] = num + n;
                }
            }
        }
        
        return answer;
    }
}