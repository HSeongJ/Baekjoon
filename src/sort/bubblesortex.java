package sort;

public class bubblesortex {

	public static void main(String[] args) {
		int[] ary = {10, 9, 8, 7, 6, 4, 5, 3, 2, 1};
		
		for(int i = 0; i < ary.length - 1; i++) {
			for(int j = 1; j < ary.length; j++) {
				int temp = 0;
				
				if(ary[j - 1] > ary[j]) {
					temp = ary[j - 1];
					ary[j - 1] = ary[j];
					ary[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < ary.length; i++) {
			System.out.print(ary[i] + " ");
		}
	}

}
