package Programs;

import java.util.Scanner;

public class findEvenOddNum {
	
	public static void main(String[] args) {
		
		System.out.println("Find the entered number is Even or Odd:");
		
		System.out.println("ENTER the number: ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		if(input%2==0) {
			System.out.println("Entered number "+input+" is Even");
		} else {
			System.out.println("Entered number "+input+" is O");
		}
		
	}

}
