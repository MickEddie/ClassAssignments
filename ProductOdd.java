// Author: M.E. Okandeji, 10/06/2019


package excercise5_12;

public class ProductOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int product = 1;
		
		for(int counter = 1; counter <= 15; counter += 2) {
		product *= counter;
		System.out.println(counter);
		}
		
		System.out.println("Product of the odd integers is: " + product);

	}

}
