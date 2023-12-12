import java.util.*;
class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String num ="";
        for(int a=i;a<=j;a++){
           num= String.valueOf(a);
            for(int b=0;b<num.length();b++){
                if(k==Character.getNumericValue(num.charAt(b))){
                    answer++;
                }
            }
        }
        
        return answer;
    }
}