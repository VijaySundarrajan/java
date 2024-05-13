package javasessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

		System.out.println('A' + "Hello");

		ArrayList<Object> ar = new ArrayList<Object>();

		ar.add("Vijay");
		ar.add(1000);
		System.out.println(ar.size());

		System.out.println(ar);

		ar.add(1950.45);
		System.out.println(ar);
		ar.add('x');

		System.out.println(ar);
		ar.add(700);
		System.out.println(ar);

		// empName

		ArrayList<String> empName = new ArrayList<String>();
		empName.add("CEO");
		empName.add("Vijay");
		System.out.println(empName);

		empName.add("varun");
		empName.add("yogith");

		System.out.println(empName);

		System.out.println(empName.size());

		System.out.println(empName.get(1));

		empName.add(0, "MD");// add datas
		System.out.println(empName);
		empName.remove(3);// remove items
		System.out.println(empName);

		// empName.equals(empName);

		ArrayList<String> browserList = new ArrayList<String>(Arrays.asList("chrome", "uc browser", "opera"));

		System.out.println(browserList);

		ArrayList<String> browserList1 = new ArrayList<String>() {
			{
				add("firefox");
				add("iE");
				add("brave");
			}
		};
		System.out.println(browserList1);

		browserList.addAll(browserList1);
		System.out.println(browserList);

		System.out.println(browserList.containsAll(browserList1));
		Collections.sort(browserList);
		System.out.println(browserList);

		ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(45, 10, 165, 420, 245));
		System.out.println(arr);
		Collections.sort(arr);
		System.out.println(arr);

		Collections.swap(arr, 0, 4);
		System.out.println(arr);

		List<Integer> numberList = new ArrayList<Integer>();
		numberList.add(45);
		System.out.println(numberList);

		List<String> b1 = Collections.emptyList();
		System.out.println(b1.size());
		// b1.add("78");

	}

}
