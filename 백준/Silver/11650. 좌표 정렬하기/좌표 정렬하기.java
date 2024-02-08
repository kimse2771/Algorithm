import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        int[][] arr=new int[len][2];
        StringBuffer str= new StringBuffer();
        
        StringTokenizer st;
        for(int i=0;i<len;i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0]=Integer.parseInt(st.nextToken());
            arr[i][1]=Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr,(e1,e2)->{
            if(e1[0]==e2[0]){
                return e1[1]-e2[1];
            }else{
                return e1[0]-e2[0];
            }
        });
        for(int i=0;i<len;i++){
            str.append(arr[i][0]+" "+arr[i][1]).append('\n');
        }      
        
        System.out.println(str);
        
        
        
    }
    
}
