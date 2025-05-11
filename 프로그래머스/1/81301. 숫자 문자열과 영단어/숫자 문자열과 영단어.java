class Solution {
    String answer;
    public int compare(char ch, int i, String s){
        switch(ch){
            case 'z' :
                answer += "0";
                return 3;
            case 'o' :
                answer += "1";
                return 2;
            case 'e' :
                answer += "8";
                return 4;
            case 'n' :
                answer += "9";
                return 3;
            case 't' :
                if(s.charAt(i+1)=='w'){
                    answer += "2";
                    return 2;
                }else{
                    answer += "3";
                    return 4;
                }
            case 'f' :
                if(s.charAt(i+1)=='o'){
                    answer += "4";
                    return 3;
                }else{
                    answer += "5";
                    return 3;
                }
            case 's' :
                if(s.charAt(i+1)=='i'){
                    answer += "6";
                    return 2;
                }else{
                    answer += "7";
                    return 4;
                }
        }
        return 0;
    }
    public int solution(String s) {
        answer = "";

        String temp = "";

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch>='a' && ch<='z'){
                int jump = compare(ch,i,s);
                i += jump;
            }else{
                answer += ch;
            }

        }

        return Integer.parseInt(answer);
    }
}