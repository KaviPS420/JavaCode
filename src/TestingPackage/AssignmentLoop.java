package TestingPackage;

public class AssignmentLoop {

	public static void main(String[] args) {
		
		
		for(char ch='a';ch<='z';ch++) {
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				System.out.println(ch);
			}
		}
		
		char ch='a';
		System.out.println("while loop printing");
		while(ch<='z') {
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				System.out.println(ch);
			}
			ch++;
			
		}
		
		
		//print 1 to 10 and once you find multiply by 7 then say bye and break
		
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			if(i%7==0) {
				System.out.println("bye");
				break;
			}
			
		}
		
		int j=1;
		while(j<=10) {
			System.out.println(j);
			if(j%7==0) {
				System.out.println("See you tomorrow, bye");
			break;
			}
			j++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
