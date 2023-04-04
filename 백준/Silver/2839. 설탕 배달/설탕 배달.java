import java.util.Scanner;

class Main {
    public static void main(String [] arg) {
        Scanner input = new Scanner(System.in);
        int sugar = input.nextInt();
        int result = 0;
        
        while(sugar>0){
            if(sugar % 5==0){
                result += sugar/5;
                break;
            }
            sugar -=3;
            result++;
            if(sugar<0){
                result = -1;
            }
        }
        
        
        
        System.out.println(result);
    }
}