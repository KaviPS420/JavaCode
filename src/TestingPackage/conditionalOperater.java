package TestingPackage;

public class conditionalOperater {

	public static void main(String[] args) {
		//Find out greatest number in 3 values
		
		int a=4725,b=758,c=8897;
		
		if(a>b&&a>c) {
		   System.out.println("a is greater then b and c. a = " + a);
		   
		} else if(b>c) {
			System.out.println("b is greater then a and c. b = " + b);
			   
		}else {
			System.out.println("c is greater then b and a, c = " + c);
			   
		}
		
		
		
		
		int d=725,e=708,f=587,g=97;
		
		if(d>e&&d>f&&d>g) {
			System.out.println("d is greater " + d);
			   
		}else if(e>f&&e>g){
			System.out.println("e is greater " + e);
			   
			
		}else if(f>g) {
			System.out.println("f is greater f " + f);
			   
		}else {
			System.out.println("g is greater g= " + g);
			   
		}
		
		
		short t=-3;
		
		if(t>0) {
			System.out.println("Positive number");
		}else if(t<0){
			System.out.println("Negative number");
			   
		}else {
			System.out.println("Value is 0");
			   
		}
		
		
		int k=29;
		if(k%2==0) {
			System.out.println("k is even number");
			   
			
		}else {
			System.out.println("Odd number");
			   
		}
		
		
		String browser="chrome";
		if(browser.equals("chrome")) {
			System.out.println("crome browser");
		}else if(browser.equals("firefox")) {
			System.out.println("firefox browser");
		}else if(browser.equals("ie")) {
			System.out.println("ie browser");
		}else if(browser.equals("safari")) {
			System.out.println("safari");
		}else {
			System.out.println("Enter correct browser");
		}
		
		
		
		
		
		
		
		
		
		
			
		}
		
		
		
		

	}




