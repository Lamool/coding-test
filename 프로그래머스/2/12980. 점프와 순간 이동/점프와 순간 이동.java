import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;
        
        if (n % 2 == 1) {
            n -= 1;
            ans++;
        }
        
        while (n > 0) {
            n /= 2;
                
            if (n % 2 == 1) {
                n -= 1;
                ans++;
            }
        }        

        return ans;
    }
}