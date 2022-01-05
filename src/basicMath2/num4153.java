package basicMath2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class num4153 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		while(true) {
			String str = br.readLine();
			
			String[] str1= str.split(" ");
			
			int a = Integer.parseInt(str1[0]);
			int b = Integer.parseInt(str1[1]);
			int c = Integer.parseInt(str1[2]);
			
			if( a == 0 && b == 0 && c == 0)
				break;
			
			if( a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a) 
				bw.write("right\n");
			else
				bw.write("wrong\n");
		}
		
		br.close();
		
		bw.flush();
		bw.close();
	}

}
