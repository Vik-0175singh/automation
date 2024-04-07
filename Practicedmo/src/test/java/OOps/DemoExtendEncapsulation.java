package OOps;

public class DemoExtendEncapsulation {

	public static void main(String[] args) {
		
		TestEncapsulation test = new TestEncapsulation();
		test.setAge(29);
		test.setName("Vikash Singh");
		test.setPhonenumber(88267662);
		System.out.println(test.getAge());
		System.out.println(test.getName());
		System.out.println(test.getPhonenumber());

	}

}
