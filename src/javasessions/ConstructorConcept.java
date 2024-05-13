package javasessions;

public class ConstructorConcept {
	
	String name;
	int age;
	double salary;
	char gender;
	boolean isActive;
	
	public ConstructorConcept(String name, int age) {
		this("gf", 26, 15, 'f');//constructor chaining- calling one constructor from another constructor
		this.name=name;
		this.age =age;
	}
	public ConstructorConcept(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public ConstructorConcept(String name, int age, double salary, char gender) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.gender = gender;
	}
	
	public ConstructorConcept(String name, int age, double salary, char gender, boolean isActive) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.gender = gender;
		this.isActive = isActive;
	}
	public static void main(String[] args) {

		ConstructorConcept obj = new ConstructorConcept("quin", 45);
	
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.salary);
		System.out.println(obj.gender);

		
		
	}

}
