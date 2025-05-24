package Programs;

public class strongNumber {

	public static void main(String[] args) {

		for(int no=1; no>0; no++) {
			int a = no;
			int sum = 0;
			for (int i=1; i<10; i++) {
				
				int fac = factorial(a%10);
				sum += fac;
				if(a/10 == 0) {
					break;
				} else a = a/10;
			}
			if(no == sum) {
				System.out.println("Number is strong number:"+ no);
			}
		}
	}

	public static int factorial(int f) {
		int mult = 1;
		for(int i=f; i>0; i--) {
			mult *= i;
		}
		return mult;
	}
}
