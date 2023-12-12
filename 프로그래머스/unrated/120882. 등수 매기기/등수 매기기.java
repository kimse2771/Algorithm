class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        float[] ave =new float[score.length];
        int cnt =0;
        for(int i=0;i<ave.length;i++)
        {
            ave[i]=(float)((score[i][0]+score[i][1])/2.0);
        }
        
        for(int i=0;i<ave.length;i++){
            cnt=0;
            for(int j=0;j<ave.length;j++){
                if(ave[i]<ave[j]){
                    cnt++;
                }
            }
            answer[i]=cnt+1;
            
        }
        return answer;
    }
}