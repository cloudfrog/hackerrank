import java.util.*;
import java.io.*;
public class ransomnote {
	public static void main(String[]args)throws IOException{
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		HashMap<String, Integer> HM = new HashMap<String,Integer>();
		st = new StringTokenizer(bf.readLine());
		//HM.put("1", 1);
		//HM.put("1", 2);
		//System.out.println(HM.get("1"));
		while(st.hasMoreTokens()) {
			String key = st.nextToken();
			if(HM.containsKey(key)){
				int val = HM.get(key);
				HM.put(key, val+1);
			}
			else {
				HM.put(key, 1);
			}
		}
		boolean kaya = true;
		st = new StringTokenizer(bf.readLine());
		while(st.hasMoreTokens()) {
			String key = st.nextToken();
			if(HM.containsKey(key)) {
				int val = HM.get(key);
				if(val == 0) {
					kaya = false;
					break;
				}
				HM.put(key, val-1);
			}
			else {
				kaya = false;
				break;
			}
		}
		if(kaya) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
	}
}
