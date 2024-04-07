package Launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/home");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id=\"session_key\"]")).sendKeys("48urjrj");
		driver.findElement(By.xpath("//input[@id=\"session_password\"]")).sendKeys("hfhfh");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

}
