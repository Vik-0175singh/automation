package Covertopic;

import org.bouncycastle.util.Arrays;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

public class Stringpractice1 {

	static String st1 = "Vikash | singh@Sikarwar";

	public static void Calculate() {

		int a = 21;
		int b = 10;

		int c = a + b;
		int d = a - b;
		int e = a / b;
		int f = a % b;

		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
	}

	public static void compareStrings() {
		String str = "Vikash";
		String str1 = "vikash";
	

		System.out.println(str.equals(str1));
		System.out.println(str.contains(str1));
		System.out.println(str == str1);
		System.out.println(str.equalsIgnoreCase(str1));
	}

	public static void seperateString() {
		String[] array = st1.split("V");
		for (String s1 : array) {
			System.out.println(s1);
		}
	}

	public static void printChar() {
		String s2 = "Pari singh";

		/*
		 * for (int i=0;i<s2.length();i++) {
		 * 
		 * 
		 * } System.out.println(s2);
		 */

		char[] c = s2.toCharArray();

		for (char name : c) {
			System.out.print(name);

		}
	}

	public static void blank() {

		String st = "";
		System.out.println(st);

	}

	public static void Stringconversion() {
		int a = 12345;
		String name = "vikram";

		String s1 = Integer.toString(a);
		System.out.println(10 + 10 + s1 + 10 + 10);
		int b = Integer.parseInt(s1);
		System.out.println(b + 10);
		String s = String.valueOf(a);
		System.out.println(s + 10);
		System.out.println(name.concat(" kumar"));
		System.out.println(name);

		System.out.println(name.substring(2));
		System.out.println(name.substring(3, 6));
	}

	public static void reverseString() {
		String st1 = "vikash singh Sikarwar";

		String reverse = "";

		for (int i = st1.length() - 1; i >= 0; i--) {

			reverse = reverse + st1.charAt(i);

		}
		System.out.print(reverse);

	}

	public static void printCharacter() {

		String st2 = "Vikash singh";

		int count = 0;
		char[] a = st2.toCharArray();
		for (char c : a) {

			if (c == 's') {
				count++;
			}

		}
		System.out.println("count of s " + count);

	}

	public static void main(String[] args) {
		Stringpractice1.Calculate();
		Stringpractice1.compareStrings();
		Stringpractice1.seperateString();
		Stringpractice1.blank();
		Stringpractice1.Stringconversion();
		Stringpractice1.printChar();
		Stringpractice1.reverseString();
		Stringpractice1.printCharacter();
	}

}
