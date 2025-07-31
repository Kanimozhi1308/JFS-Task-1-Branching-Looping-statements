package conditional;

import java.util.Scanner;

public class CheckNumbers {
	
	public static void main (String args[]) {
	    
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the Number = ");
		int n = num.nextInt();
		
		if(n > 0) {
			System.out.println( "The Given Number is Positive");
		}else if (n < 0) {
			System.out.println( "The Given Number is Negative");
		}else {
			System.out.println( "The Given Number is Neither Positive nor Negative");
		}
			
		}	
	
}
