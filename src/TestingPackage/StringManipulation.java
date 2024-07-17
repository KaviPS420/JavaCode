package TestingPackage;

public class StringManipulation {

	public static void main(String[] args) {
		String s = "This is Kavitha and i love briyani";
		System.out.println(s.indexOf("i"));
		int m = s.indexOf("i", s.indexOf("i")+1); 
		System.out.println(m);
		int n = s.indexOf("i", m+1);
		System.out.println(n);
		System.out.println(s.indexOf("i", n+1));
		
		
		boolean var1 = true;
		boolean var2 = false;
		System.out.println(var1 & var2);
		
		double x = 3.14;
		int y = (int)Math.ceil(x);
		System.out.println(y);
		
		
		 
		
		
		
		
		
		
		
		

	}

}
