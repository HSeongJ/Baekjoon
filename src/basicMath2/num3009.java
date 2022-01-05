package basicMath2;

import java.util.Scanner;

public class num3009 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		int[] ch = { 0, 0 };
		
		int x_temp = scan.nextInt();
		int y_temp = scan.nextInt();
		
		if(x == x_temp)
			ch[0] = -1;
		else
			ch[0] = 1;
		
		if(y == y_temp)
			ch[1] = -1;
		else
			ch[1] = 1;
		
		x += x_temp * ch[0];
		y += y_temp * ch[1];

		ch[0] *= -1;
		ch[1] *= -1;
		
		x_temp = scan.nextInt();
		y_temp = scan.nextInt();
		
		x += x_temp * ch[0];
		y += y_temp * ch[1];
		
		System.out.println(x + " " + y);

	}	
}
