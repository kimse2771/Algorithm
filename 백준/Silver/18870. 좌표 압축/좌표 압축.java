import java.util.*;
import java.io.*;

class Main{
    
    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int num = Integer.parseInt(br.readLine());
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] arr = new int[num];
        int[] sortMap=new int[num];
        st = new StringTokenizer(br.readLine());
        int temp = 0;
        int cnt=0;
         for(int i=0;i<num;i++){
	            temp = Integer.parseInt(st.nextToken());
	            sortMap[i] = arr[i]=temp;
	        }
	        
	        Arrays.sort(sortMap);
	        
	        for(int i : sortMap) {
	        	if(!map.containsKey(i)){
	                map.put(i,cnt);
	               cnt++;
	           }
	        }
        List<Integer> keySet = new ArrayList<>(map.keySet());
        Collections.sort(keySet);
        
        for(int i=0;i<num;i++){
            sb.append(map.get(arr[i])).append(' ');
            
        }
        System.out.println(sb);
    }
    
}