package arrayquestion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class num1065 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(han(Integer.parseInt(br.readLine())));

		
	}

	public static int han(int N) {
		int count = 0;
		
		if(N < 100) {
			return N;
		} else {
			count = 99;
			
			if(N == 1000)
				N = 999;
			
			for(int i = 100; i <= N; i++) {
				int hun = i / 100;
				int ten = (i / 10) % 10;
				int one = i % 10;
				
				if((hun - ten) == (ten - one))
					count++;
			}
		}
		
		return count;
	}
}
