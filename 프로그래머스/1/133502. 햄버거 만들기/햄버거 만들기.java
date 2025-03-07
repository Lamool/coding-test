import java.util.Stack;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> st = new Stack<>();
        
        for (int i = 0; i < ingredient.length; i++) {
            if (i >= 3) {   // 햄버거 만드려면 재료가 4개 필요해서
                if (ingredient[i] == 1) {           // 1) 재료가 빵이라면
                    if (!st.isEmpty() && st.peek() == 3) {           // 2) 재료가 고기라면
                        st.pop();
                        
                        if (!st.isEmpty() && st.peek() == 2) {       // 3) 재료가 야채라면
                            st.pop();
                        
                            if (!st.isEmpty() && st.peek() == 1) {   // 4) 재료가 빵이라면
                                st.pop();
                                answer++;
                            } else {                // 4) 재료가 빵이 아니라면
                                // 스택에서 뺀 지금까지의 재료들과 새로운 재료 순서에 맞춰 다시 스택에 push
                                st.push(2);
                                st.push(3);
                                st.push(1);
                            }
                        } else {    // 3) 재료가 야채가 아니라면
                            // 스택에서 뺀 지금까지의 재료들과 새로운 재료 순서에 맞춰 다시 스택에 push
                            st.push(3);
                            st.push(1);
                        }
                    } else {        // 2) 재료가 고기가 아니라면
                        st.push(1);
                    }
                } else {            // 1) 재료가 빵이 아니라면
                    st.push(ingredient[i]);
                }
            } else {
                st.push(ingredient[i]);
            }
        }   // for end
        
        return answer;
    }
}