class Solution {
    static int answer = 0;
    
    public static void combination(int[] arr, boolean[] visited, int start, int depth, int r){
        if(depth == r){
            int sum = 0;
            
            for(int i=0; i<arr.length; i++){
                if(visited[i]) {
                    sum += arr[i];
                }
            }
            if (sum == 0) answer++;
            return;
        }
        for(int i=start; i<arr.length; i++){
            if(!visited[i]){
                visited[i] = true;
                combination(arr, visited, i+1, depth+1, r);
                visited[i] = false;
            }
        }
    }
    
    public int solution(int[] number) {
        int r = 3;
        combination(number, new boolean[number.length], 0, 0, r);
        
        return answer;
    }
}