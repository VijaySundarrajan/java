package OOP_Encapsulation;

public class Employee {
	
	private String name;
	private int age;
	private int accNo;
	
	
	
	public Employee(String name, int age, int accNo) {
		this.name = name;
		this.age = age;
		this.accNo = accNo;
	}
	
	
	public Employee(String name, int accNo) {
		this.name = name;
		this.accNo = accNo;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	
	
	
	
		}
	
	
	
	
	
	

