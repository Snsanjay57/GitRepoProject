package Programs;

import java.util.Arrays;

public class reverseString {

	public static void main(String[] args) {

		System.out.println("Enter String: ");
		revByLoop("Sanjay"); 
		System.out.println("============");
		revByBufferString("Sanjay kumar Meena");
		System.out.println("============");
		sortedChar("Sanjay Meena Kumar");
		System.out.println("============");
		sortedWord("Sanjay Kumar Meena");
		
	}

	public static void revByLoop(String st) {
		String store = "";
		for(int i = st.length()-1; i>=0; i--) {
			store += st.charAt(i);
		}
		System.out.print(store);
	}

	public static void revByBufferString(String st) {

		String[] str = st.split(" ");
		for(int i = 0; i<str.length; i++) {
			StringBuilder sb = new StringBuilder(str[i]);
			System.out.println(sb.reverse());;
		}
	}
	
	public static void sortedChar(String st) {
		
		char[] ch = st.toCharArray();
		Arrays.sort(st.toCharArray());
		String str = new String(ch);
		System.out.println(str);
	}
	
	public static void sortedWord(String st) {
		
		String[] sprt = st.split(" ");
		
		Arrays.sort(sprt);
		System.out.println(Arrays.toString(sprt));
		
	}
	
}
