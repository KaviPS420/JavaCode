package TestingPackage;

import java.util.Arrays;

public class forEachc {

	public static void main(String[] args) {
		
		int i[] = new int [5];
		i[0] = 10;
		i[1] = 20;
		i[3] = 30;
		i[2] = 40;
		
		
		for (int e: i) {
			System.out.println(e);
		}
		
		System.out.println(Arrays.toString(i));
		
		int len = i.length;
		
		for (int j = 0; j<=len-1 ; j++) {
			System.out.println(i[j]);
		}
		
	}

}
