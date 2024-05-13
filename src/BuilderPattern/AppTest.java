package BuilderPattern;

public class AppTest {

	public static void main(String[] args) {

		
		EcommApplication app =new EcommApplication();
		
		app.login("Vijay", "vj123")
			.search("iphone", "lavender")
				.addToCart("iphone")
					.payment("gri234")
						.getOrderId()
							.logout();
					
		
		app.login("admin2", "admin345", "admin")
			.search("rolex", "gold", 236546)
				.addToCart("rolex")
					.payment("869ygi89", 987)
						.getOrderId().logout();
		
		
		
		
		
		
		
		
	}

}
