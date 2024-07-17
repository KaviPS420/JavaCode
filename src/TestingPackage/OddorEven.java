package TestingPackage;

public class OddorEven {
	
	public boolean oddOrEven(int num) {
		
		if(num%2==0) {
			System.out.println("Even number");
			return true;
		}else {
			
			System.out.println("Odd number");
			return false;
		}
	}
	
	//Convert into lower case 
	public String toLowercase(String s) {
		
		String res = s.toLowerCase();
		
		System.out.println(res);
		return res;
		
	}
	//String reverse using two different method
	public String stringReverse(String st) {
		StringBuilder str = new StringBuilder();
		str.append(st);
		str.reverse();	
		System.out.println(str);
		return str.toString();
		
	}
	
	//String reverse another method
	public char[] strReverse(String str1) {
		char[] st = str1.toCharArray();
		
		for(int i=str1.length()-1; i>=0; i--) {
			System.out.print(st[i]);
		}
		return st;
		
	}
	
	

	public static void main(String[] args) {
	
		OddorEven call = new OddorEven();
		call.oddOrEven(657);
		call.toLowercase("ERY TYUI");
		call.stringReverse("Where there is a Will");
		call.strReverse("There is a way");
		
		
	}
			
	}
	
	
	
	

	
	
	
	
	
	
	
	
	

