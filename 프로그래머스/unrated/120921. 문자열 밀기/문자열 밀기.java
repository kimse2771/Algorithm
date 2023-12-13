class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        String word = A;
        String last = "";
        String c = "";
        for(int i=0;i<A.length();i++){
            if(word.equals(B)){
                return answer;
            }else{
            last = word.substring(A.length()-1);
            word=last+word.substring(0, A.length()-1);
            
            answer++;
   
            }
        }answer = -1;
        
        return answer;
    }
}