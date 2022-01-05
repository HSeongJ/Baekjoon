package stringquestion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class num1157 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		boolean equls = false;
		
		str = str.toUpperCase();
		
		int[] count = new int[26];
		int max = 0;
		int max_count = 0;
		int count1 = 0;
		
		for(int i = 0; i < str.length(); i++) {
			int result = str.charAt(i) - 65;
			
			count[result]++;
			
		}
		
		for(int i = 0 ; i < 26; i++) {
			if(max < count[i]) {
				max = count[i];
				max_count = i;
				count1 = 0;
			}
			if(max == count[i]) {
				count1++;
			}
		}
		if(count1 > 1)
			equls = true;
		
		if(equls)
			System.out.println("?");
		else
			System.out.println((char)(max_count + 65));
	}

}
