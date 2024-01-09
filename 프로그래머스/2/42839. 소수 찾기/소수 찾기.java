import java.util.*;
class Solution {
    public int solution(String numbers) {
        int answer = 0;
        
        int[] numList = new int[10];
        String[] split = numbers.split("");
        int numSize=(int)Math.pow(10, numbers.length());
        
        for(String s : split){
            numList[Integer.parseInt(s)]++;
        }
        
        for(int i=2;i<numSize;i++){
            if(isChack(i)&&isContain(numList,i)){
                answer++;
            }
        }
        
        
        return answer;
    }
    
    private boolean isChack(int k){
        if(k==1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(k);i++){
            if(k%i==0){
                return false;
            }
        }
        return true;
    }
    
    private boolean isContain(int[] num, int k){
        int[] temp = num.clone();
        
        while(k>0){
            if (temp[k % 10] == 0) {
                return false;
            }
            temp[k%10]--;
            k/=10;
        }
        return true;
    }
}