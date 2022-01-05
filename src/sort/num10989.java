package sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class num10989 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int size = Integer.parseInt(br.readLine());
		
		int[] ary = new int[size];
		int[] tmp = new int[10000];
		int point = 0;
		
		for(int i = 0; i < size; i++) {
			ary[i] = Integer.parseInt(br.readLine());
			
			tmp[ary[i] - 1]++;
		}
		
		for(int i = 0; i < 10000; i++) {
			for(int j = 0; j < tmp[i]; j++) {
				ary[point++] = i+1;
			}
		}
		
		for(int i = 0; i < size; i++) {
			bw.write(ary[i] + "\n");
		}
		
		br.close();
		
		bw.flush();
		bw.close();
	}

}
