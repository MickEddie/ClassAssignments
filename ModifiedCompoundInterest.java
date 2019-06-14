package exercise5_18;

public class ModifiedCompoundInterest {
	double amount = 0;
	int principal = 100000;
	double rate = 0.05;
	
	public double calcCompoundIntrst() {
				
		System.out.println("Year" + "	" + "Amount on deposit");
		
		for(int year = 1; year <= 10; year++) {
			amount = principal * Math.pow(1 + rate, year);
			int dollars = (int)amount/100;
			int cents = (int)amount%1000;
			
			System.out.println(year + "	" + dollars + "." + cents);
		}
		return amount;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ModifiedCompoundInterest comp1 = new ModifiedCompoundInterest();
		 comp1.calcCompoundIntrst();
	}
}
