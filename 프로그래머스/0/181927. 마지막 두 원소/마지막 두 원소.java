class Solution {
    public int[] solution(int[] num_list) {        
        int[] answer = new int[num_list.length + 1];
        
        for (int i = 0; i < num_list.length + 1; i++) {
            if (i == num_list.length) {
                if (num_list[i - 1] > num_list[i - 2]) {
                    answer[i] = num_list[i - 1] - num_list[i - 2];
                } else {
                    answer[i] = num_list[i - 1] * 2;
                }
                continue;
            }
            answer[i] = num_list[i];
        }
        return answer;
    }
}