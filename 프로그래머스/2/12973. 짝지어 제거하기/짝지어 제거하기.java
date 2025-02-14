import java.util.Stack;

class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        
        Stack<String> stackInt = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            if (stackInt.isEmpty()) {
                stackInt.push(s.charAt(i) + "");
            } else {
                if ((stackInt.peek()).equals(s.charAt(i) + "")) {
                    stackInt.pop();
                } else {
                    stackInt.push(s.charAt(i) + "");
                }
            }
        }
        
        if (stackInt.isEmpty()) answer = 1;

        return answer;
    }
}