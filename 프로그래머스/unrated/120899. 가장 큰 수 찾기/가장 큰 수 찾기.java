class Solution {
    public int[] solution(int[] array) {
        int max=0;
        int num=0;
        for(int i=0;i<array.length;i++){
            if(max<array[i]){
                max=array[i];
                num=i;
            }
        }
        int[] answer = {array[num],num};
        return answer;
    }
}