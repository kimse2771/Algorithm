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
        
        bfs();
             
    }
    
    public static void dfs(int v){
        checked[v]=true;
        System.out.print(v+" ");
        for(int i =1;i<=N;i++){
          if(branch[v][i]==1&&checked[i]==false){
              dfs(i);
          }  
        } 
    }
    
    public static void bfs(){
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(V);
        checked[V] = true;
        System.out.print(V + " ");
   
        
        while(!queue.isEmpty()){
            int temp = queue.poll();
            
            for(int j = 1;j<=N;j++){
                if(branch[temp][j]==1&&checked[j]==false){
                    queue.offer(j);
                    
                    checked[j] = true;
                    
                    System.out.print(j+" ");
                    
                }
            }
        }
    }
    
}