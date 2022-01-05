package sort;

import java.util.Arrays;

public class insertionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ary = {4, 9, 8, 7, 6, 10, 5, 3, 2, 1};
		int temp = 0;
		
		for(int i = 1; i < ary.length; i++) {
			for(int j = i; j > 0; j--) {
				if(ary[j - 1] > ary[j]) {
					temp = ary[j - 1];
					ary[j - 1] = ary[j];
					ary[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(ary));
	}

}
