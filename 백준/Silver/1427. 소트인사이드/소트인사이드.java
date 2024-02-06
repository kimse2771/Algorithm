import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        List<Integer> list = new ArrayList<>();
        String[] sr  = s.split("");
        
        for(String num : sr){
            list.add(Integer.parseInt(num));
        }
        
        Collections.sort(list, Collections.reverseOrder());
        
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }
        
    }
    
}