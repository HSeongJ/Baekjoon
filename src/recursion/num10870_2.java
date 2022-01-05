package recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class num10870_2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(fibonacci(n));
		
		br.close();
	}
	public static int fibonacci(int n) {
		if(n <= 1)
			return n;
		else
			return fibonacci(n-1) + fibonacci(n-2);
	}
}
