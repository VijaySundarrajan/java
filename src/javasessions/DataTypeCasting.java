 package javasessions;

public class DataTypeCasting {

	public static void main(String[] args) {
		//Widening
		byte b = 10;
		int i = b;
		System.out.println(i);//10
		
		//Narrowing
		int p = 135;
		byte p1 = (byte) p;
		System.out.println(p1);//-121
		
		//long to float
		long l = 1000;
		float f1= l;
		
		System.out.println(f1);
		
		float f2= 14.96f;
		long l2=(long) f2;
		
		System.out.println(l2);
		
		double d=14785.0989787541;
		float f3=(float) d;
		System.out.println(d);
		System.out.println(f3);
		
		
		
		

	}

}
