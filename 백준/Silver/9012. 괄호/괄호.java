import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();
        

        Stack<Character> stack = new Stack<>();
        int N=Integer.parseInt(br.readLine());
        String ps = "";
        for(int i=0;i<N;i++){
            ps = br.readLine();

            for(int j=0;j<ps.length();j++){
                char c= ps.charAt(j);
                if(c=='('){
                    stack.push(c);
                }else{
                    if(stack.isEmpty()){
                        stack.push(c);
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