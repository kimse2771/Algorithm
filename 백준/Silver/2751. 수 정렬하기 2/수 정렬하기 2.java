import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        StringBuilder sb = new StringBuilder();
      
        List<Integer> arr = new ArrayList<>();      
        
        for(int i=0;i<n;i++){
            arr.add(s.nextInt());
        }
        
        Collections.sort(arr);
        
        
        for(Integer c : arr){
            sb.append(c).append("\n");
        }
        System.out.println(sb);
        
        
    }
        
}