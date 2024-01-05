import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        
        
        List<Integer> student1= new LinkedList<>(Arrays.asList(1, 2, 3,4,5));
        List<Integer> student2= new LinkedList<>(Arrays.asList(2, 1, 2, 3, 2, 4, 2, 5));
        List<Integer> student3= new LinkedList<>(Arrays.asList(3, 3, 1, 1, 2, 2, 4, 4, 5, 5));
            
        
        int[] std1 ={1,2,3,4,5};
        int[] std2 ={2, 1, 2, 3, 2, 4, 2, 5};
        int[] std3={3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int temp=(answers.length/std1.length)+(answers.length%std1.length)*1;
        
        for(int i=0;i<temp;i++){
            for(int s:std1){
                student1.add(s);
            }
        }
        
        temp=(answers.length/std2.length)+(answers.length%std2.length)*1;
        
        for(int i=0;i<temp;i++){
            for(int s:std2){
                student2.add(s);
            }
        }
        
        temp=(answers.length/std3.length)+(answers.length%std3.length)*1;
        
        for(int i=0;i<temp;i++){
            for(int s:std3){
                student3.add(s);
            }
        }
        List<Integer> stdAns=new ArrayList<>();
        int[] stdCnt=new int[3];
        
        for(int i =0;i<answers.length;i++){
            if(answers[i]==student1.get(i)){
                stdCnt[0]++;
            }
            if(answers[i]==student2.get(i)){
                stdCnt[1]++;
            }
            if(answers[i]==student3.get(i)){
                stdCnt[2]++;
            }
        }
        
        int max=0;
        
        for(int s : stdCnt){
            if(max<s){
                max=s;
            }
        }
        
        for(int i=0;i<3;i++){
            if(max==stdCnt[i]){
                stdAns.add(i+1);
            }
        }
        
        int[] answer = new int[stdAns.size()];
        for(int i=0;i<stdAns.size();i++){
            answer[i]=stdAns.get(i);
        }
        
        
        
        
        return answer;
    }
}