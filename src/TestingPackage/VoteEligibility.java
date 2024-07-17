package TestingPackage;

public class VoteEligibility {
	
	
	public boolean agebar(int age) {
		
		if(age>=18) {
			System.out.println("You are eligible to vote");
			return true;
		} else {
			System.out.println("You are not eligible to vote");
			return false;
		}
		
		
	}
		
	

	public static void main(String[] args) {
		
			VoteEligibility v = new VoteEligibility();
			v.agebar(12);
		

	}

}
