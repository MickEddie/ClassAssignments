/**
 * 
 */
package excercise5_11;

/**
 * @author: M.E. Okandeji, 10/06/2019
 *
 */

import java.util.Scanner;

public class SmallestValue {
	
	
	public static void main(String[] args) {
		int numberOfValues;
		int number = 0;
		int smallest;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of values to input: ");
		numberOfValues = input.nextInt();
		
		
		
		System.out.println("Enter value: ");
		number = input.nextInt();
		smallest = number;
		int counter = 1;
		
		while(counter < numberOfValues) {
		number = input.nextInt();
		counter++;
				
			if(smallest > number) {
			smallest = number;
			}
		}
		System.out.println("The Smallest value is: " + smallest);
	}

}
