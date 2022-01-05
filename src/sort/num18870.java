package sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;

public class num18870 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		String str = br.readLine();
		String[] tmp = str.split(" ");
		int[] num = new int[N];
		
		for(int i = 0; i < N; i++) {
			num[i] = Integer.parseInt(tmp[i]);
		}
		
		int[] sort_num = num.clone();
		
		Arrays.sort(sort_num);
		int idx = 0;
		
		for(int i = 0; i < N; i++) {
			if(!map.containsKey(sort_num[i])) {
				map.put(sort_num[i], idx++);
			}
		}
		
		for(int i = 0; i < N; i++) {
			bw.write(map.get(num[i]) + " ");
		}
		br.close();
		
		bw.flush();
		bw.close();
	}

}
