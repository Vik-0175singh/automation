package Launch;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Invalid extends NewTest{
	@Test
	public void log() {
		
		beforeTest();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_sauc");
		driver.findElement(By.cssSelector(".submit-button.btn_action")).click();
		System.out.println("error message is displayed");
		
	}

}
