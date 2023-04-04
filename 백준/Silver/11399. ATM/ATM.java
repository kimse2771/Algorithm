import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String [] arg) {
        Scanner input = new Scanner(System.in);
        int people = input.nextInt();
        int[] arr = new int[people];
        
        for(int i=0;i<people;i++){
            arr[i] = input.nextInt();
        }
        
        Arrays.sort(arr);
        
        int sum =0;
        int pre =0;
        
        for(int i=0;i<people;i++){
            pre += arr[i];
            sum +=pre;
        }
   
        System.out.println(sum);
    }
}