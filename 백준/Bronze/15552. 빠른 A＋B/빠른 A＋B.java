import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {
	public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
       	int n = Integer.parseInt(br.readLine());
        int a = 0;
        int b=0;
        
        for(int i=0;i<n;i++)
        {    String s = br.readLine();
            a = Integer.parseInt(s.split(" ")[0]);
			b = Integer.parseInt(s.split(" ")[1]);
            bw.write(a + b + "\n");
        }

		bw.flush();	
    }
}