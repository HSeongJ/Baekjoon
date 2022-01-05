package recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class num10872_2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(factorial(Integer.parseInt(br.readLine())));
		
		br.close();
	}
	
	public static int factorial(int N) {
		if(N <= 1)
			return 1;
		else
			return N * factorial(N - 1);
	}
}
