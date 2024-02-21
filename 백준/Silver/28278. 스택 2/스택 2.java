import java.util.*;
import java.io.*;

class Main{
    
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb= new StringBuilder();
        
        Stack<Integer> stack = new Stack<>();
        
        int N = Integer.parseInt(br.readLine());
        int command=0;
        int num=0;
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            command=Integer.parseInt(st.nextToken());
            switch(command)
            {
                case 1:
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case 2:
                    sb.append(stack.isEmpty() ? -1 : stack.pop()).append("\n");
                    break;
                 case 3:
                    sb.append(stack.size()).append("\n");
                    break;
                 case 4:
                    sb.append(stack.isEmpty() ? 1 : 0).append("\n");
                    break;
                 case 5:
                    sb.append(stack.isEmpty() ? -1 : stack.peek()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
        
        
    }
    
}