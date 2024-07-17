package StringManipulation;

public class StringReverseWordByWord {

	public static void main(String[] args) {
		
		
		String s = "This is Kavitha and I am looking for a job" ;
		
		String ss[] = s.split(" ");
		String rev = "";
		for (String e : ss) {
			
			rev = rev + StringReverse.stringReverse(e)+" ";
		}
		System.out.println(rev);
		
		

	}

}
