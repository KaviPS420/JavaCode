package TestingPackage;

public class ExceptionHandlingConcept {

	public static void main(String[] args) {
		
		System.out.println("A");
		try {
			int i=9/0;
		}
		catch (ArithmeticException e) {
			System.out.println("AE exception");
		}
		
		System.out.println("bye");
		
		
		

	}

}
