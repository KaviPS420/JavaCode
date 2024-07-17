package TestingPackage;

public class ClassandObject {

	String name;
	int age;

	public static void main(String[] args) {
		int total = 0;
		ClassandObject ob = new ClassandObject();
		ob.name = "Kavitha";
		ob.age = 35;
		total++;

		ClassandObject ob1 = new ClassandObject();
		ob1.name = "Ruhi";
		ob1.age = 8;
		total++;

		System.out.println(ob.name + "  " + ob.age);
		System.out.println(ob1.name + "  " + ob1.age);
		System.out.println(total);

		ob.age = 36;
		System.out.println(ob.name + "  " + ob.age);
		
		ClassandObject ob2 = new ClassandObject();
		ob2.name = "Senthil";
		ob2.age = 37;
		total++;
		System.out.println(ob2.name + " " +ob2.age);
		System.out.println(total);

	}

}
