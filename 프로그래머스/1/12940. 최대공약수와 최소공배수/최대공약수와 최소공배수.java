class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {};
        int min, max;
        int gcd = 1;    // 최대공약수
        int lcm = 1;    // 최소공배수
        int count = 1;
        
        if (n == m) {   // 만약 두 수가 같다면
            answer = new int[] {n, m};
            return answer;
        } else if (n > m) {
            max = n;
            min = m;
        } else {
            max = m;
            min = n;
        }
        
        for (int i = 2; i <= min; i++) {    // 최대공약수 구하기
            if (min % i == 0 && max % i == 0) {
                gcd = i;
            }
        }
        
        while (true) {      // 최소공배수 구하기
            if ((max * count) % min == 0) {
                lcm = max * count;
                break;
            }
            count++;
        }
        
        answer = new int[] {gcd, lcm};
        
        return answer;
    }
}