package OOPsInterface;

public class CIT_Collage extends AnnaUniversity implements USAEduBoard, IndiaEduBoard , UKEduBoard{

	
	public void application() {
		
		System.out.println("CIT Collage ---- Application form");
		
	}
	public void admission() {
		
		System.out.println("CIT collage ---- Admission form");
		
	}
	@Override
	public void policies() {
		System.out.println("Education board Policies");
		
	}
	@Override
	public void syllabus() {
		System.out.println("UK Education syllabus");
		
	}
	@Override
	public void coreValues() {
		System.out.println("UK Education core value");
		
	}
	@Override
	public void curriculum() {
		System.out.println("Indin -  Curriculum");
		
	}
	@Override
	public void innovations() {
		System.out.println("Indin -  innovations");
		
	}
	@Override
	public void research() {
		System.out.println("USA ---- Research");
		
	}
	@Override
	public void administration() {
		System.out.println("USA ---- Administration");
		
	}
	
	public void fee() {
		System.out.println(" CIT collage --- fee");
	}
	
	public void calc(int fee , int donation) {
		int totalfee = fee + donation ;
		
		System.out.println("Your total fee is = " +totalfee);
	}
	
}
