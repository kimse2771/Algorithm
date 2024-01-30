import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        
        int n = s.nextInt();
        
        int row = 0;
        
        int cnt = 0;
        
        int top=0;
        int bottom=0;
        int start=0;
        
        
        while(n>cnt){
             row++;
             cnt = row*(row+1)/2;
        }
        
        if(row%2==0){
            top = 1;
            bottom=row;
            
            for(int i=cnt-(row-1);i<n;i++){
                top++;
                bottom--;
            }
            
        }else{
              top = row;
            bottom=1;
            
            for(int i=cnt-(row-1);i<n;i++){
                top--;
                bottom++;
            }
            
        }
        System.out.println(top+"/"+bottom);
        
    }
    
}