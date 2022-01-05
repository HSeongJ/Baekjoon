package etc;

import java.util.Scanner;

public class num2609 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		int i = 2;
		
		int GCD = 1, LCM = A*B;
		
		while(true) {
			if(A < i || B < i) {
				break;
			}
			
			if((A % i == 0) && (B % i == 0)) {
				A /= i;
				B /= i;
				GCD *= i;
				continue;
			}
			i++;
		}
		
		LCM /= GCD;
		
		System.out.println(GCD + "\n" + LCM);
	}

}
