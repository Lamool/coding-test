import java.util.HashMap;
import java.util.Collections;

class Solution {
    public int solution(String[] strArr) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < strArr.length; i++) {
            int length = strArr[i].length();                // 배열 원소의 길이 구하기
            
            if (hm.containsKey(length)) {                   // HashMap. 배열 원소의 길이가 key 값. 구한 길이가 key 값으로 존재하는지 확인
                hm.replace(length, hm.get(length) + 1);     // key 값과 일치하는 기존 value를 가져와 1을 더해주기. 더해준 값으로 수정.
            } else {                    // key 값 존재하지 않으면
                hm.put(length, 1);      // 새로운 길이 추가(key), value 1.
            }
        }
        
        int answer = Collections.max(hm.values());      // HashMap의 value 중 최댓값 찾기
        
        return answer;
    }
}