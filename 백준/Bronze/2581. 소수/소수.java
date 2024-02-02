import java.util.*;
import java.io.*;


class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        boolean check = false;
        int sum=0;
        int min =M;
        
        
        for(int i=N;i<=M;i++){
        	check = true;
            
            if(i==1)check=false;
            for(int j=2;j<=Math.sqrt(i);j++){	 
              if(i%j==0){
                  check=false;
                  break;
              }

            }
            if(check){
                if(min>i){
                    min=i;
                }
                sum+=i;
            }
        }
        
       if(!check&&sum==0){
        	System.out.println(-1);
   		 
        }else{
            System.out.println(sum+"\n"+min);
        }
        
    }
    
}