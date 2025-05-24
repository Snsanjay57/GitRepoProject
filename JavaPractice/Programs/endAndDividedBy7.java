package Programs;

public class endAndDividedBy7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Print num which ends with 7 and divided by 7");
		
		for(int i=7; i<500; i++) {
			if(i%10==7 && i%7==0) System.out.println(i);
		}
	}

}
