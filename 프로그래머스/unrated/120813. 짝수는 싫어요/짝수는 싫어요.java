class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        
        int num =0;
        if(n%2==0){
            num=n/2;
        }else{
            num=(n/2)+1;
        }
        answer=new int[num];
        num=0;
        for(int i=1;i<n+1;i++){
            if(i%2!=0){
                answer[num]=i;
                num++;
            }
            
        }
        
        return answer;
    }
}