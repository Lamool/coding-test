import java.util.ArrayList;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for (int i = 0; i < privacies.length; i++) {
            char type = privacies[i].charAt(11);        // 약관종류 구하기
            int expiry = 0;         // 유효기간을 저장할 변수
            String keep = "";       // 보관일을 저장할 변수
            
            int year = Integer.valueOf(privacies[i].substring(0, 4));    // 년도에 해당하는 부분만 자르기
            int month = Integer.valueOf(privacies[i].substring(5, 7));   // 월에 해당하는 부분만 자르기
            int day = Integer.valueOf(privacies[i].substring(8, 10));    // 일에 해당하는 부분만 자르기
            
            for (int j = 0; j < terms.length; j++) {        // 약관종류에 따른 유효기간 구하기
                if (terms[j].charAt(0) == type) {
                    expiry = Integer.valueOf(terms[j].substring(2));
                }
            }
            
            month += expiry;        // 수집월에다 유효기간 더하기
            
            while (month > 12) {
                month -= 12;
                year += 1;
            }
            
            // 수집기간 + 유효기간 한 후 하루 전 날까지가 보관 가능일
            if (day == 1) {                 // 1일이면
                day = 28;                   // 28일로 변경
                
                if (month == 1) {           // 월 - 1도 해줘야 하는데 1월이면
                    month = 12;             // 12월로 변경
                    
                    year -= 1;          // 년도 - 1
                } else {
                    month -= 1;             // 월 - 1
                }
            } else {
                day -= 1;                   // 일 - 1
            }
            
            // 이 날짜까지 보관 가능
            keep = year + "." + (month < 10 ? "0" + month : month) + "." + (day < 10 ? "0" + day : day);
            
            if (today.compareTo(keep) > 0) {
                list.add(i + 1);
            }
        }        
        
        int[] answer = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}