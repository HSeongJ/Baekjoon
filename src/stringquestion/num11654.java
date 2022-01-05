package stringquestion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class num11654 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String S = new String(br.readLine());
		
		for(int i = 'a'; i <= 'z'; i++) {
			System.out.print(S.indexOf(i) + " ");
		}
		br.close();
	}

}
