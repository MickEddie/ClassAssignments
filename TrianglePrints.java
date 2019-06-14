package exercise515;

public class TrianglePrints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A = 1, B = 15, C = 10, D = 5; 
		for(int i = 1; i <= 10; i++) {
			
			for(int j = A; j > 0; j--) {
				System.out.print("*");
			}
			for(int k = B; k > 0; k--) {
				System.out.print(" ");
			}
			for(int l = C; l > 0; l--) {
				System.out.print("*");
			}
			for(int m = D; m > 0; m--) {
				System.out.print(" ");
			}
			for(int n = C; n > 0; n--) {
				System.out.print("*");
			}
			for(int o = B; o > 0; o--) {
				System.out.print(" ");
			}
			for(int p = A; p > 0; p--) {
				System.out.print("*");
			}
			
			A +=1; B -=1; C -=1; D +=2;
			
			System.out.println();
			
		}
	}

}
