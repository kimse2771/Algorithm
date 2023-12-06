class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String str ="";
        for(int arr:array){
            str = String.valueOf(arr);
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)=='7'){
                    answer++;
                }
            }
        }
        
        return answer;
    }
}