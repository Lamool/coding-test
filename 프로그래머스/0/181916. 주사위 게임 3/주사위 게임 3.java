class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int min = 7;
        
        // 1
        if (a == b && a == c && a == d) {
            answer = 1111 * a;
        }
        
        // 2
        else if (a != b && b == c && b == d) {
            answer = (10 * b + a) * (10 * b + a);
        } else if (a != b && a == c && a == d) {
            answer = (10 * a + b) * (10 * a + b);
        } else if (a == b && a != c && a == d) {
            answer = (10 * a + c) * (10 * a + c);
        } else if (a == b && a == c && a != d) {
            answer = (10 * a + d) * (10 * a + d);
        }
        
        // 3
        else if (a == b && a != c && c == d) {
            answer = (a + c) * Math.abs(a - c);
        } else if (a == c && a != b && b == d) {
            answer = (a + b) * Math.abs(a - b);
        } else if (a == d && a != b && b == c) {
            answer = (a + b) * Math.abs(a - b);
        }
        
        // 4
        else if (a == b && a != c && a != d) {
            answer = c * d;
        } else if (a == c && a != b && a != d) {
            answer = b * d;
        } else if (a == d && a != b && a != c) {
            answer = b * c;
        }
        
        else if (b == a && b != c && b != d) {
            answer = c * d;
        } else if (b == c && a != b && b != d) {
            answer = a * d;
        } else if (b == d && a != b && b != c) {
            answer = a * c;
        }
        
        else if (c == a && b != c && c != d) {
            answer = b * d;
        } else if (c == b && a != c && c != d) {
            answer = a * d;
        } else if (c == d && c != a && c != b) {
            answer = a * b;
        }
        
        // 5
        else if (a != b && a != c && a != d && c != d) {
            if (min > a) min = a;
            if (min > b) min = b;
            if (min > c) min = c;
            if (min > d) min = d;
            
            answer = min;
        }
        
        return answer;
    }
}