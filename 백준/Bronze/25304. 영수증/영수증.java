import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sumPrice = sc.nextInt();
        int totalCount = sc.nextInt();
        int price = 0;
        int num = 0;
        int sum =0;
       
        for(int i=0;i<totalCount;i++){
             price = sc.nextInt();
            num = sc.nextInt();
            
            sum += (price*num);
        }
        if(sum == sumPrice){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}