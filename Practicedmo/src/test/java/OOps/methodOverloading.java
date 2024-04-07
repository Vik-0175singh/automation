package OOps;

public class methodOverloading {

	String name;
	String schoolname;
	long rollnumber;
	
	public void personalDetails(String name,String schoolname) {
		
	}

	
	public void personalDetails(long rollnumer,String name) {
		
		System.out.println("roll number is "+rollnumer+" and name "+name);
	}

	
	public void personalDetails(String name,long rollnumer) {}
	
	public void personalDetails(long rollnumber) {}
	
	
	
	public static void main(String[] args) {
		
		methodOverloading mo = new methodOverloading();
		mo.personalDetails(374477474, "vikash");
;
		

	}

}
