package demo;

public class Demo1  {

	String str1 = "vikash";
	String str2 = "sandy";
	String str3 = "pink";
	String str4 = "vivek";
	String s4 ="vikash/singh|sikarwar";
	
	
	
	public void Print() {

		
		/*
		 * int count = 0; for (int i =0;i<str1.length(); i++) {
		 * 
		 * System.out.print(str1.charAt(i));
		 */
		char[] st = str1.toCharArray();

		int count = 0;
		for (char str : st) {

			if (str == 'a') {
				count++;

			}
			System.out.println(str);

			// System.out.println("the count of a is :"+count);
		}

		System.out.println("Count of a:" + count);

	}
	// System.out.println("the count of a is :"+count);

	public static void Comparestring() {

		String s1 = "vikash";
		String s2 = new String("vikash");

		System.out.println(s1.equals(s2));
		System.out.println(s1.contains(s2));// partially check
		System.out.println(s1 == s2);// check on the basis of object creation
	}

	public void Seperate() {

		String[] array = s4.split("a");
		for (String string : array) {

			System.out.print(" " + string);
		}
		

	}
	
	public static void Substring() {
		
		String s1 = "pari";
		String st1 = s1.substring(2);
		System.out.print(st1);
	}

	public static void main(String[] args) {
		Demo1 d1 = new Demo1();
		d1.Print();

		Demo1.Comparestring();
		d1.Seperate();
		
		d1.Substring();
	
	}

}
