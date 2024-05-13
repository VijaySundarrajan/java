package javasessions;

public class UserClass {

	String name;
	int age;
	String city;
	String company;

	public static void main(String[] args) {

		UserClass u1 = new UserClass();
		u1.name = "sundar";
		u1.age = 34;
		u1.city = "venice";
		u1.company = "soft garden";

		UserClass u2 = new UserClass();
		u2.name = "vive";
		u2.age = 28;
		u2.city = "franfrut";
		u2.company = "condor";

		UserClass u3 = new UserClass();
		u3.name = "vijay";
		u3.age = 24;
		u3.city = "texas";
		u3.company = "Tesla";

		UserClass u4 = new UserClass();
		u4.name = "vishnu";
		u4.age = 20;
		u4.city = "berlin";
		u4.company = "facebook";

		UserClass u5 = new UserClass();
		u5.name = "shibu";
		u5.age = 21;
		u5.city = "berlin";
		u5.company = "SPD";

		System.out.println("=================================");

		System.out.println(u1.name + " " + u1.age + " " + u1.city + " " + u1.company);
		System.out.println(u2.name + " " + u2.age + " " + u2.city + " " + u2.company);
		System.out.println(u3.name + " " + u3.age + " " + u3.city + " " + u3.company);
		System.out.println(u4.name + " " + u4.age + " " + u4.city + " " + u4.company);
		System.out.println(u5.name + " " + u5.age + " " + u5.city + " " + u5.company);

		u1 = u2;
		System.out.println("=================================");
		System.out.println(u1.name + " " + u1.age + " " + u1.city + " " + u1.company);
		System.out.println(u2.name + " " + u2.age + " " + u2.city + " " + u2.company);
		System.out.println(u3.name + " " + u3.age + " " + u3.city + " " + u3.company);
		System.out.println(u4.name + " " + u4.age + " " + u4.city + " " + u4.company);
		System.out.println(u5.name + " " + u5.age + " " + u5.city + " " + u5.company);

		u2 = u3;
		System.out.println("=================================");
		System.out.println(u1.name + " " + u1.age + " " + u1.city + " " + u1.company);
		System.out.println(u2.name + " " + u2.age + " " + u2.city + " " + u2.company);
		System.out.println(u3.name + " " + u3.age + " " + u3.city + " " + u3.company);
		System.out.println(u4.name + " " + u4.age + " " + u4.city + " " + u4.company);
		System.out.println(u5.name + " " + u5.age + " " + u5.city + " " + u5.company);
		u3 = u4;
		System.out.println("=================================");
		System.out.println(u1.name + " " + u1.age + " " + u1.city + " " + u1.company);
		System.out.println(u2.name + " " + u2.age + " " + u2.city + " " + u2.company);
		System.out.println(u3.name + " " + u3.age + " " + u3.city + " " + u3.company);
		System.out.println(u4.name + " " + u4.age + " " + u4.city + " " + u4.company);
		System.out.println(u5.name + " " + u5.age + " " + u5.city + " " + u5.company);
		
		u4=u5;
		System.out.println("=================================");
		System.out.println(u1.name + " " + u1.age + " " + u1.city + " " + u1.company);
		System.out.println(u2.name + " " + u2.age + " " + u2.city + " " + u2.company);
		System.out.println(u3.name + " " + u3.age + " " + u3.city + " " + u3.company);
		System.out.println(u4.name + " " + u4.age + " " + u4.city + " " + u4.company);
		System.out.println(u5.name + " " + u5.age + " " + u5.city + " " + u5.company);
		
		u5=u1;
		System.out.println("=================================");
		System.out.println(u1.name + " " + u1.age + " " + u1.city + " " + u1.company);
		System.out.println(u2.name + " " + u2.age + " " + u2.city + " " + u2.company);
		System.out.println(u3.name + " " + u3.age + " " + u3.city + " " + u3.company);
		System.out.println(u4.name + " " + u4.age + " " + u4.city + " " + u4.company);
		System.out.println(u5.name + " " + u5.age + " " + u5.city + " " + u5.company);
		
		
		
		
		
		
		
		
		
		
		
	}

}
