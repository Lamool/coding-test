import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashMap<String, ArrayList<String>> hash1 = new HashMap<String, ArrayList<String>>();
        
        Arrays.sort(phone_book);    // phone_book 배열 정렬
        
        for (int i = 0; i < phone_book.length; i++) {
            String str = phone_book[i].substring(0, 1);    // 맨 앞 숫자만 자르기
            
            if (hash1.containsKey(str)) {
                hash1.get(str).add(phone_book[i]);
            } else {
                hash1.put(str, new ArrayList<>());
                hash1.get(str).add(phone_book[i]);
            }
        }
        
        Set<String> keys = hash1.keySet();
        
        for (String key : keys) {
            ArrayList<String> values = hash1.get(key);
            
            if (values.size() > 1) {
                for (int i = 1; i < values.size(); i++) {
                    int length = values.get(i - 1).length();
                    if (values.get(i).length() >= length) {
                        if (values.get(i).substring(0, length).equals(values.get(i - 1))) {
                            return false;
                        }
                    }
                }
            }
        }
        
        return answer;
    }
}