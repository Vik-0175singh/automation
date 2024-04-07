package Covertopic;

public class Stringpractice2 {

	static int num1 = 27;
	int num2 = 7;

	public static void numberDivisible() {

		/*
		 * for(int i=1;i<+100;i++) {
		 * 
		 * if (i%5==0) {
		 * 
		 * System.out.println(i+ " is divisible by 5" ); } }
		 */

		for (int i = 5; i <= 100; i += 5) {

			System.out.println(i + " is divisible by 5");
		}

	}

	public static int create() {
		int a = 10;
		int b = 20;
		int sum = a + b;
		System.out.println(sum);
		return sum;

	}

	public void playwithStaticvariable() {
		num1 = 65;
		num2 = 8;

	}

	public void swappingnumbers() {

		int num4 = 22;
		int num5 = 27;

		/*
		 * int d = num4; num4=num5; num5=d;
		 * 
		 * System.out.println("value of num4 "+num4);
		 * System.out.println("value of num5 "+num5);
		 */

		num4 = num4 + num5;
		num5 = num4 - num5;
		num4 = num4 - num5;
		System.out.println("value of num4 " + num4);
		System.out.println("value of num5 " + num5);

	}
	
	public void reverseNumber() {
		
		int num = 234566;
		
		int rev=0;
		while (num!=0) {
			
			rev =rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
	}
	
	public void removeJunk() {
		
		String s3 = "# vikash&^% 00393 singh";
		s3 = s3.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s3);
	}

	public static void main(String[] args) {
		Stringpractice2.numberDivisible();
		Stringpractice2.create();
		Stringpractice2 sp = new Stringpractice2();

		sp.playwithStaticvariable();
		sp.swappingnumbers();
		sp.reverseNumber();
		sp.removeJunk();
		

	}

}
