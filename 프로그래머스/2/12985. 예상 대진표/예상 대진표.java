class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;
        int half = 0;

        while (true) {
            half = n / 2;
            
            if ((a <= half && b > half) || (b <= half && a > half)) {
                while (n > 1) {
                    n /= 2;
                    answer++;
                }
                break;
            } else {
                if ((a == b + 1) && (a % 2 == 0) || (b == a + 1) && (b % 2 == 0)) {
                    answer = 1;
                    break;
                } else {
                    if (a > half) {
                        a -= half;
                        b -= half;
                    }
                    n /= 2;
                }
            }
        }

        return answer;
    }
}