package Launch;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Teson {

	@Test
	public void Launch() throws InterruptedException, IOException {
		
		System.out.println("Run");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector(".submit-button.btn_action")).click();
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("C:/Users/Dell/Desktop/Shraddha Training/vik.png"));
		driver.close();
		
	}
}
