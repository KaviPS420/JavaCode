package TestingPackage;

import java.util.Arrays;

public class ArrayConcept {

	public static void main(String[] args) {
		
		int[] num = new int[5];
		num[0] = 10;
		num[2] = 30;
		int num1[] = {10,20,30,40,50};

//		for(int i=0;i<num1.length;i++) {
//		
//			System.out.println(num1[i]);
//		}
		
		System.out.println(Arrays.toString(num1));
		
		char[] ch = new char[5];
		ch[0] = 'a';
		ch[1] = 'd';
		ch[2] = 'c';
		
		for(char e: ch) {
			System.out.println("values are " + e);
		}
	}

}
