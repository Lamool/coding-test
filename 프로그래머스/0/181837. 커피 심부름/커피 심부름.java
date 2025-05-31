class Solution {
    public int solution(String[] order) {
        int answer = 0;
        
        for (int i = 0; i < order.length; i++) {
            switch(order[i]) {
                case "iceamericano", "americanoice", 
                     "hotamericano", "americanohot",
                     "americano", "anything" :
                    answer += 4500;
                    break;
                case "icecafelatte", "cafelatteice",
                     "hotcafelatte", "cafelattehot", "cafelatte" :
                    answer += 5000;
                    break;
            }
        }
        
        return answer;
    }
}