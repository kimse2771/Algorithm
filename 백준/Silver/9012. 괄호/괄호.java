import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();
        
        int N=Integer.parseInt(br.readLine());
      
        for(int i=0;i<N;i++){
            sb.append(solution(br.readLine())).append("\n");
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
                    if(stack.empty()){
                        return "NO";
                    }else{
                        stack.pop();
                    }
                }
            }
            
		if (stack.empty()) {
			return "YES";
		} 
		else {
			return "NO";
		}

            
        
        
    }
}