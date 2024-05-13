package javasessions;

import java.util.Arrays;

public class ArrayPrac {

	public static void main(String[] args) {

		int i[] = { 45, 18, 7, 10, 96, 93, 25 };
		System.out.println(i[2]);
		System.out.println("Size - " + (i.length - 1));
		System.out.println(i[i.length - 1]);
		System.out.println(Arrays.toString(i));

		boolean b = true;

//		boolean result = a && b;
//		System.out.println(result);
//
//		boolean resultVal = a & b;
//		System.out.println(resultVal);

		char ch[] = { 'a', 'e', 'i', 'o', 'u' };

		for (int j = 0; j < ch.length; j++) {
			System.out.println(ch[j]);
		}

		String s[] = new String[5];

		s[0] = "Vij";
		s[1] = "jack";
		s[2] = "sparrow";
		s[3] = "Batman";

		System.out.println(Arrays.toString(s));

		s[4] = "vjy";
		System.out.println(Arrays.toString(s));
		System.out.println("===========");

		// object Array

		Object empData[] = new Object[5];

		empData[0] = "Vijay";
		empData[1] = 26;
		empData[2] = 75000000;
		empData[3] = "CEO";
		empData[4] = 'M';

		System.out.println(Arrays.toString(empData));
		System.out.println("===========");

		Object vijData[] = { "Vijay", 26, "97597526", "Madurai", "bangalore" };
		System.out.println(Arrays.toString(vijData));
		System.out.println("===========");

		for (Object e : vijData) {
			System.out.println(e);

		}
		System.out.println("===========");
		for (String e : s) {
			System.out.println(e);
		}
		System.out.println("===========");
		String mobiles[] = { "iphone", "oneplus", "samsung", "Redmi" };
		int count = 0;
		for (String y : mobiles) {
			System.out.println(count + "-" + y);
			count++;
		}
		System.out.println("======Reverse order=====");
		// Reverse order
		int kanaku = mobiles.length - 1;
		for (String str : mobiles) {

			System.out.println(kanaku + " " + mobiles[kanaku]);
			kanaku--;
		}

		// System.out.println("===========");

		char alphaSmall[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

		for (char e : alphaSmall) {
			System.out.println(e + "=" + (byte) e);
		}

		// System.out.println(alphaSmall.getClass());
//		
//		

	}

}
