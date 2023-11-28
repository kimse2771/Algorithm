class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int num=0;
        for(int i =0;i<k-1;i++){
            if(num+2>=numbers.length){
                num=num+2-numbers.length;
            }else{
                num+=2;
            }
            answer=numbers[num];
        }
        
        return answer;
    }
}