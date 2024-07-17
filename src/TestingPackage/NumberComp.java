package TestingPackage;

public class NumberComp {

	public void max(int a , int b , int c){
		
		if (a>b && a>c ) {
			System.out.println("A is greater");
		}else if(b>a && b>c) {
			System.out.println("B is greter");
			
		}else {
			System.out.println("C is greater");
		}
		
	}
	
	public void min(int a, int b , int c) {
		if(a<b && a<c) {
			System.out.println("a is smaller number");
		}else if(b<a && b<c) {
			System.out.println("b is smaller number");
		}else {
			System.out.println("c is smaller number");
		}
	}
	
	
	public boolean oddOrEven(int num) {
		if(num/2==0) {
			System.out.println("Even number");
		}
			else {
			System.out.println("Odd number");
					}
		return true;
	}
	
	
	
	public static void main(String[] args) {
		
		NumberComp ma = new NumberComp();
		ma.max(19750,400, 7945720);
		ma.min(34986, 6740, 3000025);
		ma.oddOrEven(8);
		
		
		
		
	}

}
