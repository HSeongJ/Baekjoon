package etc;

import java.util.Scanner;

public class num1934 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		while(T-- > 0) {
			int A = scan.nextInt();
			int B = scan.nextInt();
			
			System.out.println(A * B / GCD(A, B));
		}
	}

	public static int GCD(int a, int b) {
		if(b == 0) {
			return a;
		} else
			return GCD(b, a % b);
	}
}
