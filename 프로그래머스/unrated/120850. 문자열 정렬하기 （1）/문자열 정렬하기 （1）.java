import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        my_string=my_string.replaceAll("[a-z]","");
        String[] arr = my_string.split("");
        int[] answer = new int[my_string.length()];
        for(int i=0;i<my_string.length();i++){
            answer[i]=Integer.parseInt(arr[i]);
            
        }
        Arrays.sort(answer);
        return answer;
    }
}