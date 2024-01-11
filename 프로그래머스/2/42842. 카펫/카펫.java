class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int row =0;
        int temp=0;
        while(temp!=(brown-4)){
            row++;
            int num = yellow/row;
            temp=(yellow*4)-(2*(num-1)*row)-(2*num*(row-1));
            
        }
        answer[0]=(yellow/row)+2;
            answer[1]=row+2;
        
        return answer;
    }
}