import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int min = 1000;
        int num = 0;
        
        Arrays.sort(array);
        
        for(int i=0;i<array.length;i++ ){
            if(n>array[i]){
                if(min>n-array[i]){min=n-array[i];
                                  num=i;}
                
            }
            else if(min>array[i]-n){min=array[i]-n;
                                   num=i;}
        }
        answer = array[num];
        return answer;
    }
}