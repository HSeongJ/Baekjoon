package recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class num10870 {

	static int first = 0;
	static int second = 1;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		if(n == 0)
			System.out.println(first);
		else if(n == 1)
			System.out.println(second);
		else {
			fibonacci(n);
			System.out.println(second);
		}
			
		br.close();

	}
	
	public static void fibonacci(int n) {
		if(n - 1 == 0)
			return;
		else if(n - 1 > 0) {
			int temp = second;
			
			second += first;
			first = temp;
		}
		
		fibonacci(n-1);
	}
}
