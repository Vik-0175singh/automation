package TestNGLearning;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase3 {

	@Test(priority = 1, groups = "sanity")
	public void doUserReg() {

		System.out.println("Executing User Reg Test");
		Assert.fail("User reg failed");
	}

	@Test(priority = 3, dependsOnMethods = { "doUserReg", "isSkip" }, groups = "sanity")
	public void doLogin() {

		System.out.println("Executing Login Test");
	}

	@Test(priority = 2, groups = "smoke")
	public void isSkip() {

		// throw new SkipException("Skipping the test as the condition is not met");

	}

}
