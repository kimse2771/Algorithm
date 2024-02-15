import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        String[][] arr=new String[n][2];
        
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0]=st.nextToken();
            arr[i][1]=st.nextToken();
        }
        
        Arrays.sort(arr,(e1,e2)->Integer.parseInt(e1[0]) - Integer.parseInt(e2[0]));
         
        for(int i=0;i<n;i++){
            sb.append(arr[i][0]+" "+arr[i][1]).append('\n');
        }
        System.out.println(sb);
        
        
    }
    
}
