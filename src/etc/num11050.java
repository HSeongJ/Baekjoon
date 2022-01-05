package etc;

import java.util.Scanner;

public class num11050 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int K = scan.nextInt();
		
		int result = 1;
		
		for(int i = 0; i < K; i++) {
			result *= N - i;
			result /= i + 1;
		}
		
		System.out.println(result);
	}

}
