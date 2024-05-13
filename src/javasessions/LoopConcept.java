package javasessions;

public class LoopConcept {

	public static void main(String[] args) {

		
		
		String s ="I am Batman";
		
		for (int i = 1; i <10; i++) {
			System.out.println(s+ " " +i);
			
		}
		
		// WAP to print 10 to 1 using for, while and do-while loop
		
		//while loop
		int i = 10;
		while (i>0) {
			
			System.out.println(i);
			i--;
			}
		//for loop
		
		for (int i1 = 10; i1 > 0; i1--) {
			System.out.println(i1);
		}
		
		//do while
		int a = 10;
		do {
			System.out.println(a);
			a--;
		} while (a>0);
		
		
		//Write a program in Java to print "Hello World" ten times using while loop
		
		String str ="Hello world";
		int k =1;
		while (k<=10) {
			System.out.println(str);
			k++;
		}
		
		//Write a program in Java to print all the multiplication of 5 from 1 to 100 using while /for/do-while loop
		//while loop
		int z =0;
		 while (z<=100) {
			 if (z%5==0) {
				 System.out.println(z);
					}
			 z++;
		}

		///for loop
		 for(int l=0;l<=100;l++) {
			 System.out.println(i);
		 }
		 for (byte j = 0; j <= 5; j++) {
			System.out.println(j);
		}
//		 for (double fh =2.00d;fh<8;) {
//			 System.out.println(fh);
//			 fh += 0.2;
//		 }
		for(char ch='a';ch<='z';ch++) {
			System.out.println(ch + "=" +(byte)ch);
		}
		int im = 1;
		 
		while (im<=10) {
			System.out.println("Hello World " + im);
			im++;
		}
		
//		 Print the following series: 
//		 1.0 2.0 3.0  ...... 10.0 
//		 0 9 18 27 36 …99

		for (float ff =0.0f;ff<=11;ff++) {
			int mi =  (int) (9 * ff);
			System.out.println(mi);
		}
		
		for (int cs =0; cs<=100;cs++) {
			if (cs %9 ==0) {
				System.out.println(cs);
			}
		}
		
//		int mx =1;
//		while(mx<=10) {
//			System.out.println(mx);
//			if mx
//		}
		
		
//Print 1 to 10 and break the loop once you find the multiplication of 7 with a message "bye, see you tomorrow".
		
		int x = 1;

		while(x<=10){
			System.out.println(x);
			

		if(x % 7 == 0){ 
			System.out.println("bye, see you tomorrow");
			break;

		}
		x++;

		}
		
		//Print only vowels (aeiou) using for and while loop. Start the loop from ‘a‘ to ‘z‘.
		char vowel[]= {'a','e','i','o','u'};
		for(char ch='a';ch<='z';ch++) {
			System.out.println(ch);
			for (int i1=0;i1<vowel.length;i1++) {
			if (ch == vowel[i1]) {
				System.out.println(ch +" It is Vowel");
			
		}
			
		}
	
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
