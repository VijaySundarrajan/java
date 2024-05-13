package javasessions;

public class MethodChaining {
	// static methods

	public static void hhh() {
		// return"hello";
	}

	public static void t1() {
		System.out.println("t1 method");
		t2();
	}

	public static void t2() {
		System.out.println("t2 method");
		t3();
	}

	public static void t3() {
		System.out.println("t3 method");

	}

	// non static methods
	public void m1() {
		System.out.println("m1 method");
		m3();
	}

	public void m2() {
		System.out.println("m2 method");
	}

	public void m3() {
		System.out.println("m3 method");
		m2();
	}

	public static void main(String[] args) {

		MethodChaining.t1();
		t2();
		MethodChaining obj = new MethodChaining();
		obj.m1();

		hhh();
	}

}
