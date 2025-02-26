class Solution {
    public String solution(String polynomial) {
        String answer = "";
        
        String[] str = polynomial.split(" ");
        int coefficient = 0;
        int num = 0;
        
        for (int i = 0; i < str.length; i++) {
            if (str[i].contains("x")) {
                if (str[i].length() == 1) {
                    coefficient += 1;
                } else {
                    int idx = str[i].indexOf("x");
                    
                    coefficient += Integer.valueOf(str[i].substring(0, idx));
                }
            } else if (!str[i].equals("+")) {
                num += Integer.valueOf(str[i]);
            }
        }
        
        if (coefficient > 1) {
            answer = coefficient + "x";
        } else if (coefficient == 1) {
            answer = "x";
        } else {
            return num + "";
        }
        
        if (num != 0) {
            answer += " + " + num;
        }
        
        return answer;
    }
}