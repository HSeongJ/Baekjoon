package basicmath;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class num10757 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = new String(br.readLine());
		
		String[] str1 = str.split(" ");
		
		BigInteger A = new BigInteger(str1[0]);
		BigInteger B = new BigInteger(str1[1]);
		
		
		System.out.println(A.add(B));
		
		br.close();
	}

}
