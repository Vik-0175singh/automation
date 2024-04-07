package OOps;

public class implementInterface extends TestAbstract implements TestInterface, TestInterface2 {

	@Override
	public void test() {
		System.out.println("My name is vikash");

	}

	@Override
	public void test1() {
		System.out.println("My name is vikash");

	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub

	}

	@Override
	public void TestInterface1() {
		// TODO Auto-generated method stub

	}

	@Override
	public void TestInterface2() {
		// TODO Auto-generated method stub

	}

	@Override
	public void testInterface3() {
		// TODO Auto-generated method stub

	}

	@Override
	public void testInterface4() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		
		implementInterface im = new implementInterface();
		im.test();
		im.test1();

	}


}
