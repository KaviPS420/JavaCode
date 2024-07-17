package OOPsInterface;

public class PSGCollage extends AnnaUniversity implements USAEduBoard , IndiaEduBoard , UKEduBoard{

	public void arts() {
		System.out.println("PSG Collange --- arts department");
	}
	
	
	public void Science() {
		System.out.println("PSG Collange --- Science department");
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
		System.out.println("Psg --- fee");
	}
	public void calc(int fee , int donation) {
		int totalfee = fee + donation ;
		
		System.out.println("Your total fee is = " +totalfee);
	}
	
}
