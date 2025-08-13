using System;

public class Solution {
    public string solution(string myString) {
        string answer = "";
        
        char[] arr = myString.ToCharArray();
        
        for (int i = 0; i < arr.Length; i++) {
            if (arr[i] == 65) {
                answer += arr[i];
                continue;
            }
            else if (arr[i] == 'a') arr[i] = (char)(arr[i] - 32);
            else if (arr[i] >= 65 && arr[i] <= 90) arr[i] = (char)(arr[i] + 32);
            
            answer += arr[i];
        }
        
        return answer;
    }
}