class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int count = 0;
        
        int num1 = numer1;
        int den1 = denom1;
        int num2 = numer2;
        int den2 = denom2;
        
        num1 = numer1 * denom2;
        den1 = denom1 * denom2;
        
        num2 = numer2 * denom1;
        den2 = denom2 * denom1;
        
        num1 += num2;
        
        if (num1 < den1) {
            for (int i = num1; i >= 2; i--) {
                if (den1 % i == 0 && num1 % i == 0) {
                    num1 /= i;
                    den1 /= i;
                }
            }
            count = 1;
        } else if (num1 > den1 && count == 0) {
            for (int i = den1; i >= 2; i--) {
                if (den1 % i == 0 && num1 % i == 0) {
                    num1 /= i;
                    den1 /= i;
                }
            }
        } else if (num1 == den1 && count == 0) {
            num1 = 1;
            den1 = 1;
        }
        
        answer[0] = num1;
        answer[1] = den1;
        
        return answer;
    }
}