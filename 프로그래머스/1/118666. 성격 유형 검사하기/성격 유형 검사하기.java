import java.util.HashMap;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        int score = 0;
        String type = "";
        
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("R", 0);
        hm.put("T", 0);
        hm.put("C", 0);
        hm.put("F", 0);
        hm.put("J", 0);
        hm.put("M", 0);
        hm.put("A", 0);
        hm.put("N", 0);
        
        for (int i = 0; i < choices.length; i++) {
            if (choices[i] == 4) {          // 모르겠음
                continue;
            } else if (choices[i] <= 3) {   // 매우 비동의 ~ 약간 비동의
                type = survey[i].charAt(0) + "";
                
                // 부여해야 하는 점수 구하기
                if (choices[i] == 1) {
                    score = 3;
                } else if (choices[i] == 2) {
                    score = 2;
                } else {
                    score = 1;
                }
                
                hm.replace(type, hm.get(type) + score);
            } else {                        // 약간 동의 ~ 매우 동의
                type = survey[i].charAt(1) + "";
                
                // 부여해야 하는 점수 구하기
                if (choices[i] == 5) {
                    score = 1;
                } else if (choices[i] == 6) {
                    score = 2;
                } else {
                    score = 3;
                }
                
                hm.replace(type, hm.get(type) + score);
            }
        }
        
        // R / T 형 구하기
        if (hm.get("R") >= hm.get("T")) {
            answer += "R";
        } else {
            answer += "T";
        }
            
        // C / F 형 구하기
        if (hm.get("C") >= hm.get("F")) {
            answer += "C";
        } else {
            answer += "F";
        }
            
        // J / M 형 구하기
        if (hm.get("J") >= hm.get("M")) {
            answer += "J";
        } else {
            answer += "M";
        }
        
        // A / N 형 구하기
        if (hm.get("A") >= hm.get("N")) {
            answer += "A";
        } else {
            answer += "N";
        }
        
        return answer;
    }
}