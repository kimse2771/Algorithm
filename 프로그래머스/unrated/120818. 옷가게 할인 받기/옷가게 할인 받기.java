class Solution {
    public int solution(int price) {
        int answer = 0;
        double temp=0;
        answer = price;
        if(price>=100000&&price<300000){
            answer = (int)((double)price*0.95);
        }else if(price>=300000&&price<500000){
             answer = (int)((double)price*0.90);
        }else if(price>=500000){
             answer = (int)((double)price*0.80);
        }
        return answer;
    }
}