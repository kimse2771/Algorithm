import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Main{
        static int N;
        static int M;
        static int V;
        
       static int[][] branch;
       static boolean[] checked;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
          N = sc.nextInt();
         M = sc.nextInt();
         V = sc.nextInt();
        
        
        branch = new int[1001][1001];
        checked = new boolean[1001];
        
        int x = 0;
        int y=0;
        
        for(int i=0;i<M;i++){
            x = sc.nextInt();
            y = sc.nextInt();
            
            branch[x][y]=branch[y][x]=1;
            
        }
        
        dfs(V);
        
        checked = new boolean[1001];
        System.out.println();
        
        bfs(V);
             
    }
    
    public static void dfs(int v){
        checked[v]=true;
        System.out.print(v+" ");
        for(int i=1;i<=N;i++){
            if(checked[i]==false&&branch[v][i]==1){
                dfs(i);
            }
        }
    }
    
        public static void bfs(int v){
            Queue<Integer> q = new LinkedList<>();
            q.offer(v);
         
            checked[v]=true;
            System.out.print(v+" ");
            
            while(!q.isEmpty()){
                v=q.poll();
                for(int i=1;i<=N;i++){
                    if(branch[v][i]==1&&!checked[i]){
                        q.offer(i);
                        checked[i]=true;
                        System.out.print(i+" ");
                    }
                }
            }
        
    }
    
    

    
}