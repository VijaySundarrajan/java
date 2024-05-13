package javasessions;

public class ClassDemo {
	//category- blueprint -class ---prototype
	//in category--->create instance --->as object
	//human ---class
	//properties (object)---name, address,

	String name;
	int age;
	String city;
	double salary;
	static String company="Google"; 
	
	
	public static void main(String[] args) {
		
	ClassDemo c = new ClassDemo(); // RHS = object
	c.name="vijay";
	c.age=25;
	c.city="San andreas";
	
	System.out.println(c.name+" "+c.age+" "+c.city+" "+ company);
	
	System.out.println(company);
	System.out.println(ClassDemo.company);
	
	
	ClassDemo c1= new ClassDemo();
	c1 = null;
	//c1.age =85;
	//System.out.println(c1.age);
	
	
		

	}

}
