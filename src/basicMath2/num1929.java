package basicMath2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class num1929 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		
		String[] str1= str.split(" ");
		int M = Integer.parseInt(str1[0]);
		int N = Integer.parseInt(str1[1]);
		
		for(int i = M; i <= N; i++) {
			boolean sosu = true;
			
			if(i == 1)
				continue;
			
			if(i == 2) {
				bw.write(String.valueOf(i) + "\n");
				continue;
			}
			
			for(int j = 2; j <= Math.sqrt(i); j++) {
				if(i % j == 0) {
					sosu = false;
					break;
				}
			}
			
			if(sosu)
				bw.write(String.valueOf(i) + "\n");
		}
		
		bw.flush();
		bw.close();
	}

}
