package stringquestion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class num1316 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		
		int count = 0;
		
		for(int i = 0; i < N; i++) {
			boolean joong = false;
			ArrayList<Integer> ch = new ArrayList<>();
			StringBuffer str = new StringBuffer();
			str.delete(0, str.length());
			str.append(br.readLine() + " ");
			
			for(int j = 0; j < str.length(); j++) {
				if(str.charAt(j) != ' ') {
					ch.add((int)str.charAt(j));
				}
				for(int x = 0; x < ch.size() - 1; x++) {
					if(ch.get(x) == str.charAt(j)) {
						joong = true;
						break;
					}
				}
				if(joong)
					break;
				for(int k = j + 1; k <str.length(); k++) {
					if(str.charAt(j) != str.charAt(k)) {
						j = k - 1;
						break;
					}
				}
			}
			if(joong)
				continue;
			count++;
		}
		System.out.println(count);
		br.close();
		bw.flush();
		bw.close();
	}
}