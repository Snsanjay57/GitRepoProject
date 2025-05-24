package Programs;

public class perfectNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Find number is Perfect or not.");
		
		for(int i=1; i<=1000; i++) {
			int sum = 0;
			for(int j=1; j<=i/2; j++) {
				if(i%j==0)
					sum += j;
			}
			if(sum == i)
				System.out.println("Perfect number: "+i);
		}
	}
}
