class Solution {
    public String solution(int a, int b) {
        String answer = "";
        
        b %= 7;
        
        if ((a == 1) || (a == 4) || (a == 7)) {
            if (b == 1) {
                answer = "FRI";
            } else if (b == 2) {
                answer = "SAT";
            } else if (b == 3) {
                answer = "SUN";
            } else if (b == 4) {
                answer = "MON";
            } else if (b == 5) {
                answer = "TUE";
            } else if (b == 6) {
                answer = "WED";
            } else if (b == 0) {
                answer = "THU";
            }
        } else if ((a == 2) || (a == 8)) {
            if (b == 1) {
                answer = "MON";
            } else if (b == 2) {
                answer = "TUE";
            } else if (b == 3) {
                answer = "WED";
            } else if (b == 4) {
                answer = "THU";
            } else if (b == 5) {
                answer = "FRI";
            } else if (b == 6) {
                answer = "S";
            } else if (b == 0) {
                answer = "SUN";
            }
        } else if ((a == 3) || (a == 11)) {
            if (b == 1) {
                answer = "TUE";
            } else if (b == 2) {
                answer = "WED";
            } else if (b == 3) {
                answer = "THU";
            } else if (b == 4) {
                answer = "FRI";
            } else if (b == 5) {
                answer = "SAT";
            } else if (b == 6) {
                answer = "SUN";
            } else if (b == 0) {
                answer = "MON";
            }
        } else if (a == 5) {
            if (b == 1) {
                answer = "SUN";
            } else if (b == 2) {
                answer = "MON";
            } else if (b == 3) {
                answer = "TUE";
            } else if (b == 4) {
                answer = "WED";
            } else if (b == 5) {
                answer = "THU";
            } else if (b == 6) {
                answer = "FRI";
            } else if (b == 0) {
                answer = "SAT";
            }
        } else if (a == 6) {
            if (b == 1) {
                answer = "WED";
            } else if (b == 2) {
                answer = "THU";
            } else if (b == 3) {
                answer = "FRI";
            } else if (b == 4) {
                answer = "SAT";
            } else if (b == 5) {
                answer = "SUN";
            } else if (b == 6) {
                answer = "MON";
            } else if (b == 0) {
                answer = "TUE";
            }
        } else if ((a == 9) || (a == 12)) {
            if (b == 1) {
                answer = "THU";
            } else if (b == 2) {
                answer = "FRI";
            } else if (b == 3) {
                answer = "SAT";
            } else if (b == 4) {
                answer = "SUN";
            } else if (b == 5) {
                answer = "MON";
            } else if (b == 6) {
                answer = "TUE";
            } else if (b == 0) {
                answer = "WED";
            }
        } else if (a == 10) {
            if (b == 1) {
                answer = "SAT";
            } else if (b == 2) {
                answer = "SUN";
            } else if (b == 3) {
                answer = "MON";
            } else if (b == 4) {
                answer = "TUE";
            } else if (b == 5) {
                answer = "WED";
            } else if (b == 6) {
                answer = "THU";
            } else if (b == 0) {
                answer = "FRI";
            }
        }
        
        return answer;
    }
}