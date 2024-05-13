package OOP_Encapsulation;

public class EmpTest {

	public static void main(String[] args) {

		Employee e1 =new Employee("Harris",28,4565586);
		
		System.out.println(e1.getName()+ " "+ e1.getAge()+" "+ e1.getAccNo());
		
		e1.setAge(32);
		
		System.out.println(e1.getName()+ " "+ e1.getAge()+" "+ e1.getAccNo());

		Employee e2 =new Employee("jayshri", 3656545);
		
		System.out.println(e2.getName()+ " "+ e2.getAge()+" "+ e2.getAccNo());

		e2.setAge(29);
		
		System.out.println(e2.getName()+ " "+ e2.getAge()+" "+ e2.getAccNo());

	}

}
