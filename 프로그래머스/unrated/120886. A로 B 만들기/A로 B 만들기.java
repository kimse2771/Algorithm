import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        char[] be = before.toCharArray();
        char[] af = after.toCharArray();
        
        Arrays.sort(be);
        Arrays.sort(af);
        
        for(int i=0;i<af.length;i++){
            if(be[i]!=af[i]){
                return 0;
            }
        }
        return answer;
    }
}