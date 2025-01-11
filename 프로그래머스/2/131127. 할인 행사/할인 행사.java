class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int numberSum = 0;
        
        // number 원소의 합
        for (int i = 0; i < number.length; i++) {
            numberSum += number[i];
        }
        
        for (int i = 0; i <= discount.length - numberSum; i++) {
            int[] number2 = new int[number.length];
            boolean tf = true;
            
            for (int j = 0; j < number.length; j++) {       // 배열 값 복사
                number2[j] = number[j];
            }
            
            for (int j = i; j < i + 10; j++) {
                for (int k = 0; k < want.length; k++) {
                    if (discount[j].equals(want[k])) {      // 현재 할인하는 제품이 want 배열에 있는지 찾기
                        if (number2[k] > 0) {
                            tf = true;
                            number2[k] -= 1;
                            break;
                        } else {
                            tf = false;
                            break;
                        }
                    } else {
                        tf = false;
                    }
                }
                
                if (!tf) break;
            }
            
            for (int j = 0; j < number.length; j++) {
                if (number2[j] != 0) {
                    tf = false;
                }
            }
            
            if (tf) answer++;
        }
        
        return answer;
    }
}