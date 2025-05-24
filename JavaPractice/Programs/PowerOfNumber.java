package Programs;

import java.util.Scanner;

public class PowerOfNumber {
	
	public static void main(String[] args) {
		
		System.out.println("Find the Power of enter number");	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Base number: ");
		int b = sc.nextInt();
		
		System.out.print("Enter Power of base number: ");
		int p = sc.nextInt();
		int mult = 1;
		for(int i = p ; p>=1; p--) {
			mult *= b;
		}
		System.out.println("Power of entered number is: "+mult);
	}

}
