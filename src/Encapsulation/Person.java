package Encapsulation;

public class Person {
	
	private String name ; 
	private int age;
	private String Gender ;
	
	public String getName() {
		System.out.println("Name value = " + name);
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		System.out.println("Age = " + age);
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		System.out.println("Gender is  " + Gender);
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	
//	public void printInfo(String name , int age , String Gender ) {
//		System.out.println("All the information available here" + name + age + Gender );
//	}

}
