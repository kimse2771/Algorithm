class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        int pizza = slice;
        while(pizza/n==0){
            pizza+=slice;
        }
        answer=pizza/slice;
        return answer;
    }
}