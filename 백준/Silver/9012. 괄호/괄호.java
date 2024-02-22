import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();
        

        Stack<String> stack = new Stack<>();
        int N=Integer.parseInt(br.readLine());
        String ps = "";
        String[] psList; 
        for(int i=0;i<N;i++){
            ps = br.readLine();
            psList = ps.split("");
            for(String p : psList){
                if(p.equals("(")){
                    stack.push(p);
                }else{
                    if(stack.isEmpty()){
                        stack.push(p);
                        break;
                    }else{
                        stack.pop();
                    }
                }
            }
            
            if(stack.isEmpty()){
                 System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            stack.clear();
            
        }
        

    }
}