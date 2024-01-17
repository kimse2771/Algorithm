import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int sum = 0;
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
            
        }
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        
        Arrays.sort(arr);
        
        System.out.println(sum/5);
        System.out.println(arr[2]);

    }
    
    
}