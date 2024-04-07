package Launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Error {
@Test	
public void error() throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	driver.findElement(By.id("inputUsername")).sendKeys("Vikash");
	driver.findElement(By.name("inputPassword")).sendKeys("viks");
	driver.findElement(By.cssSelector(".submit.signInBtn")).click();
	Thread.sleep(1000);
	System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
	Assert.assertEquals(driver.findElement(By.cssSelector("p.error")).getText(), " Incorrect username or password");
}

}
