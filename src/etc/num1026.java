package etc;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class num1026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] A = new int[N];
		Integer[] B = new Integer[N];
		int sum = 0;
		
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		
		for(int i = 0; i < N; i++) {
			B[i] = sc.nextInt();
		}
		
		Arrays.sort(A);
		Arrays.sort(B, Collections.reverseOrder());
		
		for(int i = 0; i < N; i++) {
			sum += A[i] * B[i];
		}
		
		System.out.println(sum);
	}

}
