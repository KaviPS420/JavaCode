package OOPsInterface;

public class CollageTest {

	public static void main(String[] args) {
		
		CIT_Collage cit = new CIT_Collage();
		cit.administration();
		cit.application();
		cit.policies();
		cit.research();
		cit.innovations();
		cit.coreValues();
		cit.exam();
		cit.departments();
		cit.curriculum();
		cit.syllabus();
		cit.fee();
		cit.calc(3499, 5657);
		
		System.out.println("--------------------------");
		PSGCollage psg = new PSGCollage();
		psg.administration();
		psg.arts();
		psg.coreValues();
		psg.curriculum();
		psg.departments();
		psg.exam();
		psg.innovations();
		psg.research();
		psg.syllabus();
		psg.policies();
		psg.research();
		psg.fee();
		

	}

}
