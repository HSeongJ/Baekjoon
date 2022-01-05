package etc;

import java.util.Scanner;

public class num2475 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println((int)(Math.pow(scan.nextInt(), 2) + Math.pow(scan.nextInt(), 2)
							+ Math.pow(scan.nextInt(), 2) + Math.pow(scan.nextInt(), 2) + Math.pow(scan.nextInt(), 2))%10);
	}

}
