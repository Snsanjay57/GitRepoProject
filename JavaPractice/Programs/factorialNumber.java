package Programs;

import java.util.Scanner;

public class factorialNumber {

	public static void main(String [] args) {
		System.out.println("Find the Factorial of enter number: ");
//		Scanner sc = new Scanner(System.in);
//		int f = fact(sc.nextInt());
//		System.out.println("factor of enter number is: "+f);
		
		factorial(6);
	}
	
	public static int fact(int f) {
		int mult = 1;
		for(int i=f; i>0; i--) {
			mult *= i;
		}	
		return mult;
	}
	
	public static void factorial(int f) {
		int mult = 1;
		for(int i=f; i>0; i--) {
			mult *= i;
		}	
		System.out.println("Factorial is : "+mult);
	}
	
}
