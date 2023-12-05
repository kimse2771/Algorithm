class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int temp =0;
        String[] str={};
        for(int i=0;i<quiz.length;i++){
            str=quiz[i].split(" ");
            if(str[1].equals("+")){
                temp=Integer.parseInt(str[0])+Integer.parseInt(str[2]);
            }else{
                temp=Integer.parseInt(str[0])-Integer.parseInt(str[2]);
            }
            if(temp==Integer.parseInt(str[4])){
                answer[i]="O";
            }else
            {
                answer[i]="X";
            }
        }
        return answer;
    }
}