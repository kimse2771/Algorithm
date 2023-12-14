import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> que = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        int progress=0;
        int maxDay=0;
        int cnt=0;
        for(int i=0;i<progresses.length;i++){
            progress=100-progresses[i];
            if(progress%speeds[i]==0){
                que.add(progress/speeds[i]);
            }else{
                que.add((progress/speeds[i])+1);
            }
            
        }
	        int first = que.poll();
	        maxDay=first;
            cnt++;
        while(!que.isEmpty()){
            first= que.poll();
            if(maxDay<first){
                maxDay=first;
                list.add(cnt);
                cnt=1;
            }else{
                cnt++;
            }
            
        }
        list.add(cnt);
        
        int[] answer= list.stream().mapToInt(Integer::intValue).toArray();

        
        return answer;
    }
}