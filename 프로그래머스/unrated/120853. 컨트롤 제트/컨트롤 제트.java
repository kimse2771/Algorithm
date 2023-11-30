import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] list = s.split(" ");
        Stack<Integer> stack = new Stack<>();
        
        for(String str : list){
            if(str.equals("Z")){
                stack.pop();
            }else{
                stack.push(Integer.parseInt(str));
            }
        }
        
        for(int i : stack){
            answer+=i;
        }

        return answer;
    }
}