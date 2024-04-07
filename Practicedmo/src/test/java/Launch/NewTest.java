package Launch;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	public static WebDriver driver;

	@BeforeTest
	public void beforeTest() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	}

	@AfterTest
	public void afterTest() {
	//	driver.quit();
	}

}
