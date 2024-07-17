package Classwork;

public class CustomerTest {

	public static void main(String[] args) {
		Customer c = new Customer("Kavi", 35, 35326, true);
		System.out.println(c.getName()+ " " +  c.getAge()+ "  "+c.getSalary()+"  "+c.isActive());

	}

}
