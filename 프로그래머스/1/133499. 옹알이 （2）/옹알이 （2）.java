class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String str = "";
        
        for (int i = 0; i < babbling.length; i++) {
            String strPrev = "";
            str = babbling[i];
            
            while (str.length() > 1) {
                if (str.startsWith("aya") && !strPrev.equals("aya")) {
                    strPrev = "aya";
                    str = str.substring(3);
                } else if (str.startsWith("ye") && !strPrev.equals("ye")) {
                    strPrev = "ye";
                    str = str.substring(2);
                } else if (str.startsWith("woo") && !strPrev.equals("woo")) {
                    strPrev = "woo";
                    str = str.substring(3);
                } else if (str.startsWith("ma") && !strPrev.equals("ma")) {
                    strPrev = "ma";
                    str = str.substring(2);
                } else {                    
                    break;
                }
            }
            
            if (str.equals("")) {
                answer++;
            }
        }
        
        return answer;
    }
}