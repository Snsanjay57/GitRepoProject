package Programs;

public class PrimeNumber {

	public static void main(String[] args) {

		System.out.println("Find the Prime number upto 100");

		for(int i=1; i<100; i++) {
			int sum = 0;
			for(int j = 2; j<=i/2; j++) {
				if(i%j == 0) {
					sum++; break;
				}	
			}

			if(sum == 0) System.out.println(i);
		}
	}
}
