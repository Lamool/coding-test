import java.util.LinkedHashMap;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
        
        LinkedHashMap<String, Integer> map1 = new LinkedHashMap<String, Integer>();
        
        for (int i = 0; i < clothes.length; i++) {
            if (map1.containsKey(clothes[i][1])) {
                map1.put(clothes[i][1], map1.get(clothes[i][1]) + 1);
            } else {
                map1.put(clothes[i][1], 1);
            }
        }
        
        // 첫 번째 키 가져오기
        String firstKey = map1.keySet().iterator().next();
        
        if (map1.size() == 1) {
            answer = map1.get(firstKey);
        } else {
            int num = 0;
            for (String str : map1.keySet()) {
                if (num == 0) {
                    answer = map1.get(str) + 1;
                    num++;
                } else {
                    answer *= map1.get(str) + 1;
                }
            }
            
            answer -= 1;
        }
        
        return answer;
    }
}