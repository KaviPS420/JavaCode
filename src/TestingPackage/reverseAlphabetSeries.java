package TestingPackage;

public class reverseAlphabetSeries {

	public static void main(String[] args) {
		
	for(char ch='z';ch>='a';ch--) {
		System.out.println(ch);
	}
	System.out.println("----------------");
	char re = 'z';
	while(re>='a') {
		System.out.println(re);
		re--;
	}
	
	
	
	
	//Floating Point Series: Write a Java program to print the series of floating-point numbers from 1.0 to 10.0.
	
	double start=1.0;
	double end = 10.10;
	double incr = 0.1;
	
	for(double d=start;d<=end;d=d+incr) {
		System.out.println(d);
		
	}
	
	//Multiples of 9 Series: Develop a Java program to print the series of numbers where each number is a multiple of 9, starting from 0 and ending at 99.
	int num=0;
	for(int i=num;i<=100;i++) {
		num=i*9;
		System.out.println(num);
		if(num==99) {
			break;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		

	}

}
