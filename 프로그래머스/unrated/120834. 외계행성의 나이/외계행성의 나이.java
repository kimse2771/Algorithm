class Solution {
    public String solution(int age) {
        String answer = "";
        String ageString = Integer.toString(age);
        for(int i=0;i<ageString.length();i++){
            char ch = (char)((int)ageString.charAt(i)-'0'+97);
            answer+=String.valueOf(ch);
        }
        
        return answer;
    }
}