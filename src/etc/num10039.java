package etc;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class num10039 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int avg = 0;
		for(int i = 0; i < 5; i++) {
			int score = Integer.parseInt(br.readLine());
			
			if(score < 40)
				score = 40;
			
			avg += score;
		}
		
		System.out.println(avg / 5);
		br.close();
	}

}
