package sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class num2751 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int N = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> num = new ArrayList<>();
		
		for(int i = 0; i < N; i++) {
			num.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(num);
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < num.size(); i++) {
			sb.append(num.get(i) + "\n");
		}
		
		bw.write(sb.toString());
		
		br.close();
		
		bw.flush();
		bw.close();
	}

}
