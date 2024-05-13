package javasessions;

import java.util.ArrayList;
import java.util.Arrays;

public class FunctionsInJava {

	//no input no return
	public void test() {
		System.out.println("Testing");
	}
	
	//some input no return
	
	public void bill(int i)  //passing parameter// 
	{ 
		System.out.println("getting bill info");
		int finalAmount = i * 30;
		System.out.println(finalAmount);
	}
	 // input & return
	public int addition(int a, int b) {
		System.out.println("addition of two num");
		int sum = a +b;
		return sum;
	}
	//no input & return
	public String helllo() {
		String msg = "Hello dear";
		
		return msg;
	}
	
	public void empinfo()
	{
		System.out.println("getting emp info");
		return;  //blank return
	}	
	
	public  boolean isAppExist() {
		return true;
		
	}
	public String[] getDevices() {
		System.out.println("Getting devices info");
		String[] myDevice = {"iphone","mac", "j-book"};
		 
		return myDevice;
 	}
	
	public ArrayList<String> getUserList() {
		System.out.println("Getting users list");
		ArrayList<String> userList= new ArrayList<String>();
		userList.add("vidhun");
		userList.add("madhav");
		userList.add("veera");
		return userList;
		
	}
	
	

	public static void main(String[] args) {

		FunctionsInJava obj = new FunctionsInJava();
		obj.test();
		obj.bill(45);
		int s= obj.addition(7,18);
		System.out.println(s);
		System.out.println(obj.helllo());
		obj.empinfo();
		
		if (obj.isAppExist()) {
			System.out.println("App exists, login");
		}
		
		String devList[]=obj.getDevices();
		System.out.println(Arrays.toString(devList));
		System.out.println(devList.length);
		ArrayList<String> List1 = obj.getUserList();
		System.out.println(List1);
		List1.add("varun");
		System.out.println(List1);

		System.out.println(List1.size());
		
		List1.add("kesava");
		System.out.println(List1);

		System.out.println(List1.size());
		
		System.out.println(args[0]);
		
		
		
		
		
		
		
		
		
		
	}

}
