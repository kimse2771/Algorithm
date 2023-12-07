class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String number="";
        for(int i=0;i<my_string.length();i++){
        if(my_string.charAt(i)>=48&&my_string.charAt(i)<=57){
            if(i==my_string.length()-1){
                number+=my_string.charAt(i);
                answer+=Integer.parseInt(number);
            }
            number+=my_string.charAt(i);
            }
        else{
            if(number.length()>0){
                answer+=Integer.parseInt(number);
                number="";
            }    
            }
        }
        return answer;
    }
}