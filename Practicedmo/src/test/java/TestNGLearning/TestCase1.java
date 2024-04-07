package TestNGLearning;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {
	
	@BeforeTest
	public void OpeningDBConnection() {
		System.out.println("Opening the DB connection");
	}
	@AfterTest
	public void closingDBConnection() {
		System.out.println("Closing the db connection");
	}
	@BeforeMethod
	public void Launchbrowser() {
		System.out.println("Launching browser");
	}
	
	@AfterMethod
	public void closeBrowser() {
		System.out.println("Closing the browser");
	}
	
@Test
(priority =1,groups="smoke")
	public void doUserRegistration() {

		System.out.println("Executing user reg test");
	}

	@Test
	(priority=2,groups="functional")
	public void doLogin() {

		System.out.println("Executing login test");
	}
}
