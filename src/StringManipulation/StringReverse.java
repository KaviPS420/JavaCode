package StringManipulation;

public class StringReverse {
	
	
	public static String stringReverse(String s) {
		
		if (s == null) {
			return null;
		}
		if ( s.isBlank()|| s.isEmpty()) {
			return s;
		}
	 
		int len = s.length();
		if(s.length()==1) {
			return s;
		}
		
		String rev = "";
		for(int i = len-1; i>=0; i-- ) {
			rev = rev + s.charAt(i);
		
		}
		return rev;
		
	}

	public static void main(String[] args) {
		
		
		System.out.println(stringReverse("Testing"));
		//Test cases with all  conditions
		System.out.println(stringReverse(null));
		System.out.println(stringReverse("T"));
		System.out.println(stringReverse("Testing is My love"));
		System.out.println(stringReverse("What  I have exp is = 10 & more"));
		System.out.println(stringReverse("0Testing1"));
		
		
		
		
		
		

	}

}
