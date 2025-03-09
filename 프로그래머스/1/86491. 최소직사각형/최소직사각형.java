class Solution {
    public int solution(int[][] sizes) {
        int max = 0;        // 최댓값
        int num = 0;        // 최댓값2 또는 사이즈 적정값
        int index = -1;     // 최댓값이 중복인지를 알기 위해 최댓값을 가지고 있는 인덱스 선언
        int min = 0;        // 가로 세로 길이를 비교해서 작은 값을 담을 변수
        int answer = 0;
        
        // 최댓값을 구하기 위해 중첩 반복문 선언
        for (int i = 0; i < sizes.length; i++) {
            for (int j = 0; j < 2; j++) {
                if (max == 0) {             // 반복문 첫 실행이면
                    max = sizes[i][j];      // 최댓값에 첫 번째 값 대입
                    index = i;
                    continue;
                }
                
                if (max < sizes[i][j]) {    // 만약 배열의 값이 최댓값 보다 크다면
                    max = sizes[i][j];      // 최댓값에 배열의 값을 대입
                    index = i;              // 최댓값의 인덱스 대입
                } else if (max == sizes[i][j] && index == i) {  // 만약 배열의 값과 최댓값이 같고 최댓값의 index랑 현재 i의 값이 같다면
                    num = sizes[i][j];      // num에 배열의 값 대입
                }
            }   // for2 end
        }   // for end
        
        if (max == num) {         // 최댓값과 최댓값2(또는 사이즈 적정값)이 같다면 (True라면 두 수는 같은 값)
            return max * num;     // 곱한 값을 리턴
        } else {
            for (int i = 0; i < sizes.length; i++) {
                if (sizes[i][0] <= sizes[i][1]) {   // 가로 길이가 세로 길이 보다 작거나 같다면
                    min = sizes[i][0];              // min에 가로 길이 대입
                } else {                            // 세로 길이가 가로 길이 보다 작다면
                    min = sizes[i][1];              // min에 세로 길이 대입
                }
                
                if (i == 0) {           // 반복문 첫 실행이라면
                    num = min;          // (최댓값2 또는) 사이즈 적정값으로 쓰일 변수 num에 작은 값 대입
                    continue;
                } else {                // 반복문 첫 실행이 아니면
                    if (min > num) {
                        num = min;
                    }
                }
            }   // for end
        }
        
        return max * num;
    }
}