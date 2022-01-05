package sort;

public class selectionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ary = {10, 9, 8, 7, 6, 4, 5, 3, 2, 1};
		
		for(int i = 0; i < ary.length - 1; i++) {
			
			int min = i;
			int temp = 0;
			
			for(int j = i; j < ary.length; j++) {
				if(ary[min] > ary[j]) {
					min = j;
				}
			}
			
			temp = ary[i];
			ary[i] = ary[min];
			ary[min] = temp;
		}
		
		for(int i = 0; i < ary.length; i++) {
			System.out.print(ary[i] + " ");
		}
	}

}
