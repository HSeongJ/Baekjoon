package bruteforce;

import java.util.Scanner;

public class num7568 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		int[] weight = new int[T];
		int[] height = new int[T];
		int[] rank = new int[T];
		
		for(int i = 0; i < T; i++) {
			rank[i] = 1;	
			weight[i] = scan.nextInt();
			height[i] = scan.nextInt();
		}
		
		for(int i = 0; i < T; i++) {
			for(int j = 0; j < T; j++) {
				if(weight[j] > weight[i] && height[j] > height[i])
					rank[i]++;
			}
		}
		
		for(int i = 0; i < rank.length; i++) {
			System.out.print(rank[i] + " ");
		}
	}

}
