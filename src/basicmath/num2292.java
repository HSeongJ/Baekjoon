package basicmath;

import java.util.Scanner;

public class num2292 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int count = 0;
		int mul = 0;
		int result = 1;
		
		N -= 1;
		while(true) {
			mul += count;
			count++;
			result++;
			if(N == 0) {
				System.out.println(1);
				break;
			} else if((N > (6*mul)) && (N <= (6*(mul+count)))) {
				System.out.println(result);
				break;
			}	
		}
	}
}
