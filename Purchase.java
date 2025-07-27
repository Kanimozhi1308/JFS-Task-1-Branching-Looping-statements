package payableamount;

import java.util.Scanner;

public class Purchase {
	
	public static void main (String args[]) {
	
		
		Scanner n = new Scanner(System.in);
		System.out.print("Enter the purchase Amount = ");
		float amount = n.nextFloat();
		
		
		if(amount < 500) {
			
			System.out.println("No Discount is Applied");
			
		}else if ( amount >= 500 && amount <= 1000) {
			
			float discountAmount = amount - (amount * 0.10f);
			
			System.out.println("10% Discount is Applied ----- Payable Amount = " + discountAmount);			
		}else {
			
			float discountAmount = amount - (amount * 0.20f) ;
			System.out.println("20% Discount is Applied ----- Payable Amount = " + discountAmount);
		}
		
	}

}
