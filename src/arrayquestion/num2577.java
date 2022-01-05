package arrayquestion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class num2577 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int first = Integer.parseInt(br.readLine());
		int second = Integer.parseInt(br.readLine());
		int third = Integer.parseInt(br.readLine());
		
		int mul = first * second * third;
		
		byte[] count = new byte[10];
		
		for(int i = 0; i < 9; i++) {
			count[mul % 10]++;
			mul /= 10;
			
			if(mul == 0)
				break;
		}
		
		for(int i = 0; i < count.length; i++) {
			System.out.println(count[i]);
		}
	}

}
