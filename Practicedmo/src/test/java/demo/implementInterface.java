package demo;

public class implementInterface implements Interface1 {

	
	public  void login() {
	System.out.println("user is able to login");
		
	}

	@Override
	public void addCart() {
		System.out.println("i am able to add to cart");
		
	}
	
	public static void main(String[] args) {
		
		
		implementInterface implement = new implementInterface();
		implement.addCart();
		implement.login();
	}

}
