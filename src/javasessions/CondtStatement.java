package javasessions;

public class CondtStatement {

	public static void main(String[] args) {

		int x = 3;
		int y = 1;
		
		if (x>y) {
			System.out.println("pass");
			}
		
//		//dead code		
//		if (false) {
//			System.out.println("hi");
//		}
		
			String browser = "UC browser";
			if (browser.equals("chrome")) {
				System.out.println("yes, chrome browser launch");
			}
			if (browser.equals("edge")) {
				System.out.println("yes, edge browser launch");
			}
			if (browser.equals("Firefox")) {
				System.out.println("yes, firefox browser launch");
			} else {
				System.out.println("give correct key word");

			}
		 
	}
		
}
