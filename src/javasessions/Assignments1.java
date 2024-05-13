package javasessions;

public class Assignments1 {

	public static void main(String[] args) {

		// 1. Write a Java program to add two strings:
		System.out.println(">>>>>>>>>>>>>ADD TWO STRINGS<<<<<<<<<<<<<<");
		String s = "Vijay S";
		String s1 = "M M";

		System.out.println(s + " " + s1);

		// 2. Write a Java program to print the sum of two numbers.
		System.out.println(">>>>>>>>>>>>>SUM OF TWO NUMBERS<<<<<<<<<<<");

		int a = 109;
		int b = 65;
		System.out.println(a + b);

		System.out.println(">>>>>>>>>ADD NUMBER AND CHAR<<<<<<<<<<<<<<<<");
		int i = 100;
		char c = '8'; // 56
		System.out.println(i + c);

		System.out.println("Increment problem");
		int ch = 'A';
		System.out.println(ch++);
		System.out.println(ch);
		// 3
		System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
		// Create three int variables having values like : 100, 200, 3400. Add them and
		// concatenate and generate this output String : 
		int p = 100, q = 200, r = 3400;

		System.out.println("Your tot amt is :" + (p + q + r));

// Write a program to add 3 to the ASCII value of the character 'd' and print
// the equivalent character.

		System.out.println((char) ('d' + 3));
		// Write a program to find the square of the number 3.9.

		float y = 3.9f;
		System.out.println(y * y);

		int i1 = 11;
		i1 = i1++ + ++i1;
		System.out.println(i1);// 24
		// System.out.println(0/0);

		int il = 9;
		if (il < 0) {
			System.out.println("Negative number");
		} else {
			System.out.println("Positive number");

		}

		int ly = 86;
		if (ly % 2 == 0) {

			System.out.println("Number is even");
		} else {
			System.out.println("Number is odd");
		}

// Vowel- switch case

		char c1 = 'v';

		switch (c1) {
		case 'a':
			System.out.println("a is vowel");
			break;
		case 'e':
			System.out.println("e is vowel");
			break;
		case 'i':
			System.out.println("i is vowel");
			break;
		case 'o':
			System.out.println("o is vowel");
			break;
		case 'u':
			System.out.println("u is vowel");
			break;

		default:
			System.out.println(c1 + " is consonant");
			break;

		}

//		for ( ;  ;   ) {
//			System.out.println("bye");
//			break;

// Q1.a : Find out the greatest number out of three different given numbers:

		int a1 = 470;
		int b1 = 986;
		int c2 = 1875;
		int d1 = 85;

		if (a1 > b1 && a1 > c2 && a1 > d1) {
			System.out.println("a1 is greatest");
		} else if (b1 > c2 && b1 > d1) {
			System.out.println("b1 is greatest");
		} else if (c2 > d1) {
			System.out.println("c2 is greatest");
		} else {
			System.out.println("d1 is greatest");
		}

//2. Write a Java program to test a number is positive or negative.
		int ui = -98;

		if (ui < 0) {
			System.out.println("It is negative number");
		} else {
			System.out.println("It is positive number");

		}
//WAP to check number is odd or even using If - Else	
		int r1 = 8;

		if (r1 % 2 != 0) {
			System.out.println("Odd num");
		} else {
			System.out.println("Even num");
		}
//WAP to run your test cases in a specific environment like: QA, Stage, Dev, UAT, Prod using using Switch - Case
		String env = "vij";
		switch (env) {
		case "Dev":
			System.out.println("This dev environment");
			break;
		case "QA":
			System.out.println("This QA environment");
			break;
		case "UAT":
			System.out.println("This UAT environment");
			break;
		case "Prod":
			System.out.println("This Prod environment");
			break;

		default:
			System.out.println("pass correct environment");
			break;
		}
		
		//
		int x1 = 5;
        int y1 = 10;

        if (x1 > 0 && y1 > 0 && x1 < y1 && x1 * 2 < y1) {
            System.out.println("Hi");
        }
        
        if (x1 > 0 & y1 > 0 & x1 < y1 & x1 * 2 < y1) {
            System.out.println("Hello");
        }
		
//        int z = 1;
//
//        while(z<=1){
//
//        System.out.println("Hi Java");
//
//        }
		
		
		
		int str = 1;
		for(;str <=10;str++) {
			System.out.println("I'm Billonaire " + str);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
