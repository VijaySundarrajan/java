package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {

	
		BMW b =new BMW();
		b.start(); //inherited method
		b.stop(); //inherited method
		b.refuel(); //over riding method
		b.autoParking(); //individual method
		System.out.println("----------");
		Car cr = new BMW();
		
		cr.start();
		cr.stop();
		Car.carDisplay();
		cr.refuel();
		 
		
//		int a=1, b=2;
//		System.out.println(--b - ++a + ++b - --a);
		
		
		
	}

}
