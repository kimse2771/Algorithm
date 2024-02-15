import java.util.*;
import java.io.*;

class Main{
    
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int n= Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        
        for(int i=0;i<n;i++){
            arr[i]=br.readLine();
        }
        
        Arrays.sort(arr,(e1,e2)->{
            if(e1.length()==e2.length()){
                return e1.compareTo(e2);
            }
            else{
                return e1.length() - e2.length();
            }
            
        });
        
        sb.append(arr[0]).append('\n');
        for(int i=1;i<n;i++){
            if(!arr[i].equals(arr[i-1])){
                sb.append(arr[i]).append('\n');
            }
        }
        
        System.out.println(sb);
        
    }
    
}