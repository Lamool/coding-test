class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        int turn = 1;
        boolean tf = false;

        for (int i = 1; i < words.length; i++) {
            if (i % n == 0) turn++;
            
            String str = words[i - 1];
            
            if (words[i - 1].charAt(str.length() - 1) != words[i].charAt(0)) {
                answer[0] = i % n + 1;
                break;
            }
            
            for (int j = 0; j < i; j++) {
                if (words[i].equals(words[j])) {
                    answer[0] = i % n + 1;
                    tf = true;
                }
            }
            
            if (tf) break;
        }
        
        if (answer[0] != 0)
            answer[1] = turn;

        return answer;
    }
}