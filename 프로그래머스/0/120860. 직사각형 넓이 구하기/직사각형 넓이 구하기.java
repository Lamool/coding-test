class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int width = 0;
        int height = 0;
        int dotsx = dots[0][0];
        int dotsy = dots[0][1];
        
        for (int i = 1; i < dots.length; i++) {
            if (dotsx == dots[i][0]) height = dots[i][1] - dotsy;
            if (dotsy == dots[i][1]) width = dots[i][0] - dotsx;
        }
        answer = width * height;
        
        if (answer < 0) answer *= -1;
        
        return answer;
    }
}