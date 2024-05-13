package BuilderPattern;

public class EcommApplication {

	public EcommApplication login(String un, String pwd) {
		System.out.println("logged in with " + un + pwd);
		return this;
	}

	public EcommApplication login(String un, String pwd, String role) {
		System.out.println("logged in with " + un + pwd + role);
		return this;

	}

	public EcommApplication search(String prodName) {
		System.out.println("search :" + prodName);
		return this;

	}

	public EcommApplication search(String prodName, String colur) {
		System.out.println("search :" + prodName + colur);
		return this;

	}

	public EcommApplication search(String prodName, String colur, int price) {
		System.out.println("search :" + prodName + colur + price);
		return this;

	}

	public EcommApplication addToCart(String prodName) {
		System.out.println("add to cart: " + prodName);
		return this;

	}

	public EcommApplication payment(String upi) {

		System.out.println("making payment via: upi" + upi);
		return this;

	}

	public EcommApplication payment(String cc, int cvv) {

		System.out.println("making payment via: cc" + cc);
		return this;

	}
	
	public EcommApplication getOrderId() {
		System.out.println("order is done, order id is "+5677678);
		return this;

	}
	
	
	public EcommApplication logout() {
		System.out.println("logged out");
		return this;

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
