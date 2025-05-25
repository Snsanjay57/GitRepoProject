package Programs;

import java.util.Scanner;

public class factorOfUserInput {
	
	public static void main(String[] args) {
		
		System.out.println("Print the FACTORS of enter number by user");
		System.out.println("Enter number: ");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		
		for(int i=1; i<=no/2; i++) {
			
			if(no%i==0) System.out.println(i);
		}
		System.out.println("Program finish....QA Code class Factor");

	}

}
