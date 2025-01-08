class Solution {
    static int[] arr;
    static int[] output;
    static int N, R = 3;
    static int answer = 0;
    
    public int solution(int[] nums) {
        arr = nums;
        N = nums.length;
        output = new int[R];
        
		combination(0, 0, N, R);

        return answer;
    }
    
    // 조합
	static void combination(int start, int depth, int n, int r) {
		// 조합이 완성된 경우
		if(depth == r) {
            int num = 0;
            boolean tf = true;
            
            for (int i = 0; i < 3; i++) {
                num += output[i];
            }
            
            for (int i = 2; i <= num / 2 + 1; i++) {
                if (num % i == 0) {
                    tf = false;
                    break;
                }
            }
            
            if (tf) answer++;
            
			return;
		}
		
		for(int i = start; i < n; i++) {
			output[depth] = arr[i];
			combination(i + 1, depth + 1, n, r);
		}
	}
    
}