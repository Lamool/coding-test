class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for (int i = 0; i < quiz.length; i++) {
            String[] arr = quiz[i].split(" ");
            
            if (arr[1].equals("+")) {   // 연산자가 "+"인 경우
                if (Integer.valueOf(arr[0]) + Integer.valueOf(arr[2]) == Integer.valueOf(arr[4])) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            } else {    // 연산자가 "-"인 경우
                if (Integer.valueOf(arr[0]) - Integer.valueOf(arr[2]) == Integer.valueOf(arr[4])) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
        }
        
        return answer;
    }
}