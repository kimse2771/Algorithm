import java.util.*;

class Main{
    public static void main(String[] agrs){
        Scanner s= new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        int cnt =0;
        int num = s.nextInt();
        int n = s.nextInt();
        for(int i=1;i*i<=num;i++){
            if(i*i==num)list.add(i);
            else if(num%i==0){
                list.add(i);
                list.add(num/i);
                
            }
            
        }
        
        Collections.sort(list);
        if(n>list.size()){
            System.out.println(0);
        }
        else{
            System.out.println(list.get(n-1));
        }
       
        
        
    }
    
}