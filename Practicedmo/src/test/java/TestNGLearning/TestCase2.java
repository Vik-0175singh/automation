package TestNGLearning;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase2 {
@Test
	public void validateTitles() {

		

		System.out.println("Beginning");

		String expectedTitle = "google.com";
		String actualTitle = "gmail.com";

		SoftAssert softAssert = new SoftAssert();

		softAssert.assertEquals(actualTitle, expectedTitle);
		softAssert.assertTrue(false, "Button not found hence failing the test");
		softAssert.fail("Forcefully failing the test");
		/*
		 * if(expectedTitle.equals(actualTitle)) {
		 * 
		 * System.out.println("Test case pass"); }else {
		 * 
		 * System.out.println("Test case fail"); }
		 */

		System.out.println("Ending");

		softAssert.assertAll();

	

}

	
}
