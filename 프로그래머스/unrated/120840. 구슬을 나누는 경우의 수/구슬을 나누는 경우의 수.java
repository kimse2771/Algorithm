import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) {
        BigInteger top = BigInteger.valueOf(1);
        BigInteger bottom = BigInteger.valueOf(1);
        int answer = 1;
        
        if(balls==share){return answer;}
        for(int i=1;i<balls+1;i++){
            top=top.multiply(BigInteger.valueOf(i));
        }
        for(int i=1;i<(balls-share)+1;i++){
            bottom=bottom.multiply(BigInteger.valueOf(i));
        }
         for(int i=1;i<share+1;i++){
            bottom=bottom.multiply(BigInteger.valueOf(i));
        }
        answer = (top.divide(bottom)).intValue();
        
        
        return answer;
    }
}