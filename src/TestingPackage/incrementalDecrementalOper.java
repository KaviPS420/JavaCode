package TestingPackage;

public class incrementalDecrementalOper {

	public static void main(String[] args) {
		
		//1) What will be the output of the following program?
		int i=11;
		i=i++ + ++i;
		System.out.println(i);
		
		//8.What is wrong with the below program? Why it is showing compilation error?
		// its because we can do arithmetic operations on variable not on values. also no two operation at a time. 
		//int i1 = 11;
//int j = --(i1++);
		
		
		//9.Guess the value of p in the below program?
		int m = 0, n = 0;
		int p = --m * --n * n-- * m--;
	System.out.println(p);
		
		//10.What will be the output of the following program?
int a=1;
a = a++ + ++a * --a - a--; 
System.out.println(a);
		
	//11.What will be the outcome of the below program? 
//int a1 = 11++;
//System.out.println(a1);
//Ans: Error, invalid argument to operaters 

//12.12) What will be the outcome of the below program?
int ch = 'A';

System.out.println(ch++);

//13) What will be the outcome of the below program?
char ch1 = 'A';

        System.out.println(++ch1);


//14) What will be the outcome of the below program?

double d = 1.5, D = 2.5;
System.out.println(d++ + ++D);
		
		
		
		
		
		

	}

}
