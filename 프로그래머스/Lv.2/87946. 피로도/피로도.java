import java.util.*;
class Solution {
    int max =0;
    int answer = 0;
    boolean[] visited;
    public int solution(int k, int[][] dungeons) {
        
        visited = new boolean[dungeons.length];
        
        dfs(0,k,dungeons);

        return answer;
    }
    
    private void dfs(int depth,int k, int[][] dungeons){
        int temp=k;
        for(int i=0;i<dungeons.length;i++){
            if(!visited[i]&&temp>=dungeons[i][0]){
                visited[i]=true;
                dfs(depth+1,temp-dungeons[i][1],dungeons);
                visited[i]=false;
            }
           
            
        }
         answer =Math.max(answer,depth);
        
        
    }
}