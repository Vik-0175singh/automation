package Launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dataProvider {
	@Test(dataProvider = "LoginDataProvider")
	public void loginTest(String Email, String Password) throws InterruptedException {

		System.out.println(Email + "" + Password);
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector(".submit-button.btn_action")).click();
		Thread.sleep(1000);
	}
	
	@DataProvider(name ="LoginDataProvider")
	public Object[] [] getData()
	{
		
		Object[][] data= {{"problem_user","secret_sauce"},{"performance_glitch_user","secret_sauce"},{"mona@gmail.com","secret_sauce"}};
		return data;
		
		

	}
}
