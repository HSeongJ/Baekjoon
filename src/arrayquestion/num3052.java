package arrayquestion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class num3052 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		HashSet<Integer> num = new HashSet<>();
		
		for(int i = 0; i < 10; i++) {
			int input = Integer.parseInt(br.readLine());
			
			num.add(input % 42);
		}
		
		System.out.println(num.size());
	}
}
