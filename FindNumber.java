package smallestnumber;

import java.util.Scanner;

public class FindNumber {
	
	public static void main (String args[]) {
		
		int a,b,c ;
		
		Scanner small = new Scanner (System.in);
		System.out.println("Enter three Numbers");
		a = small.nextInt();
		b = small.nextInt();
		c = small.nextInt();
		
		if (a < b && a < c ) {
			
			System.out.println( a +" is Smallest");
			
		}else if (b < a && b < c) {
			
			System.out.println( b +" is Smallest");
			
		}else if (c < a && c < b) {
			
			System.out.println( c +" is Smallest");
		}else {
			
			System.out.println("All are Same Number !!! Give Different Number");
		}
		
	}

}
