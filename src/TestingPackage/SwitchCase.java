  package TestingPackage;

public class SwitchCase {

	public static void main(String[] args) {
	
		
		String env="Stage";
		
		switch (env) {
		
		case "QA":
				System.out.println("Qa Env running");
			break;
		case "Stage":
			System.out.println("Stage env is running");
			break;
		case "UAT":
			System.out.println("UAT env is running");
			break;
		case "Prod":
			System.out.println("Prod env is running");
			break;
		default:
			System.out.println("Dev env is running");
			break;
			
		}
		
		
		
		String carType="dsfnsd";
		
		switch(carType) {
		case "Mini":
			System.out.println("You selected Mini car typ");
			break;
		case "SUV":
			System.out.println("You selected SUV car typ");
			break;
		case "Sedan":
			System.out.println("You selected Sedan car typ");
			break;
		case "Premium":
			System.out.println("You selected Premium car type");
			break;
		default:
			System.out.println("Please select correct car type: ");
			break;
		}
		
		
		char ch='i';
		switch(ch){
			case 'a':
				System.out.println("Vowel");
				break;
			case 'e':
				System.out.println("Vowel");
				break;
			case 'i':
				System.out.println("Vowel");
				break;
			case 'o':
				System.out.println("Vowel");
				break;
			case 'u':
				System.out.println("Vowel");
				break;
				
			default:
				System.out.println("Consonant");
				   
		}
		
		
		String browser="ie";
		
		switch(browser) {
		case "chrome":
			System.out.println("chroem breowser");
			break;
		case "firefox":
			System.out.println("firefox browser");
			break;
		case "safari":
			System.out.println("safari browser");
			break;
		case "ie":
			System.out.println("IE browser");
			break;
		default :
			System.out.println("Please select correct browser");
			break;
			
		}
		
		

	}

}
