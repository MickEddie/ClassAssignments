/**
 * 
 */
package exercise5_13;

/**
 * @author M.E. Okandeji 11/06/2019
 *
 */
public class Factorials {

	/**
	 * @param args
	 */
	
		int counter;
		long factorial = 1;
		int number = 20;
		
		public void getFactorial() {
		System.out.println("Number" + "		" + "Factorial");
		for(counter=1; counter <= number; counter++) {
			factorial *= counter;
			System.out.println(counter + "!" + "		" + factorial);
		}
		
		}
		
		public static void main(String[] args) {
			Factorials fact = new Factorials();
			fact.getFactorial();
		}
}

