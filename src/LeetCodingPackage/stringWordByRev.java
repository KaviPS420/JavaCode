package LeetCodingPackage;

import StringManipulation.StringReverse;

public class stringWordByRev {

	public static void main(String[] args) {
		
		
		String s = "This is Kavitha and I am looking for a job" ;
		int len = s.length();
		
		String ss[] = s.split(" ");
		String rev = "";
		for (String e : ss) {
			
			rev = rev + StringReverse.stringReverse(e)+" ";
			
		}
		for(int i = len-1; i>=0; i-- ) {
			rev = rev + s.charAt(i);
		
		}
		System.out.println(rev);
		
		
		

	}

}
