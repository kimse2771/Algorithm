class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String str ="";
        for(int arr:array){
            str = String.valueOf(arr);
            answer+=str.length()-str.replace("7","").length();
        }
        
        return answer;
    }
}