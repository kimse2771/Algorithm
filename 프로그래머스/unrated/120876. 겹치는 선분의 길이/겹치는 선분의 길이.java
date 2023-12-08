class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] check = new int[200];
        for(int[] line : lines){
              for(int i=line[0]+100;i<line[1]+100;i++){
                  check[i]++;
              }
        }
        
        for(int i=0;i<check.length;i++){
            if(check[i]>1){
                answer++;
            }
        }
        
        return answer;
    }
}