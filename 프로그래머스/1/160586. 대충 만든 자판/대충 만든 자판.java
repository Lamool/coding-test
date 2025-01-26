class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        for (int i = 0; i < targets.length; i++) {
            boolean tf = true;
            
            for (int j = 0; j < targets[i].length(); j++) {
                int min = -2;
                
                for (int k = 0; k < keymap.length; k++) {
                    int index = keymap[k].indexOf(targets[i].substring(j, j + 1));
                    
                    if (index != -1) {
                        if (min == -2) {
                            min = index;
                        } else {
                            if (min >= index) {
                                min = index;
                            }
                        }
                    }
                }
                
                if (min == -2) {
                    tf = false;
                    break;
                } else {
                    answer[i] += min + 1;
                }
            }
            
            if (!tf) {
                answer[i] = -1;
            }
        }
        
        return answer;
    }
}