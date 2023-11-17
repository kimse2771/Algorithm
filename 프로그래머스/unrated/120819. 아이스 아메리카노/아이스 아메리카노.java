class Solution {
    public int[] solution(int money) {
        
        int americano=5500;
        int cup = 0;
        int changes =0;
        
        cup = money/americano;
        changes=money%americano;
        int[] answer = {cup,changes};
        
        return answer;
    }
}