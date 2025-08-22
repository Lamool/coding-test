class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int coupon = chicken;
        int serviceChicken = 0;
        
        do {
            serviceChicken = coupon / 10;
            answer += coupon / 10;
            
            coupon %= 10;
            coupon += serviceChicken;
        } while(coupon >= 10);        
        
        return answer;
    }
}