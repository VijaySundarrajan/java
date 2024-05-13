package javasessions;

public class methodOverLoading {

	public void test() {
		System.out.println("test method");
	}
	public void test(int i) {
		System.out.println("method overload with 1 parameter" + i);
	}
	
	public void test(String s) {
		System.out.println(s+" method overload with string");
	}
	
	public void test(int im, String str ) {
		System.out.println("2 parameters method overload" + im + str);
	}
	
	public void test(String k, int z) {
		System.out.println("Method overload with different sequence " + k + z);
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
//		
		methodOverLoading obj = new methodOverLoading();
		
		obj.test();
		
		obj.test(1);
		
		obj.test("by string");
		
		obj.test(2, "hello");
		
		obj.test("bye", 3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
