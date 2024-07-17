package TestingPackage;

public class Employee {
	
	String name;

	int age;

	double salary;

	

	public static void main(String[] args) {
		
		double totalSalary = 0;
		
		Employee e1 = new Employee();
		e1.name = "Krish";
		e1.age = 40;
		e1.salary = 3000;
		totalSalary = e1.salary;
		Employee e2 = new Employee();
		e2.name = "Dhiyaa";
		e2.age = 32;
		e2.salary=3650.79;
		totalSalary = totalSalary+e2.salary;
		
		Employee e3 = new Employee();
		e3.name = "Sasti";
		e3.age = 45;
		e3.salary = 5300;
		totalSalary = totalSalary+e3.salary;
	
		System.out.println(e1.name +" "+ e1.age +"  "+ e1.salary);
		System.out.println(e2.name +"  "+ e2.age + "  "+e2.salary);
		System.out.println(e3.name +"  "+ e3.age + "  "+e3.salary);
		System.out.println(totalSalary);
		
		e1.salary = 4073;
		System.out.println(e1.name +" "+ e1.age +"  "+ e1.salary);
		totalSalary=e1.salary+e2.salary+e3.salary;
		System.out.println(totalSalary);
		
		Employee e4 = new Employee();
		e4.name = "Ruhi";
		e4.age = 29;
		e4.salary = 3900;
		
		totalSalary = totalSalary+e4.salary;
		
		System.out.println(e4.name+ " "+ e4.age + " "+e4.salary);
		System.out.println(totalSalary);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
