import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < tangerine.length; i++) {
            if (hm.containsKey(tangerine[i])) {
                hm.replace(tangerine[i], hm.get(tangerine[i]) + 1);
            } else {
                hm.put(tangerine[i], 1);
            }
        }
        
        List<Integer> keySet = new ArrayList<>(hm.keySet());

        // Value 값으로 오름차순 정렬
        keySet.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return hm.get(o1).compareTo(hm.get(o2));
            }
        });
        
        for (int i = keySet.size() - 1; i >= 0; i--) {
            answer++;
            k -= hm.get(keySet.get(i));
            if (k <= 0) break;
        }
        
        return answer;
    }
}