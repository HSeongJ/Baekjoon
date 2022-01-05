package basicmath;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class num2775 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) { //T�� �ݺ�
			int K = Integer.parseInt(br.readLine());
			int N = Integer.parseInt(br.readLine());
			int result = 1;
			
			int[] room = new int[N - 1];
			for(int j = 0; j < N - 1; j++) {
				room[j] = j+2;
			}
			
			for(int j = 0; j < K; j++) {
				result = 1;
				for(int k = 0; k < N-1; k++) {
					result += room[k];
					room[k] = result;
				}
			}
			System.out.println(result);
		}
		br.close();
	}
}
