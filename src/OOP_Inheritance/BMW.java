package OOP_Inheritance;

public class BMW extends Car {
	
	
	@Override
	public void start() {
		System.out.println("BMW -- start");
	}
	@Override
	public void stop() {
		System.out.println("BMW -- stop");
	}
	
	@Override
	public void refuel() {
		System.out.println("BMW -- Refuel");
	}
	
	public void autoParking() {
		System.out.println("BMW -- Auto parking");
	}
	 
	public static void carDisplay() {
		System.out.println("BMW -- display");
	}
	
	

}
