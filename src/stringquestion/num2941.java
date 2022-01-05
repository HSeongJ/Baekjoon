package stringquestion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class num2941 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuffer sb = new StringBuffer(br.readLine());
		
		String[] ch = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		for(int i = 0; i < ch.length; i++) {
			if(sb.indexOf(ch[i]) != -1) {
				sb.replace(sb.indexOf(ch[i]), sb.indexOf(ch[i])+ch[i].length(), "1");
				i--;
			}
		}
		
		System.out.println(sb.toString().length());
		
		br.close();
		
		bw.flush();
		bw.close();
	}

}
