package basicmath;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class num1193 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int X = Integer.parseInt(br.readLine());
		int num = 2;
		int denominator = 0;
		int numerator = 0;
		boolean tf = false;
		while(X > 0) {
			for(int i = 1; i < num; i++) {
				if(tf) {
					numerator = i;
					denominator = num - numerator;
				} else {
					denominator = i;
					numerator = num - denominator;
					
				}		
				X--;
				if(X == 0)
					break;
			}
			if(tf)
				tf=false;
			else
				tf=true;
			
			num++;
		}
		System.out.println(numerator + "/" + denominator);
		br.close();
	}
}
