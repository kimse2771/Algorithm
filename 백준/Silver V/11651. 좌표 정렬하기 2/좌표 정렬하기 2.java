import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{

        Scanner s = new Scanner(System.in);
        int len = s.nextInt();
        int[][] arr=new int[len][2];

  
        for(int i=0;i<len;i++){
           
            arr[i][0]=s.nextInt();
            arr[i][1]=s.nextInt();
        }
        
        Arrays.sort(arr,(e1,e2)->{
            if(e1[1]==e2[1]){
                return e1[0]-e2[0];
            }else{
                return e1[1]-e2[1];
            }
        });
        StringBuilder str = new StringBuilder();
        for(int i=0;i<len;i++){
            str.append(arr[i][0]+" "+arr[i][1]).append('\n');
        }      
        
        System.out.println(str);
        
        
        
    }
    
}
