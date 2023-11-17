import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> set = new HashSet<>();
        
        int max = nums.length/2;
        
          for (int num : nums) {
             set.add(num);
            }
        if(max>set.size()){
            answer=set.size();
        }else{
            answer = max;
        }
        
        return answer;
    }
}