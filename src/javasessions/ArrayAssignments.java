package javasessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayAssignments {

	public static void main(String[] args) {

		int a[] = { 1, 4, 5, 2, 3, 22, 31, 2 };
		// [1, 4, 5, 2, 3, 31, 2]

		int p[] = new int[a.length - 1];

		int j = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 22) {
				p[j] = a[i];
				j++;
			}

		}
		System.out.println(Arrays.toString(p));

//		 Q2: Write a program to create a static Array, having following cricket data:
//		  --name, age, team name, DOB, gender, Strike Rate
//		  --Try to create multiple Object Arrays for different players 
//		  --Try to print all the values of each player on the console
		
		//Object gen[] =
		
		ArrayList<Object> player1 = new ArrayList<Object>(Arrays.asList("shewaq",31,"india","24-5-1975",'m',158.98));
		ArrayList<Object> player2 = new ArrayList<Object>(Arrays.asList("sachin",32,"india","24-4-1972",'m',118.15));
		ArrayList<Object> player3 = new ArrayList<Object>(Arrays.asList("ganguly",29,"india","2-4-1978",'m',136.24));
		ArrayList<Object> player4 = new ArrayList<Object>(Arrays.asList("dhoni",22,"india","7-7-1981",'m',186.24));
		ArrayList<Object> player5 = new ArrayList<Object>(Arrays.asList("rohit",20,"india","28-6-1983",'m',176.24));

		System.out.println(player1);
		System.out.println(player2);
		System.out.println(player3);
		System.out.println(player4);
		System.out.println(player5);

		
		for (Object e : player5) {
			System.out.println(e);
			
		}

		
	}

}
