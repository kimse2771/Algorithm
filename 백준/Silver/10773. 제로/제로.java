import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();
        
        int sum = 0;
        Stack<Integer> stack = new Stack<>();
        int N=Integer.parseInt(br.readLine());
        int num=0;
        
        for(int i=0;i<N;i++){
            num = Integer.parseInt(br.readLine());
            if(num ==0){
                sum -= stack.pop();
            }else{
                stack.push(num);
                sum+= num;
            }
        }
        
        System.out.println(sum);
        
        
    }
}