class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] list = s.split(" ");
        int len = list.length;
        for(int i=0;i<len;i++){
            
            if(!list[i].equals("Z")){
                if(i==len-1){
                    answer+=Integer.parseInt(list[i]);
                }else{
                if(!list[i+1].equals("Z")){
                    answer+=Integer.parseInt(list[i]);
                }
                }
            }
        }
        return answer;
    }
}