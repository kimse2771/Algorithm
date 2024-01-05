import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[][] student = {
            {1, 2, 3,4,5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        int[] stdCnt=new int[3];
        
        for(int i=0;i<student.length;i++){
            for(int j=0;j<answers.length;j++){
                if(student[i][j%student[i].length]==answers[j]){
                    stdCnt[i]++;
                }
            }
        }
        
        int max=Math.max(stdCnt[0],Math.max(stdCnt[1],stdCnt[2]));
        
        List<Integer> list=new ArrayList<>();
        
        for(int i=0;i<3;i++){
            if(stdCnt[i]==max){
                list.add(i+1);
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i=0;i<list.size();i++){
            answer[i]=list.get(i);
        }
        
        
        
        
        return answer;
    }
}