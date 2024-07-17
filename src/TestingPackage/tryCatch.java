package TestingPackage;

public class tryCatch {
	
	
	
	String s = "Hello";
	String t = "hello";
	
      public void comp() {
    	  if (s.equalsIgnoreCase(t)) {
    		  System.out.println("Both are same");
    		  
    	  }else {
    		  System.out.println("Both are not same");
    		  
    	  }
      }
	
	

	public static void main(String[] args) {
		
		tryCatch st = new tryCatch();
		st.comp();
	
		try {
			int b = 9/0;	
		}catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Test1");
		}
		
		System.out.println("Test2");
	}
	
	
	
	

}
