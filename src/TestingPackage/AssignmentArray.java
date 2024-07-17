package TestingPackage;

import java.util.Arrays;

public class AssignmentArray {

	public static void main(String[] args) {
	
		int p[] = {1,4,5,2,3,22,31, 2}; 
		int a[]= new int[p.length-2];
		int j=0;
		int len=p.length;
		for(int i=0;i<=len-1;i++) {
			if(p[i]!=2) {
				 a[j]=p[i]; 
				 j++;
			}
		}
		
		System.out.println(Arrays.toString(p));
		System.out.println(Arrays.toString(a));
		
		
		
		//name, age, team name, DOB, gender, Strike Rate
		
		Object ob[]=new Object[6];
		ob[0] = "Kavitha";
		ob[1] = 35;
		ob[2]= "Mumbai Indiance";
		ob[3] = "3/5/1988";
		ob[4]= 'f';
		ob[5]= 10;
		
		
		Object ar[]=new Object[ob.length];
		
		
		for(Object e:ob){
			System.out.println(e);
			
		}
		
System.out.println(Arrays.toString(ob));

     
for(int o=0;o<=ob.length-1;o++) {
	System.out.println(ob[o]);
	
}
		

//ar = ob;
ar[0] = "Senthil";
ar[1] = 37;
ar[2]= "CSK";
ar[3] = "5/5/1986";
ar[4]= 'M';
ar[5]= 1;

Object br[] = new Object[6];
br[0] = "Ruhi";
br[1] = 8;
br[2]= "CSK";
br[3] = "4/22/2016";
br[4]= 'F';
br[5]= 3;
;

		for(int m=0;m<=ar.length-1;m++) {
			System.out.println(ar[m]);
		}
		
		
		
		
		for(Object e:br) {
			System.out.println(e);
		}
		
		System.out.println("--------------------");
		
		int ps[] = {1,3,4,5,22,56,89,90};
		
		
		for(int z=0;z<=ps.length-1;z++) {
			System.out.println(ps[z]);
		}
		
		System.out.println("-----For Each---------------");
		for(int e:ps) {
			System.out.println(e);
		}
		
		System.out.println("---------While-----------");
		
		int size = ps.length;
		int n=0;
		while(n<size) {
			System.out.println(ps[n]);
			n++;
		}
		System.out.println("-------do while-------------");
		
		int le=0;
		do {
			System.out.println(ps[le]);
			le++;
		}while(le<size);
		
		System.out.println("--------Reverse------------");
		
		for(int x=ps.length-1; x>=0;x--) {
			System.out.println(ps[x]);
		}
		
		
		
	
		
		

	}

}
