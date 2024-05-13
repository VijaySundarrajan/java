package javasessions;

import java.util.Arrays;

public class ArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i[] = new int[4];
		i[0] = 7;
		i[1] = 10;
		i[3] = 45;
		i[2] = 55;
System.out.println(i[0]);
		System.out.println(Arrays.toString(i));

		Object data[] = new Object[5];
		data[0] = 1;
		data[1] = "Vijay S";
		data[2] = 26;
		data[3] = 1597860;
		data[4] = "Bussiness man";

		System.out.println(Arrays.toString(data));

  char[] upperCaseChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		  
		  System.out.println(Arrays.toString(upperCaseChars));

	        char[] lowerCaseChars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
			  System.out.println(Arrays.toString(lowerCaseChars));

	        char[] digitChars = "0123456789".toCharArray();
			  System.out.println(Arrays.toString(digitChars));

			  
		      // Print A-Z and their ASCII values using for-each loop

		        for (char ch : upperCaseChars) {

		            System.out.println(ch + ": " + (int) ch);

		        }

		        // Print a-z and their ASCII values using for-each loop

		        for (char ch : lowerCaseChars) {

		            System.out.println(ch + ": " + (int) ch);

		        }

		        // Print 0-9 and their ASCII values using for-each loop

		        for (char ch : digitChars) {

		            System.out.println(ch + ": " + (int) ch);}
	}

}
