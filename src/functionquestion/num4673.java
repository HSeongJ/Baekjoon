package functionquestion;

public class num4673 {

	public static void main(String[] args) {
		
		boolean[] self = new boolean[10001];
		
		for(int i = 1; i < 10001; i++) {
			int n = d(i);
			
			if(n < 10001) {
				self[n] = true;
			}
		}
		
		for(int i = 1; i < 10001; i++) {
			if(!self[i]) {
				System.out.println(i);
			}
		}
	}
	
	public static int d(int n) {
		int result = n;
		
		while(n != 0) {
			result += n % 10;
			n /= 10;
		}
		
		return result;
	}
}

