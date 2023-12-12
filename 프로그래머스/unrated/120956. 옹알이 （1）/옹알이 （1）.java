class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String str ="";
        
        for(String word : babbling){
            
            str=word;
            str = str.replace("aya","-");
            str = str.replace("ye","-");
            str = str.replace("woo","-");
            str = str.replace("ma","-");
            
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)!='-'){
                    break;
                }
                if(i==str.length()-1){
                    answer++;
                }
                
            }
         
        }
        
        return answer;
    }
}