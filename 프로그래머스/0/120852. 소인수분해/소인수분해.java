import java.util.HashSet;
import java.util.Iterator;
import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        HashSet<Integer> hs = new HashSet<>();
        boolean tf = true;
        
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    tf = false;
                }
            }
            
            if (n % i == 0 && tf) {
                n /= i;
                hs.add(i);
            }
            tf = true;
        }
        
        int idx = 0;
        int[] answer = new int[hs.size()];
        Iterator iter = hs.iterator();
        
		while(iter.hasNext()) {
			answer[idx++] = (int)(iter.next());
		}
        
        Arrays.sort(answer);
        
        return answer;
    }
}