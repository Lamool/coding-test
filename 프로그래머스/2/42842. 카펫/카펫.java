class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int width = 0;      // 노란색 가로 길이 임시
        int count = 0;
        
        if (yellow == 1) {
            count = 1;
        } else {
            count = yellow / 2;
        }
        
        for (int i = 1; i <= count; i++) {
            if (yellow % i == 0) {      // i가 yellow의 약수라면
                width = yellow / i;
                int sum = width * 2 + i * 2 + 4;
                
                if (brown == sum) {
                    answer[0] = width + 2;
                    answer[1] = i + 2;
                    break;
                }
            }
        }
        
        return answer;
    }
}