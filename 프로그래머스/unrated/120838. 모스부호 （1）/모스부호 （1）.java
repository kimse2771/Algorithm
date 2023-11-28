class Solution {
    public String solution(String letter) {
        String[] lesp= letter.split(" ");
        String answer = "";
        String[] morse = { 
            ".-","-...","-.-.","-..",".","..-.",
            "--.","....","..",".---","-.-",".-..",
            "--","-.","---",".--.","--.-",".-.",
            "...","-","..-","...-",".--","-..-",
            "-.--","--.."};
        
        int ascii=97;
        for(String alphabet : lesp){
            for(int i=0;i<morse.length;i++){
                if(morse[i].equals(alphabet)){
                    answer+=(char)(ascii+i);                  
                }
            }
        }
        
        
        return answer;
    }
}