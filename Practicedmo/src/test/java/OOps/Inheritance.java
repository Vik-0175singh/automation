package OOps;

public class Inheritance {

	int sid;
	String name;
	Long rollnumber;

	public static void addvalue() {

		int a = 10;
		int b = 20;
		int sum = a + b;
		System.out.println(sum);

	}

	public void arrayContainsValue() {
		int arr2[] = { 10, 22, 34, 54, 36 };

		boolean found = false;
		for (int i = 0; i < arr2.length; i++) {

			if (arr2[i] == 44) {
				found = true;
			}
		}
		if (found) {
			System.out.println("value is present");
		}
	}

	public void vikash() {

		System.out.println("my name is vikash");
	}

	public void pari() {
		System.out.println("pari is my lovely daughter");

	}

	public static void main(String[] args) {

	}

}
