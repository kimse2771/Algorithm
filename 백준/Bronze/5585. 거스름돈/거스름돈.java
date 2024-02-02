import java.util.*;
import java.io.*;

class Main{
    
    public static void main(String[] args)throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        
        int[] money = {500,100,50,10,5,1};
        
        int change = 1000-num;
        int cnt=0;
        
        for(int i=0;i<6;i++){
            if(change<0)break;
            else{
                if(change>=money[i]){
                    cnt+=(change/money[i]);
                    change%=money[i];
                }
            }
        }
        System.out.println(cnt);
        
    }
    
    
}