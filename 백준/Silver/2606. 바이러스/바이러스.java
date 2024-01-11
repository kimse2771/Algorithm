import java.util.Scanner;

public class Main {
        static int n;
        static int m;
        static int cnt;
        static int[][] computer;
        static boolean[] visited;

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        cnt=0;
        
        int x=0;
        int y=0;
        computer = new int[101][101];
        visited = new boolean[101];
        for(int i=0;i<m;i++){
            x=sc.nextInt();
            y=sc.nextInt();
            
            computer[x][y]=computer[y][x]=1;
            
        }
        dfs(1);
        System.out.println(cnt);

    }
    
    private static void dfs(int s){
        visited[s]=true;
        
        for(int i=0;i<=n;i++){
            if(!visited[i]&&computer[s][i]==1){
                cnt++;
                dfs(i);
                
            }
        }
    }
}