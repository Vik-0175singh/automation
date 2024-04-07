package collection;

public class ABC {

	public static void main(String[] args) {
		int num = 27776;

		int even_count = 0;
		int odd_count = 0;

		while (num > 0) {

			int rem = num%10;

			if (rem%2==0) {

				even_count++;
			} else {

				odd_count++;
			}
		
		}
		System.out.println("even count is "+even_count);
		System.out.println("even count is "+odd_count);

	}

}
