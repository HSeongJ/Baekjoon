package etc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num2980 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		boolean[] L = new boolean[Integer.parseInt(st.nextToken())];
		int[][] signal = new int[N][3];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			
			signal[i][0] = Integer.parseInt(st.nextToken());
			signal[i][1] = Integer.parseInt(st.nextToken());
			signal[i][2] = Integer.parseInt(st.nextToken());
		}
		
		
		br.close();
	}

}
