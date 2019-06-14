package exercise5_14;

import java.util.Scanner;
public class CompoundInterestRates {

	public static void main(String[] args) {
		// TODO Auto-generated method

		 int principal = 1000;
		 double rate = 0.05;
		 double amount;
		 double product = 1;
		
		for(int i = 1; i <= 6; i++) {
			System.out.printf("rate is: %.2f%n", rate);
				for(int year = 1; year <= 10; year++) {
					product = product *  (1 + rate);
					amount = principal * product;
					if(year == 10) {
						product = 1;
					}
					System.out.printf("%4d%,20.2f%n", year, amount);
			}
				System.out.println();
				rate = rate + 0.01;
			
		}
	
	}
	
}
