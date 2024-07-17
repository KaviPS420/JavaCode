package LeetCodingPackage;

public class plusOne {

	public static void main(String[] args) {
		
		    int[]  digits = {8,2,3};
		        int len=digits.length;
		        System.out.println(len);
		        
		        for(int i=len-1;i>0;i--){
		            if(digits[i]!=9){
		                digits[i]=digits[i]+1;
		                //System.out.println(digits[i]);
		            }else{
		                digits[i]=0;

		            }
		        }

		int[] obj=new int[len+1];
		obj[0]=1;
		return;
		    
		

	}

}
