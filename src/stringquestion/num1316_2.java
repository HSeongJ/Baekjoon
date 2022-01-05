package stringquestion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class num1316_2 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int count = 0;
		
		while(N-- > 0) {
			boolean[] check = new boolean[26];
			boolean joong = false;
			String str = br.readLine();
			
			int old = str.charAt(0);
			check[old - 97] = true;
			
			for(int i = 1; i < str.length(); i++) {
				int nw = str.charAt(i);
				
				if((check[str.charAt(i)-97] == false) && old != nw) {
					check[str.charAt(i)-97] = true;
					old = str.charAt(i);
				}
				
				if((check[str.charAt(i)-97] == true) && old != nw) {
					joong = true;
					break;
				}
			}
			if(!joong) count++;			
		}
		
		System.out.println(count);
		
		br.close();
	}
}
