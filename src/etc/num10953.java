package etc;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class num10953 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			String str = br.readLine();
			String[] tmp = str.split(",");
			
			System.out.println(Integer.parseInt(tmp[0]) + Integer.parseInt(tmp[1]));
		}
		
		br.close();
	}

}
