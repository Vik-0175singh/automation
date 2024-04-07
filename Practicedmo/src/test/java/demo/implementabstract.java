package demo;

public class implementabstract extends Creatabstract {

	public static void main(String[] args) {

		implementabstract abst = new implementabstract();
		abst.checkout();
		abst.pay();
	
	}

	@Override
	public void checkout() {
		System.out.println("user is able to checkout");

	}

	public static void pay() {
		payment();

	}
	
}
