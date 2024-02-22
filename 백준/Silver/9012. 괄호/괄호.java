import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();
        
        int N=Integer.parseInt(br.readLine());
        String ps = "";
        for(int i=0;i<N;i++){
            ps = br.readLine();
            sb.append(solution(ps)).append("\n");
        }
        System.out.println(sb);
        
    }
    
    public static String solution(String s){
        Stack<Character> stack = new Stack<>();
        
        for(int j=0;j<s.length();j++){
                char c= s.charAt(j);
                if(c=='('){
                    stack.push(c);
                }else{
                    if(stack.isEmpty()){
                        return "NO";
                    }else{
                        stack.pop();
                    }
                }
            }
            
            if(stack.isEmpty()){
                 return("YES");
            }else{
                return("NO");
            }

            
        
        
    }
}