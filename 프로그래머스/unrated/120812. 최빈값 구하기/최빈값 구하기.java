import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int temp =0;
        int max=0;
        Arrays.sort(array);
        int arrNum=array[array.length-1];
        int []frequent=new int[arrNum+1];
        
        for(int i=0;i<array.length;i++){
            frequent[array[i]]++;
            if(max<frequent[array[i]]){
                max = frequent[array[i]];
                answer=array[i];
            }
            
        }
        
        for(int i=0;i<frequent.length;i++){
            if(frequent[i]==max){
                temp++;  
              
            }
        }
        
        if(temp>1){
            answer =-1;
        }
        
        
        return answer;
    }
}