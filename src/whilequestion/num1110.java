package whilequestion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class num1110 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		
		int ten, result, count = 0;
		
		result = num;
		
		while(true) {
			count++;
			
			ten = (result % 10) * 10;
			
			result = ((result / 10) + (result % 10)) % 10 + ten;

			if(result == num)
				break;
		}
		
		System.out.println(count);
		
		br.close();
	}

}
