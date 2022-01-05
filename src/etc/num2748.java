package etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class num2748 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		long first = 0;
		long second = 1;
		
		for(int i = 1; i < N; i++) {
			long temp = first + second;
			
			first = second;
			second = temp;
		}
		
		bw.write(String.valueOf(second));
		
		br.close();
		
		bw.flush();
		bw.close();
	}
}
