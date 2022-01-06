package sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class num2108 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> ary = new ArrayList<>();
		int[] tmp = new int[8001];
		
		double avg = 0.0;
		int mid = 0;
		int range = 0;		

		
		int max = 0;

		int fre = 0;

		int num = 0;
		
		for(int i = 0; i < N; i++) {
			num = Integer.parseInt(br.readLine());
			
			ary.add(num);
			tmp[num+4000]++;
			avg += num;
		}
		
		Collections.sort(ary);
		

		for(int i = 0; i < tmp.length; i++) {
			if(tmp[i] > max) {
				max = tmp[i];
			}
		}
		
		int count = 0;
		

		for(int i = 0; i < tmp.length; i++) {
			if(tmp[i] > max) {
				max = tmp[i];
			}
		}
		

		for(int i = 0; i < tmp.length; i++) {
			if(max == tmp[i]) {
				fre = i - 4000;
				count++;
			}
			
			if(count == 2) {
				break;
			}
		}
		

		mid = ary.get(ary.size() / 2);
		

		range = Math.abs(ary.get(ary.size() - 1) - ary.get(0));


		System.out.printf("%.0f\n", avg/N);

		System.out.println(mid);
		System.out.println(fre);

		System.out.println(range);
		br.close();
		
		bw.flush();
		bw.close();
	}

}
