package TestingPackage;

public class AssignmentFunction {
	
	
	public int add(int a, int b) {
		
		int c = a+b;
		System.out.println(c);
		return c;
		
	}
	
	public int sub(int a , int b) {
		
		int c = a - b;
		System.out.println(c);
		return c;
	}
	public int mul(int a , int b) {
		int c = a* b;
		System.out.println(c);
		return c;
	}
	public double div(int a , int b) {
		double c = a/ b;
		System.out.println(c);
		return c;
	}
	
	
	public double prod(double a , double b) {
		double c = a* b;
		System.out.println(c);
		return c;
		
		
	}
	
	

	public static void main(String[] args) {
		
		AssignmentFunction a = new AssignmentFunction();
				a.add(27456 , 40);
				a.sub(50, 45);
				a.mul(8, 30);
				a.div(100007, 24);
				a.prod(33.67, 987.87);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
