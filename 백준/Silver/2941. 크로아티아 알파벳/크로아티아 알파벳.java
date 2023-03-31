import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
 
        String str = sc.next();
        int count =0;
        
        for(int i =0;i<str.length();i++) {
        	count++;
        	if(i <str.length()-1 ) {
              if (str.charAt(i) == 'c') {
                  //c=와 c- 체크
                  if ((str.charAt(i+1) == '-' || str.charAt(i+1) == '=')) {
                      i++;
                  }
              }
              else if (str.charAt(i) == 'd') {
                  //d- 체크
                  if (str.charAt(i+1) == '-') {
                      i++;
                  } else if (i < str.length()-2 && str.substring(i,i+3).equals("dz=")) {
                      //dz= 체크
                      i += 2;
                  }
              }
              //lj 체크
              else if (str.charAt(i) =='l') {
                  if ( str.charAt(i+1) == 'j') {
                      i++;
                  }
              }
              //nj 체크
              else if (str.charAt(i) =='n') {
                  if ( str.charAt(i+1) == 'j') {
                      i++;
                  }
              }
              //s= 체크
              else if (str.charAt(i) =='s') {
                  if ( str.charAt(i+1) == '=') {
                      i++;
                  }
              }
              //z= 체크
              else if (str.charAt(i) =='z') {
                  if (str.charAt(i+1) == '=') {
                      i++;
                  }
              }
          }
        }
          System.out.print(count);

    }
}