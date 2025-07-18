class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = 0;
        int sum = 0;
        int count = 0;
        
        // 가장 큰 수 찾기
        for (int i = 0; i < 3; i++) {
            if (max < sides[i]) max = sides[i];
        }
        
        for (int i = 0; i < 3; i++) {
            if (max == sides[i]) count++;
        }
        
        for (int i = 0; i < 3; i++) {
            if (max != sides[i]) sum += sides[i];
        }
        
        if (count == 2) sum += max;
        
        if (max < sum) answer = 1;
        else answer = 2;
        
        // 정삼각형의 경우
        if (sides[0] == sides[1] && sides[1] == sides[2]) answer = 1;
        
        return answer;
    }
}