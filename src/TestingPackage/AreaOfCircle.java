package TestingPackage;

public class AreaOfCircle {
	
	public double area(double r) {
		
		//Area of circle = πr2
		
		double cir = Math.PI*r*r;
		System.out.println(cir);
		return cir;
		
		
	
		}
	//Circumference of circle = 2πr
	
	public double circum(float r) {
		double circ = 2*Math.PI*r ;
		System.out.println(circ);
	
		return circ;
	}
	
	

	public static void main(String[] args) {
		
		AreaOfCircle c = new AreaOfCircle();
		c.area(3);
		c.circum(3);
		
		
		
		
		
		
		
		
		
		
	}

}
