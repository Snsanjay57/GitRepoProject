package Programs;

public class recursionPrintUpto10 {
	
	public static void main(String[] args) {
		printValue(1);
	}

	
	public static void printValue(int i) {
		
		System.out.println(i);
		if(i == 10) {
			return;
		}
		printValue(i+1);

	}
}
