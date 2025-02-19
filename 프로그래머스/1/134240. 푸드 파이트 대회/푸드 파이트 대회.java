class Solution {
    public String solution(int[] food) {
        StringBuffer answer = new StringBuffer("a");
        
        for (int i = 0; i < food.length; i++) {
            if (food[i] >= 2) {
                String str = "";
                for (int j = 0; j < food[i] / 2; j++) {
                    str += i;
                }
                answer.insert(answer.indexOf("a"), str);
                answer.insert(answer.indexOf("a") + 1, str);
            }
        }
        
        String result = answer.toString();
        result = result.replace("a", "0");
        
        return result;
    }
}