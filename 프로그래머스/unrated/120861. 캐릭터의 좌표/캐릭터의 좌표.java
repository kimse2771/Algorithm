class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int x=0;
        int y=0;
        
        int[] answer = new int[2];
        
        for(String key : keyinput){
	        if(key.equals("up")&&y<board[1]/2)y++;
	        else if(key.equals("down")&&y>-board[1]/2)y--;
	        else if(key.equals("left")&&x>-board[0]/2)x--;
	        else if(key.equals("right")&&x<board[0]/2)x++;
        }
        
  
        answer[0]=x;
        answer[1]=y;
        
        return answer;
    }
}