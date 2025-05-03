class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] str = binomial.split(" ");
        int num1, num2;
        
        num1 = Integer.valueOf(str[0]);
        num2 = Integer.valueOf(str[2]);
        
        switch (str[1]) {
            case "+":
                answer = num1 + num2;
                break;
            case "-":
                answer = num1 - num2;
                break;
            case "*":
                answer = num1 * num2;
                break;
        }
        
        // if (str[1] == "+") {
        //     answer = num1 + num2;
        // } else if (str[1] == "-") {
        //     answer = num1 - num2;
        // } else if (str[1] == "*") {
        //     answer = num1 * num2;
        // }
        
        return answer;
    }
}