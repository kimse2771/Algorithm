import java.util.Scanner;
import java.util.*;

class Main {
    
    static int n;
    static int m;
    
    static int[][] arr;
    static boolean[][] visited;
    static int cnt;
    
    static int[] dx = { -1, 1, 0, 0 }; // x방향배열-상하
	static int[] dy = { 0, 0, -1, 1 }; // y방향배열-좌우
    public static void main(String [] arg) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr= new int[n][m];
        visited= new boolean[n][m];
        for (int i = 0; i < n; i++) {
			String s = sc.next();
            for(int j=0;j<m;j++){
               arr[i][j]=s.charAt(j)-'0';         
            }		
		}
        
        
        bfs();
        
        System.out.println(arr[n-1][m-1]);
        
        
        
    }
    public static void bfs(){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {0,0});
        
        visited[0][0]=true;
        int x,y=0;
        int nx,ny=0;
        int[] now = new int[2]; 
        cnt++;
        
        while(!q.isEmpty()){
            now=q.poll();
            x=now[0];
            y=now[1];
            for(int i=0;i<4;i++){
                nx=dx[i]+x;
                ny=dy[i]+y;
                if(nx<0||ny<0||nx>=n||ny>=m)continue;
                if(arr[nx][ny]==1&&!visited[nx][ny]){
                    q.add(new int[] {nx,ny});
                    arr[nx][ny]=arr[x][y]+1;
                    visited[x][y]=true;
        
                }
            }
        }
    }
}