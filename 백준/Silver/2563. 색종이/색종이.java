import java.util.Scanner;

class Main {
    public static void main(String [] arg) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] arr= new int[101][101];
        int cnt=0;
        
        for(int i=0;i<n;i++){
            int x = input.nextInt();
            int y=input.nextInt();
            for(int j=x;j<x+10;j++){
            	for(int z=y;z<y+10;z++) {
            		arr[j][z]=1;
                   
            	}
                
            }
        }
        
        for(int i=0;i<101;i++){
            for(int j=0;j<101;j++){
                if(arr[i][j]==1)cnt++;
            }
        }
        
        
        
        System.out.println(cnt);
    }
}