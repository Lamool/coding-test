class Solution {
    public String solution(int age) {
        String answer = age + "";
        String answer1 = "";
        char[] arr = answer.toCharArray();
        
        for (int i = 0; i < arr.length; i++) {
            answer1 += (char)(arr[i] + 49);
        }
        
        return answer1;
    }
}