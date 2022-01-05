package sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class num1427 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String N = br.readLine();
		
		ArrayList<Integer> ary = new ArrayList<>();
		
		for(int i = 0; i < N.length(); i++) {
			ary.add(Integer.parseInt(String.valueOf(N.charAt(i))));
		}
		
		Collections.sort(ary, Collections.reverseOrder());
		
		for(int i = 0; i < ary.size(); i++) {
			System.out.print(ary.get(i));
		}
		br.close();
	}

}
