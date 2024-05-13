package javasessions;

public class CallByRef {

	
	String name;
	int age;
	//char gender;
	
	
	
	public static void getinfo(CallByRef vj ){

		System.out.println(vj.name);
		System.out.println(vj.age);
		
		vj.name="prateek";
		vj.age=21;
		System.out.println(vj.name);
		System.out.println(vj.age);
		
	}
	
	
	public static void main(String[] args) {

		CallByRef obj = new CallByRef();
		obj.name="zara";
		obj.age=25;
		
		
		getinfo(obj);// call by referenc
		
		
		System.out.println(obj.name);
		System.out.println(obj.age);

		
		
		
		
		
		
		
		
		
		
	}

}
