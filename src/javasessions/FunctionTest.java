package javasessions;

import java.util.ArrayList;

public class FunctionTest {
//if else with multiple return
	public int getStudMark(String studentName) {

		System.out.println("Getting student mark of: " + studentName);

		if (studentName.equalsIgnoreCase("jack")) {
			return 96;
		} else if (studentName.equalsIgnoreCase("hulk")) {
			return 80;
		} else if (studentName.equalsIgnoreCase("peter")) {
			return 92;
		} else {
			System.out.println("pass right student name, not found any " + studentName);
			return -1;
		}

	}

	// if else with single return
	public int getMark(String studentName) {
		System.out.println("Getting student mark of: " + studentName);
		int marks = -1;
		if (studentName.equalsIgnoreCase("jack")) {
			marks = 96;

		} else if (studentName.equalsIgnoreCase("hulk")) {
			marks = 67;

		} else if (studentName.equalsIgnoreCase("peter")) {
			marks = 57;
		} else {
			System.out.println("plz pass right stud name");
		}
		return marks;
	}

	// switch case in function/method:
	public boolean launchBrowser(String browserName) {
		System.out.println("Launching " + browserName);
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			System.out.println("chrome browser launched");
			return true;
		case "edge":
			System.out.println("edge browser launched");
			return true;
		case "firefox":
			System.out.println("firefox browser launched");
			return true;

		default:
			System.out.println("Plz pass the right browser... " + browserName + " not found");
			return false;
		}
	}
//ArraList
		public ArrayList<String> getdeviceList ( String empName) {
			System.out.println("getting device list "+ empName);
			ArrayList <String> devicesList = new ArrayList <String>();
			switch (empName.toLowerCase().trim()) {
			case "dhivya":
				devicesList.add("Hp laptop");
				devicesList.add("innovo mobile");
				devicesList.add("tata tv");
				return devicesList;
				
			case "priya":
				devicesList.add("honda laptop");
				devicesList.add("tata sky mobile");
				devicesList.add("colgate tv");
				return devicesList;	
			default:
				System.out.println("plz pass right name");
				return devicesList;
			}
		}
	

	

	public static void main(String[] args) {

		FunctionTest obj = new FunctionTest();
		int m1 = obj.getMark("peter");

		System.out.println(m1);
		boolean isLaunched = obj.launchBrowser("opera");
		System.out.println(isLaunched);
		if (isLaunched) {
			System.out.println("enter URL");
		}
		ArrayList<String> devList = obj.getdeviceList("dhivya");
		System.out.println(devList);
		System.out.println(devList.size());
		
		
	}

}
